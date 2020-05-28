package de.arenakampf.miguel.java;

public enum ShoulderProtection implements Armor
{
	//Stats werden angepasst
	blackShoulder("Schwarze Schultern",10,10,10),
	yellowShoulder("Gelbe Schultern",10,10,10),
	blueShoulder("Blaue Schulter",10,10,10);
	
	private String name;
    private int health;
    private int strength;
    private int skill;
    
    ShoulderProtection(String name, int health, int strength, int skill) 
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
