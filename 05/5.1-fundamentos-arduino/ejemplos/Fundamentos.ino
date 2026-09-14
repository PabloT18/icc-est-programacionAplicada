#include <Arduino.h>
constexpr uint8_t PIN_SENSOR = A0;
constexpr unsigned long PERIODO_MS = 500;
unsigned long anterior = 0;
uint16_t porcentaje(uint16_t raw) {
  return static_cast<uint16_t>((static_cast<uint32_t>(raw) * 100U) / 1023U);
}
void setup() {
  Serial.begin(115200);
  pinMode(LED_BUILTIN, OUTPUT);
}
void loop() {
  unsigned long ahora = millis();
  if (ahora - anterior >= PERIODO_MS) {
    anterior = ahora;
    uint16_t raw = analogRead(PIN_SENSOR);
    Serial.print("RAW="); Serial.print(raw);
    Serial.print(";PCT="); Serial.println(porcentaje(raw));
    digitalWrite(LED_BUILTIN, raw > 512 ? HIGH : LOW);
  }
}
