# Montaje de referencia y protocolo

## Placa base

Arduino UNO R3, ATmega328P, potenciómetro de 10 kΩ, pulsador y cable USB de datos. El LED de salida es el incorporado. Verifica la placa física: no extrapoles esta tabla a UNO R4 o ESP32.

| Elemento | Conexión UNO R3 |
|---|---|
| Extremo 1 del potenciómetro | 5 V |
| Extremo 2 del potenciómetro | GND |
| Cursor del potenciómetro | A0 |
| Pulsador | Entre D2 y GND |
| D2 | INPUT_PULLUP, pulsado equivale a LOW |
| Salida | LED_BUILTIN |

Desconecta USB al cambiar cables. No conectes tensión externa al potenciómetro. No alimentes motores o relés desde un pin. Comprueba el límite eléctrico en la documentación de cada componente.

## Protocolo v1

| Sentido | Trama sin el LF final | Significado |
|---|---|---|
| Placa a PC | `DATA;42;512` | Secuencia y ADC de UNO R3 |
| PC a placa | `SET;LED;1` | Solicita encendido |
| Placa a PC | `ACK;LED;1` | Confirma estado aplicado |
| Placa a PC | `ERR;CMD` | Comando inválido |

115200 baudios, 8N1, ASCII, LF y máximo 80 caracteres. El receptor Java admite CR antes de LF. El firmware usa un buffer fijo y recuperación tras línea excedida. El sketch integrado está en `firmware/campus_monitor/`.

La secuencia uint32_t permite detectar discontinuidades, pero puede reiniciarse o desbordarse. Crea una sesión de captura al conectar y define cómo detectas un reinicio durante esa sesión. El protocolo no correlaciona solicitudes concurrentes: permite un solo comando pendiente. El pulsador también puede emitir ACK como actualización de estado.

## Adaptación ESP32

Elige una placa exacta y consulta su pinout. No conectes 5 V a entradas de lógica 3.3 V. Reubica pines reservados, ajusta resolución y atenuación ADC, calibra según el modelo y actualiza el rango del parser. Si cambias el significado del campo raw o la estructura, documenta la variante del protocolo. Wi-Fi o BLE son extensiones posteriores; la ruta base del curso sigue siendo serial.

## Pruebas físicas

El material incluye firmware y pruebas de software simuladas. La comprobación eléctrica, carga a la placa y ensayo del enlace USB deben realizarse con el hardware real. Una simulación correcta no verifica el cableado ni el dispositivo.
