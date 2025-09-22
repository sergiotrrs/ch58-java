package mx.santander;

import java.util.ArrayList;

public class AtmTest {

	public static void main(String[] args) {
		   Atm atm01 = new Atm();
		   atm01.serialNumber = 100;
		   atm01.balance = 500_000;
		   atm01.address = "Av. Siempre viva n.8";
		   
		   // Instanciar la clase Atm, y asignar el atributo serialNumber a 101
		   Atm atm02 = new Atm();
		   atm02.serialNumber = 201;
		   atm02.balance = 600_000;
		   atm02.address = "Calle Carocola n.124";
		   System.out.println( atm02 );
		   
		   
		   // Retirando dinero
		   atm01.withdraw(100_000);
		   System.out.println("Balance en atm01: " + atm01.balance ); // 400_000
		   System.out.println("Balance en atm02: " + atm02.balance ); // 600_000

		   // Probar el método de depósito de dinero
		   
		   // Agregando a una colección
		   ArrayList<Atm> sucursal = new ArrayList<>();
		   sucursal.add(atm01);
		   sucursal.add(atm02);		   
		   System.out.println( sucursal );
		  
		   

	}

}
