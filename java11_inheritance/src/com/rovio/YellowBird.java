package com.rovio;

public class YellowBird extends Bird {

	private int speedBoost;

	public YellowBird(int speedBoost) {
		super("Chuck", "Amarillo");
		this.speedBoost = speedBoost;
	}

	public double getSpeedBoost() {
		return speedBoost;
	}

	public void setSpeedBoost(int speedBoost) {
		this.speedBoost = speedBoost;
	}

	@Override
	public void useSpecialAbility() {
		System.out.println(super.getName() + " tiene un aumento de velocidad de " + speedBoost);
	}

}
