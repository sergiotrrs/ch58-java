package com.rovio;

public class LittleYellowBird extends YellowBird{
	
	public LittleYellowBird(int speedBoost) {
		super(speedBoost);
		super.setName("Norris");
	}
	
	@Override
	public void useSpecialAbility() {
		System.out.println("=== My little Yellow Bird ====");
		super.useSpecialAbility();		
	}

}
