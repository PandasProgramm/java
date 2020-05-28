package de.arenakampf.miguel.java;

public enum Helmet implements Armor
{
	blackHelmet("Schwarzer Helm",8,8,8),
	blueHelmet("Blauer Helm",8,8,8),
	yellowHelmet("gelber Helm",8,8,8);
	
	private String name;
    private int health;
    private int strength;
    private int skill;
    
	Helmet(String name, int health, int strength, int skill) 
	{
		this.name=name;
		this.health=health;
		this.strength=strength;
		this.skill=skill;
	}

	@Override
	public String getName(String name) 
	{
		return name;
	}

	@Override
	public int getHealth(int health) 
	{
		return health;
	}
	@Override
	public int getStrength(int strength)
	{
		return strength;
	}
	@Override
	public int getSkill(int skill) 
	{
		return skill;
	}

	

}
