#include <Arduino.h>
constexpr uint8_t PIN_BOTON = 2;
constexpr unsigned long REBOTE_MS = 30;
int ultimaLectura = HIGH;
int estable = HIGH;
unsigned long cambio = 0;
bool encendido = false;
void setup() {
  pinMode(PIN_BOTON, INPUT_PULLUP);
  pinMode(LED_BUILTIN, OUTPUT);
  Serial.begin(115200);
}
void loop() {
  int actual = digitalRead(PIN_BOTON);
  unsigned long ahora = millis();
  if (actual != ultimaLectura) { cambio = ahora; ultimaLectura = actual; }
  if (ahora - cambio >= REBOTE_MS && actual != estable) {
    estable = actual;
    if (estable == LOW) {
      encendido = !encendido;
      digitalWrite(LED_BUILTIN, encendido ? HIGH : LOW);
      Serial.print("LED="); Serial.println(encendido ? 1 : 0);
    }
  }
}
