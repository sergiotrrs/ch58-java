package com.rovio;

import java.util.ArrayList;
import java.util.List;

public class AngryBirdTest {

	public static void main(String[] args) {
		/*
		 * Principio de Sustitución de Liskov (LSP) "Las clases derivadas deben ser
		 * sustituibles por sus tipos base(parent) sin alterar la corrección del
		 * programa"
		 */
		Bird red = new RedBird();
		Bird chuck = new YellowBird(55);
		BlackBird bomb = new BlackBird(12);
		LittleYellowBird norris = new LittleYellowBird(10);

		List<Bird> birds = new ArrayList<>(List.of(red, chuck, bomb, norris));
		// birds.add(red);
		gameSimulator(birds);

	} // main

	public static void gameSimulator(List<Bird> birdList) {
		for (Bird bird : birdList) {
			System.out.println("------------------>");
			bird.launch();
			bird.useSpecialAbility();
			bird.onImpact();

			if (bird instanceof YellowBird) {
				YellowBird yellowBird = (YellowBird) bird;
				System.out.println("Velocidad:" + yellowBird.getSpeedBoost());
			}

			System.out.println("<------------------");

		}
	}

}
