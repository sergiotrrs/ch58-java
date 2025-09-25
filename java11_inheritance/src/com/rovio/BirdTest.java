package com.rovio;

public class BirdTest {

	public static void main(String[] args) {
		// La clase Bird no se puede instanciar
		// ya que es una clase abstracta
		//Bird myBird = new Bird();
		
		RedBird myBird = new RedBird(true);
        YellowBird chuck = new YellowBird(55);
        BlackBird bomb = new BlackBird(12);
        LittleYellowBird norris = new LittleYellowBird(10);
        
        
        myBird.launch();
        myBird.useSpecialAbility();
        myBird.onImpact(); // grita, aletea, se le cae una pluma al impactar
        System.out.println();
        chuck.launch();
        chuck.useSpecialAbility();
        chuck.onImpact(); // " se impacta"
        System.out.println();
        bomb.launch();
        bomb.useSpecialAbility();
        bomb.onImpact();
        System.out.println();
        norris.launch();
        norris.useSpecialAbility();
        norris.onImpact();
        
        

	}

}
