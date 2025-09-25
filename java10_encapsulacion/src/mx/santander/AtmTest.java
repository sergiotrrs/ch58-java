package mx.santander;

public class AtmTest {

	public static void main(String[] args) {
		Atm atm01 = new Atm(500_000, "T-800", "Av. Simpre viva");
		// atm01.balance = 1000;
		
		System.out.println("Balance Atm01: " + atm01.getBalance()); // 500_000
		System.out.println( atm01 );
		
		Atm atm02 = new Atm(800_000, "T-1000", "Av. Caracola");
		
		Atm amt03 = new Atm(1_000_000.0);
		
		Atm atm04 = new Atm("2000000"); 
		
		Atm atm05 = new Atm();
		
		Atm atm06 = Atm.createAirPortAtm();

	}

}
