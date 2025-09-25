package mx.santander;

/**
 *  Los pilares de OOP: encapsulación, herencia, polimorfismo, abstracción.
 *  
 *  Encapsulación: Principio que consiste en ocultar los detalles de como 
 *  funciona un objeto. Un aspecto importante de la encapsulación es el
 *  concepto de acceso controlado. Se puede establecer diferentes
 *  niveles de acceso para los atributos y métodos de un objeto.
 *  
 *  La encapsulación ofrece beneficios como:
 *  - Seguridad de datos: Ocultar los detalles internos o que los datos
 *  	sean modificados de manera incorrecta o no autorizada.
 *  - Modularidad: Se facilita la creacíón de componentes independientes
 *  	que pueden ser reutilizados.
 *  - Abstracción: Permite que los usuarios de un objeto se centren en
 *  	lo que hace el objeto en lugar de cómo lo hace.
 *  
 *  Niveles de acceso para la encapsulación:
 *  1.- Public: Son accesibles desde cualquier parte del código.
 *  2.- Protected: Son accesibles desde la misma clase, paquete y clases derivadas.
 *  3.- Default: Son accesibles dentro de la misma clase y del mismo paquete.
 *  4.- Private: Son accesibles dentro de la misma clase.
 * 
 */
public class Atm {
	private int serialNumber; // 0
	private double balance; // 0.0
	private String model = "Mi cajero automático"; // null
	private String address; // null
	private static int counter = 10;
	
	/**
	 * Bloque de inicialización no-estático
	 * - Simpre se ejecutan, no importanto que contructor se llame
	 * - Se ejecuta antes del cuerpo del constructor
	 */
	{
		this.serialNumber = ++counter;		
	}
	
	static {
		counter = 100;
	}

	
	public Atm() {
		
	}
	
	/* Métodos constructores
	 *  Un constructor es un tipo especial de método que se llama automáticamente
	 *  cuando se crea una instancia(objeto) de una clase. Su propósito principal
	 *  es inicializar el estado de un objeto recién creado.
	 *  
	 *  Reglas:
	 *  - El nombre del constructor debe ser el mismo que el de la clase.
	 *  - Un constructor no tiene retorno.
	 *  - Un constructor puede llamar a otro constructor de la misma clase usando
	 *  	la palabra this(). Esta llamada debe ser la primera instrucción del constructor.
	 *  - Es posible tener una sobrecar de constructores.
	 *  - Constructor por default: Si no se proporciona un constructor en la clase, Java
	 *  	proporciona un constructor por defecto sin parámetros.
	 *    <ModificarDeAcceso> NombreDeLaClase(parámetros para inicializar atributos)
	 */
	public Atm(double newBalance, String model, String address ) {
		this();
		balance = newBalance;
		this.model = model;
		this.address = address;
	}
	
	public Atm(double balance){
		this(balance, "Generic Model", "N/A");		
		// this.balance = balance;
		// this.model = "Generic Model";
		// this.address = "N/A";
		// this.serialNumber = ++counter;		
	}
	
	public Atm(String balance) {
		this( Double.parseDouble(balance) );
	}
	
	
	/*
	 * Para acceder a los atributos encapsulados, usamos
	 * los métodos Setters y Getters.
	 * 
	 * Esto protege los datos de manipulación incorrecta
	 * y controla como interactuán con el resto de código.
	 * 
	 * <Modificador de Acceso> <retorno> set/getNombreDelAtributo( parámetros )
	 */
	public double getBalance(){
		return this.balance;
	}
	
	private void setBalance(double balance){
		this.balance = balance;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSerialNumber() {
		return serialNumber;
	}


	
	public String toString() {
		return "Atm [serialNumber=" + serialNumber + ", balance=" + balance + ", model=" + model + ", address="
				+ address + "]";
	}

	public static int getCounter() {
		return counter;
	}
	
	/**
	 *  factory method
	 *  https://refactoring.guru/es/design-patterns
	 *  Los patrones de diseño creacionales se utilizan para promover 
	 *  el código limpio, modular y fácil de mantener, así como para 
	 *  mejorar la flexibilidad y la reutilización del código.
	 *  
	 *  Patrón de diseño: Es una solución reutilizable y 
	 *  probada para problemas comunes en el desarrollo de software.
	 *  Anti-patrón: Es una práctica de diseño que parece 
	 *  útil pero que en realidad genera problemas de 
	 *  mantenimiento, rendimiento o escalabilidad.
	 */
     public static Atm createAirPortAtm(){
    	 return new Atm(2_000_000, "T-2000", "Airport");
     }

}
