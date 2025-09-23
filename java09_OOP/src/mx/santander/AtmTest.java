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
		System.out.println(atm02);

		// Retirando dinero
		atm01.withdraw(100_000);
		System.out.println("Balance en atm01: " + atm01.balance); // 400_000
		System.out.println("Balance en atm02: " + atm02.balance); // 600_000

		// Probar el método de depósito de dinero
		atm01.deposit(50000);
		// atm01.deposit( Double.parseDouble("200000") );
		atm01.deposit("200000");
		
		System.out.println("Balance en atm01: " + atm01.balance); // 650000
		System.out.println("Balance en atm02: " + atm02.balance); // 600_000

		// Agregando a una colección
		ArrayList<Atm> sucursal = new ArrayList<>();
		sucursal.add(atm01);
		sucursal.add(atm02);
		System.out.println(sucursal);
		
		// Uso se atributos estáticos
		Atm.bankName = "Santander";
		System.out.println("Banco: " + Atm.bankName ); // Santander
		System.out.println("Atm01 proviene de: " + atm01.bankName); // Santander
		System.out.println("Atm02 proviene de: " + atm02.bankName); // Santander
		atm01.bankName = "Santander Serfin";
		System.out.println("Banco: " + Atm.bankName ); // Santander Serfin
		System.out.println("Atm01 proviene de: " + atm01.bankName); // Santander Serfin
		System.out.println("Atm02 proviene de: " + atm02.bankName); //Santander Serfin
		System.out.println( Atm.printBankName() );
		

	}

}
