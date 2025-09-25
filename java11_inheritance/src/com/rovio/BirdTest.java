package com.rovio;

public class BirdTest {

	public static void main(String[] args) {
		// La clase Bird no se puede instanciar
		// ya que es una clase abstracta
		//Bird myBird = new Bird();
		
		RedBird myBird = new RedBird(true);
		myBird.launch();
		myBird.useSpecialAbility();

	}

}
