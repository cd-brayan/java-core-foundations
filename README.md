# Java Core Foundations & Control Structures

Repositorio enfocado en la consolidación de fundamentos de programación, lógica algorítmica y programación orientada a objetos (POO) en Java.

## 📁 Módulos del Repositorio

### [Módulo 01: Facturación y Órdenes de Compra (`01-facturacion-orden-compra`)]
* **Archivo:** `FacturaApplet.java`
* **Lógica implementada:** 
  * Captura y validación de datos de cliente y productos.
  * Operaciones aritméticas para cálculo de valor unitario, cantidades y subtotal por renglón.
  * Acumuladores para el cálculo del valor total general de compra.
  * Manejo de eventos de interfaz de usuario para cálculo reactivo.

### [Módulo 02: Eventos y Manipulación de Estado en UI (`02-eventos-interfaz-grafica`)]
* **Archivo:** `formApplet.java`
* **Lógica implementada:**
  * Implementación de interfaces de escucha de eventos (`ActionListener`).
  * Captura de acciones de usuario sobre botones de comando (`actionPerformed`).
  * Manipulación reactiva de propiedades de interfaz gráfica y renderizado visual en tiempo de ejecución.

### [Módulo 03: Conversión de Unidades de Tiempo (`03-conversion-unidades-tiempo`)]
* **Archivo:** `TiempoApplet.java`
* **Lógica implementada:**
  * Captura de datos temporales mediante campos de entrada de usuario (`JTextField`).
  * Algoritmo de conversión secuencial de días a unidades de tiempo (horas, minutos y segundos).
  * Renderizado reactivo de resultados en interfaz gráfica mediante `ActionListener`.
  * Refactorización a arquitectura moderna nativa `JFrame` desacoplada de `JApplet`.

### [Módulo 04: Clasificación y Renderizado Geométrico de Triángulos (`04-clasificacion-triangulos`)]
* **Archivo:** `TrianguloApplet.java`
* **Lógica implementada:**
  * Captura de dimensiones geométricas (lados y altura) mediante campos de texto Swing.
  * Algoritmo de clasificación trigonométrica y cálculo de ángulos internos y superficie.
  * Renderizado vectorial 2D en tiempo real sobre lienzo gráfico (`java.awt.Graphics`).
  * Desacoplamiento de `AbsoluteLayout` heredado y migración integral a `JFrame` sobre Java 21.

---

### 📅 Próximas entregas del sprint:
* **Módulo 05:** Estructuras cíclicas y cálculo estadístico (`Promedio Notas`).