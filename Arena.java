package de.arenakampf.miguel.java;

/*
 * 26.05.20
 * @author Miguel Gutierrez
 */
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arena {
	
	
	private ArrayList<Warrior>enemys= new ArrayList<Warrior>();
	private Warrior player;
	Scanner sc= new Scanner(System.in);
	
	
	//addPlayer
	public Warrior addWarrior()
	{
		int points = 50;
		String name = JOptionPane.showInputDialog("Wie soll Ihr Held heißen?");
		System.out.println("Dein Held hat grundsätzlich 50 Leben, 50 Stärke, 50 Skill");
		System.out.println("Wenn du also einen Punkt in Stärke setzt, wird der"
				  + " Standardwert 50 mit 2 multipliziert, was zu einem finalen Ausgangswert führt.");
		
		String healthString=JOptionPane.showInputDialog("Sie haben noch "+points+" Punkte."+" Wie viele Punkte wollen sie "
				                                       + " in zusätzliches Leben investieren?");
		int health = Integer.parseInt(healthString);
		points = points- health;
		if(points>0)
		{
		health= health *50;
		}else {
			System.err.println("Du hast nicht genügend Punkte");
		}
		String strengthString=JOptionPane.showInputDialog("Sie haben noch "+points+" Punkte."+" Wie viele Punkte wollen sie "
				                                          + "in zusätzliche Stärke investieren?");
		int strength= Integer.parseInt(strengthString);
		points = points- strength;
		if(points>0)
		{
			strength= strength*50;
		}
		else
		{
			System.err.println("Du hast nicht genügend Punkte");
		}
		String skillString=JOptionPane.showInputDialog("Sie haben noch "+points+" Punkte."+" Wie viele Punkte wollen sie "
				                                      + "in zusätzliche Skill investieren?");
		int skill = Integer.parseInt(skillString);
		points = points- skill;
		//Points der Werte wurden verteilt 
		if(points==0)
		{
			return new Warrior(name, health, strength, skill, null, null);//Baustelle
		}
		else {
			System.err.println("Deine Punkte wurden nicht richtig verteilt. Versuche es nochmal");
		}
		
		return player;
		
		}
	    //add enemys
	    public void addEnemy()
	    {
	    	for(int i =0; i<4;i++)
	    	{
	    		this.enemys.add(new Warrior("Andi"+i,i*100,i*3,i*3, null, null));//behind
	    	}
	    }
	    public Warrior combad(Warrior player,Warrior enemy)
	    {
	    	while(player.getHealth()>0&&enemy.getHealth()>0)
	    	{
	    		this.firsthitother(player, enemy);
	    		if(enemy.getHealth()>0)
	    		{
	    			this.firsthitother(enemy, player);
	    		}
	    	}
	    	if(player.getHealth()>0)
	    	{
	    		return player;
	    	}
	    	return enemy;
	    }
	    private void firsthitother(Warrior player,Warrior enemy)
	    {
	    	System.out.println(player.getName()+"haut zu.\n");
	    	int damage = enemy.getDamage(player.damage());
	    	System.out.println(enemy.getName()+"verliert "+damage+" Punkte.");
	    	System.out.println(player.getName()+" hat "+ player.getHealth()+" Punkte."
	    			+enemy.getName()+" hat noch "+enemy.getHealth()+" Punkte.");
	    	
	    }
	    public void meeting()
	    {
	    	this.player=this.addWarrior();
	    	this.addEnemy();
	    	while(player.getHealth()>0&&enemys.size()>0)
	    	{
	    		Warrior challenger= this.enemys.get(0);
	    		Warrior winner = this.combad(player,challenger);
	    		if(this.player.equals(winner))
	    		{
	    			this.enemys.remove(0);
	    		}
	    		if(this.player.getHealth()>0)
	    		{
	    			System.out.println("Sie haben gewonnen");
	    		}
	    		else
	    		{
	    			System.out.println("Verlierer");
	    		}
	    			
	    	}
	    }

}
