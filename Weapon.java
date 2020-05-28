package de.arenakampf.miguel.java;

public interface Weapon 
{

	String name="";
	int health=0;
	int strength=0;
	int skill=0;
	
	public String getName(String name);
	public int getHealth(int health);
	public int getStrength(int strength);
	public int getSkill(int skill);
}
