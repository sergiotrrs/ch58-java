package org.generation;

public class UserProfileTest {

	public static void main(String[] args) {
		
		// Instanciando la clase UserProfile
		UserProfile user = new UserProfile();
		
		System.out.println("Invocando la función: " + user.nameFormatted(" SERCH ") );
		user.registerActivity("El usuario a accedido al sistema Ch58");

	}

}
