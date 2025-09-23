package mx.santander;

public class AtmTest {

	public static void main(String[] args) {
		Atm atm01 = new Atm(500_000, "T-800", "Av. Simpre viva");
		// atm01.balance = 1000;
		
		System.out.println("Balance Atm01: " + atm01.getBalance()); // 500_000
		System.out.println( atm01 );
		
		

	}

}
