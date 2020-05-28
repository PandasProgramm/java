package de.arenakampf.miguel.java;

public enum FootProtection implements Armor
{
	//stats sets behind
	blackFootProtection("Schwarze Stiefel",8,8,8),
	blueFoodProtection("Blauer Stiefel",8,8,8),
	yellowFoodProtection("gelbe Stiefel",8,8,8);
		
	private String name;
    private int health;
    private int strength;
    private int skill;
    
	FootProtection(String name, int health, int strength, int skill) 
	{
		this.name=name;
		this.health=health;
		this.strength=strength;
		this.skill=skill;
	}

	@Override
	public String getName(String name) {
		return name;
	}

	@Override
	public int getHealth(int health) {
		return health;
	}

	@Override
	public int getStrength(int strength) {
		return strength;
	}

	@Override
	public int getSkill(int skill) {
		return skill;
	}

}
