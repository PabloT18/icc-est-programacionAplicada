#include <Arduino.h>
#include <string.h>
constexpr uint8_t PIN_SENSOR=A0;
constexpr uint8_t PIN_BOTON=2;
constexpr unsigned long PERIODO=500;
constexpr unsigned long REBOTE=30;
char buffer[81];
uint8_t usados=0;
bool descartar=false;
bool encendido=false;
uint32_t secuencia=0;
unsigned long anterior=0,cambio=0;
int ultima=HIGH,estable=HIGH;
void confirmarLed(bool valor) {
  encendido=valor;digitalWrite(LED_BUILTIN,valor?HIGH:LOW);
  Serial.print("ACK;LED;");Serial.println(valor?1:0);
}
void comando() {
  buffer[usados]='\0';
  if(strcmp(buffer,"SET;LED;1")==0)confirmarLed(true);
  else if(strcmp(buffer,"SET;LED;0")==0)confirmarLed(false);
  else Serial.println("ERR;CMD");
}
void setup() {
  Serial.begin(115200);pinMode(LED_BUILTIN,OUTPUT);pinMode(PIN_BOTON,INPUT_PULLUP);
}
void loop() {
  // Procesar como máximo 32 bytes por iteración para no monopolizar loop.
  uint8_t presupuesto=32;
  while(Serial.available()>0 && presupuesto-->0) {
    char c=static_cast<char>(Serial.read());
    if(c=='\n') {
      if(usados>0 && buffer[usados-1]=='\r')usados--;
      if(descartar)Serial.println("ERR;CMD");else comando();
      usados=0;descartar=false;
    } else if(!descartar) {
      if(usados>=80 || static_cast<uint8_t>(c)>127 || (c<32 && c!='\r')) {descartar=true;usados=0;}
      else buffer[usados++]=c;
    }
  }
  unsigned long ahora=millis();
  int lectura=digitalRead(PIN_BOTON);
  if(lectura!=ultima){ultima=lectura;cambio=ahora;}
  if(ahora-cambio>=REBOTE && lectura!=estable) {
    estable=lectura;if(estable==LOW)confirmarLed(!encendido);
  }
  if(ahora-anterior>=PERIODO) {
    anterior=ahora;
    Serial.print("DATA;");Serial.print(secuencia++);Serial.print(';');Serial.println(analogRead(PIN_SENSOR));
  }
}
