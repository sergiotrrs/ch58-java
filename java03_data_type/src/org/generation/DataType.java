package org.generation;

public class DataType {

	public static void main(String[] args) {
		// Comentario de línea
		/*
		 * Comentario de bloque
		 */
		/*
		 * 
		 * Reglas para el nombre de las variables: 
		 * - Se distingue entre minúsculas y mayúsculas 
		 * - La longitud del nombre es ilimitada 
		 * - Puedes utilizar cualquier caracter Unicode 
		 * - La variable puede comenzar: 
		 * > una letra ej. miVariable 
		 * > signo de dolar $miVariable 
		 * > caracter de subrayado _miVariable
		 * 
		 * Java es un lenguaje de programación 
		 * fuertemente tipado, lo que significa que 
		 * todas las variables deben ser declaradas 
		 * con un tipo de dato específico antes 
		 * de ser usadas.
		 * 
		 * [tipo de dato] [nombre de la variable]
		 *         String message;
		 * 
		 */
		int $myVar; // Es válida, no es recomendable
		int _numEngranes; // Es válida, no es recomendable
		int myVarEnEspañol; // Es válida, se recomienda nombres en inglés
		int sinC0m3nt4r10s; // // Es válida, no es recomendable, es confusa
		int val; // Es válida, pero muy genérica
		boolean hasPaymentBeenProcessed; // Es válida y aunque es extensa se reccomienda
		String cfn; // Es válida, dificil de comprender
		
		/*
		 * En Java tendremos  los siguientes tipo de variables:
		 *  Variables de instancia (Non static fields): atributos de los objetos.
		 *  Variables de clase (Static Fields): atributos de la clase.
		 *  Variables locales (local variables): variable dentro de las funciones(métodos)
		 *  Parámetros (parameters): Entrada de las funciones
		 * 
		 */
		
		
		/**
		 *  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 *  Tipos de datos en Java
		 *  - Objetos (no primitivos)
		 *  - Datos primitivos
		 *  	8 datos primitivos
		 *   > byte (8 bits)
		 *   > short (16 bits)
		 *   > int (32 bits)
		 *   > long (64 bits)
		 *   > float (32 bits)
		 *   > double (64 bits)
		 *   > boolean
		 *   > char (16 bits)
		 *      
		 */
		
		/*
		 *  El número de de dígitos que puede contener la varible
		 *  2^8 = 256;
		 *  2^7 = 128 -> 
		 *        128 valores positivos:  0 ... +127 
		 *        128 valores negativos: -1 ... -128 
		 *    
		 *  Para Obtener el valor máximo y mínimo del tipo byte
		 *  usando su wrapper (clase envolvete) Byte.
		 *  
		 *  usos: util para ahorrar memoria cuando los valores numéricos
		 *        son pequeños.
		 */
		byte smallNumber; // declarar la variable
		smallNumber = 100; // asignar un valor a la variable
		
		System.out.println("Max value in byte type: " + Byte.MAX_VALUE); // 127
		System.out.println("Min value in byte type: " + Byte.MIN_VALUE); // -128
		
		/*
		 *  Tipo de dato short
		 *  Dato de 16 bits, almacena valores enteros
		 *  2^16 = 65536
		 *  Valores positivos:  0... 32767
		 *  Valores Negativos: -1... -32768
		 *  Obtener el MAX_VALUE y MIN_VALUE usando el warapper Short
		 *  
		 *  usos: util para ahorrar memoria cuando los valores numéricos
		 *        son pequeños. Sistemas embebidos con memoria limitada.
		 */
		short notSmallNumber;//declara variable
		notSmallNumber = 15000;//asigna valor

		
		System.out.println("Max value in short type:" + Short.MAX_VALUE); // 32767
		System.out.println("Min value in short type:" + Short.MIN_VALUE); // -32768
				
		/*
		 * Tipo de dato int
		 * Dato de 32 bits, almacena datos enteros.
		 * El wrapper de int es Integer
		 * 
		 * usos: Adecuado para la mayoría de los números: contadores,
		 *       índices de arreglos, cantidad de productos en inventario.
		 *       
		 * Obtener el rango máximo y mínimo del tipo int:      
		 */
		int inteNumber;
		inteNumber = 10;
		System.out.println("Max value in int type: " + Integer.MAX_VALUE); // 2147483647
		System.out.println("Min value in int type: " + Integer.MIN_VALUE); // -2147483648
		
		
		/*
		 * Tipo de dato long
		 * Dato de 64 bits, almacena datos enteros.
		 * El wrapper de long es Long
		 * 
		 * usos: IDs de transacciones bancarias, marcas de tiempo precisas,
		 *       IDs en grandes bases de datos.
		 */	
		long longNumber;
		longNumber=210000;
		System.out.println("Max value in long type: " + Long.MAX_VALUE); // 9223372036854775807
		System.out.println("Max value in long type: " + Long.MIN_VALUE); // -9223372036854775808
		
		/*
		 * Las literales numéricas enteras en java son de tipo int
		 * ej. 12, -456, 0
		 * Para idicar una literal numérica de tipo long
		 * hay que indicar la literal con la letra l o L.
		 * Se recomienda usar la L para no confundir con el 1
		 * 
		 * Se puede utilizar _ para una mayor legibilidad en un
		 * valor numéricos.
		 */	  
		long myVarLong = 9_223_372_036_854_775_807L;
		
		// =========Datos de punto flotante===================================
		/*
		 * Dato de tipo float
		 * Dato de 32 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de float es Float.
		 * 
		 * usos: la precisión no necesita ser extremadamente alta y se busca
		 *       ahorrar memoria.
		 * 
		 * nota: tanto float como double tiene pérdida de precisión.
		 * Para evitar la pérdida de precisión se puede usar la clase BigDecimal
		 */
	    System.out.println("Max Value in float type: " + Float.MAX_VALUE);// 3.4028235E38
		System.out.println("Min Value in float type: " + Float.MIN_VALUE);// 1.4E-45

		System.out.println( .1 + .2 );	// 	0.30000000000000004
		
		/*
		 * Dato de tipo double
		 * Dato de 64 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de double es Double.
		 * 
		 * uso: se elige double para cálculos que requieran alta exactitud como cálculos
		 *     científicos, coordenadas geográficas.
		 * 
		 * nota: Para cálculos financieros críticos, la clase BigDecimal es más
		 *       recomendada.
		 */
		System.out.println("Max value in data double type: " + Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println("Max value in data double type: " + Double.MIN_VALUE); // 4.9E-324
		
	    /*
		 *  Las literales de punto flotante son por default double(64)
		 *  ej. 123.567, 0.012, -0.989
		 */
		float productRatingAverage = 0.1F;
		
		
		 /*
		 * Dato Boolean
		 * Almacena valores true o false.
		 * 
		 * El wrapper es Boolean.
		 */
		boolean isActive = true;
		
		
		/*
		 * Dato char
		 * Almacena un solo caracter.
		 * Se debe definir la literal con apóstrofe ej. 'a', 'C', ' '
		 * Solo almacea caracteres de la tabla unicode(16 bits).
		 * puede almacenar del 0 al 65535
		 */
		// Tienes que maneja las tallas S, M, L
		 char productSizeCode = 'L'; // literal
		 productSizeCode = '\u004C'; // Valor único
		 productSizeCode = 76; // valor decimal
		 productSizeCode = 0x004C; // valor hexadecimal
		 System.out.println("Talla: " + productSizeCode ); // L
		 
		 /*
		 * Formas de representar un número
		 */
		System.out.println("Representación decimal: " + 34 );
		System.out.println("Representación hexadecimal: " + 0x22 ); // 34
		System.out.println("Representación binaria: " + 0b0010_0010 ); // 34
		System.out.println("Representación octal: " + 042 ); // 34
	   
		//===============Objeto String =====================================
		/*
		 * Tipo de dato String
		 * Es un objeto que se define con comillas dobles.
		 * 
		 * Si deseas imprimir comillas dobles,se usa el 
		 * caracter de escape \
		 *   \b backspace
		 *   \t tab
		 *   \n line feed
		 *   \r carriage return
		 *   \" double quote
		 *   \' single quote
		 *   \\ backslash
		 */
		String message = "Java \n\"monos\" \n\ta comer";
		System.out.println( message );
		 
		
	} // main

} // close class DataType
