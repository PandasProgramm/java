package de.arenakampf.miguel.java;

public enum Swort implements Weapon
{

	blackSwort("Schwarzer Armschutz",8,8,8),
	blueSwort("Blauer Armschutz",8,8,8),
	yellowSwort("gelber Armschutz",8,8,8);
	
	private String name;
    private int health;
    private int strength;
    private int skill;
    
	Swort(String name, int health, int strength, int skill) 
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
