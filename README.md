# Repositorio del Curso de Java ☕

¡Bienvenido! Este repositorio contiene el código y los ejemplos utilizados durante las sesiones de enseñanza del lenguaje de programación Java.

## Contenido 📚

A continuación, se describe el contenido de cada carpeta principal del repositorio:

---

### 📁 Java01: Introducción a Java

En esta sección, cubrimos los fundamentos del lenguaje de programación Java.

* **¿Qué es Java?**: Una visión general del lenguaje.
* **Características del Lenguaje**: Ventajas y particularidades de Java.
* **Sintaxis básica**: Estructura fundamental de un programa en Java.
* **API de Java**:
    * Explicación de la Interfaz de Programación de Aplicaciones de Java.
    * Investigación de su documentación oficial.
* **Importar bibliotecas Java API**: Cómo incluir funcionalidades existentes en un proyecto.
* **Compilar y ejecutar**: Pasos para compilar y correr programas Java desde la terminal.
    ```bash
    # Compilar un archivo Java
    javac MiPrograma.java

    # Ejecutar el programa compilado
    java MiPrograma
    ```

---

### 📁 Java02: Variables y Tipos de Datos

Aquí exploramos cómo declarar y utilizar variables y los tipos de datos primitivos en Java.

* **Declarar y asignar variables**: Cómo crear y dar valor a las variables.
* **Tipos primitivos**:
    * Explicación y uso de: `boolean`, `int` (integer), `byte`, `char`, `long`, `float`, `double`, `short`.
    * Sintaxis básica para definir variables de cada tipo primitivo.
    ```java
    // Ejemplo de declaración de variables
    int userAge = 30; // Edad del usuario
    double accountBalance = 1025.50; // Saldo de la cuenta
    char userInitial = 'J'; // Inicial del usuario
    boolean isLoggedIn = true; // Estado de inicio de sesión
    ```
* **Convención de nombres**: Uso de `camelCase` y nombres significativos para variables.
* **Conversión de tipos (Type Casting)**: Describir y utilizar la conversión entre diferentes tipos de datos.

---

### 📁 Java04: Operadores

Esta sección se enfoca en los diferentes tipos de operadores disponibles en Java.

* **Operadores aritméticos**:
    * Explicación de su uso (`+`, `-`, `*`, `/`, `%`).
    ```java
    // Ejemplo de operadores aritméticos
    int sum = 5 + 3; // Suma
    int product = 5 * 3; // Multiplicación
    ```
* **Operadores comparativos**:
    * Explicación de cómo usarlos (`==`, `!=`, `>`, `<`, `>=`, `<=`).
    ```java
    // Ejemplo de operadores comparativos
    boolean isEqual = (userAge == 30); // Comprueba si la edad es 30
    ```
* **Operadores lógicos**:
    * Explicación y uso de `&&` (AND), `||` (OR), y `!` (NOT).
    ```java
    // Ejemplo de operadores lógicos
    boolean canAccess = isLoggedIn && (userAge > 18); // Verifica si el usuario está logueado Y es mayor de 18
    ```

---

### 📁 Java05: Flujo de Control

Aquí aprendemos sobre las estructuras que controlan el flujo de ejecución de un programa Java.

* **Flujo de control**:
    * Descripción de qué es y por qué es importante para un programador.
* **Declaraciones condicionales**: Definición y uso.
* **Declaración `if-else`**:
    * Definición y uso para tomar decisiones basadas en condiciones.
    ```java
    // Ejemplo de if-else
    if (userAge >= 18) {
        // Código a ejecutar si el usuario es mayor o igual a 18
        System.out.println("Acceso permitido.");
    } else {
        // Código a ejecutar si el usuario es menor de 18
        System.out.println("Acceso denegado.");
    }
    ```
* **Declaración `switch`**:
    * Definición y uso para seleccionar uno de varios bloques de código a ejecutar.
    ```java
    // Ejemplo de switch
    int dayOfWeek = 3;
    String dayName;
    switch (dayOfWeek) {
        case 1:  dayName = "Lunes";     break;
        case 2:  dayName = "Martes";    break;
        case 3:  dayName = "Miércoles"; break;
        // ... más casos
        default: dayName = "Día inválido"; break;
    }
    System.out.println(dayName); // Imprime: Miércoles
    ```
* **Expresiones condicionales (Operador Ternario)**:
    * Definición y uso para asignar un valor basado en una condición.
    ```java
    // Ejemplo de operador ternario
    String accessMessage = (userAge >= 18) ? "Acceso permitido" : "Acceso denegado";
    System.out.println(accessMessage);
    ```

---

¡Esperamos que este material sea de gran ayuda en tu aprendizaje de Java!