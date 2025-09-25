package com.rovio;

public final class BlackBird extends Bird {
	private int explosionPower;

	public BlackBird(int explosionPower) {
		super("Bomb", "Negro");
		this.explosionPower = explosionPower;
	}

	public int getExplosionPower() {
		return explosionPower;
	}

	public void setExplosionPower(int explosionPower) {
		this.explosionPower = explosionPower;
	}

	@Override
	public void useSpecialAbility() {
		System.out.println(super.getName() + " tiene un poder explosivo de " + explosionPower);
	}
}
