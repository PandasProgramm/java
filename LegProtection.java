package de.arenakampf.miguel.java;

public enum LegProtection implements Armor 
{
	
	//Statscontroll still behind
	blackLegProtection("Schwarzer Beinschutz",8,8,8),
	blueLegProtection("Blauer Beinschutz",8,8,8),
	yellowLegProtection("gelber Beinschutz",8,8,8);
	
	private String name;
    private int health;
    private int strength;
    private int skill;
    
	LegProtection(String name, int health, int strength, int skill) 
	{
		this.name=name;
		this.health=health;
		this.strength=strength;
		this.skill=skill;
	}

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHealth(int health) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStrength(int strength) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSkill(int skill) {
		// TODO Auto-generated method stub
		return 0;
	}

}
