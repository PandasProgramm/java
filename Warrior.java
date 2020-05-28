package de.arenakampf.miguel.java;

import javax.swing.JOptionPane;

/*
 * 26.05.20
 * @author Miguel Gutierrez
 */
public class Warrior {

	String name;
	int health;
	int strength;
	int skill;
	Armor[] armor=new Armor[6];//
	Weapon[]weapon=new Weapon[2];
	
	

	public Warrior(String name, int health, int strength, int skill,Armor[] armor,Weapon[]weapon) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.skill = skill;
		this.armor = armor;
		this.weapon=weapon;
		
	}
   
    public void addArmor(Armor[]amor, int input)
   {
	   System.out.println("Sie sind im Rüstungsmenü. Sie haben genau 6 Slots. ##|1.Slot: Kopf|2.Slot: Schulter"
		         + "|3.Slot: Brust|4.Slot: Füße|5.Slot: Beine|6.Slot: Armschienen|");
	   System.out.println("Rüstungsmenü Kopf: Sie haben 3 verschieden Kopfteile zur Auswahl:");
	   System.out.println("1.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("2.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("3.Rüstungsteil:  -Health|- Stärke|-skill");
	   
	   String inputString = JOptionPane.showInputDialog("//Auswahl für Kopfteil" ); 
	   		         System.out.println("1.Rüstungsteil:  -Health|- Stärke|-skill"); 
	   		        
	   int inputInt = Integer.parseInt(inputString);
	   switch(inputInt)
	   {
	   case 1: armor[0]= Helmet.blackHelmet;break;
	   case 2: armor[0]=Helmet.blueHelmet;break;                             //helmet
	   case 3: armor[0]=Helmet.yellowHelmet;break;
	   }
	   System.out.println("Rüstungsmenü Schulter: Sie haben 3 verschieden Schulterteile zur Auswahl:");
	   System.out.println("1.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("2.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("3.Rüstungsteil:  -Health|- Stärke|-skill");
	   
	   inputString= JOptionPane.showInputDialog("//Auswahl für Schulterschutz:");
	   inputInt = Integer.parseInt(inputString);
	   
	   switch(inputInt)
	   {
	   case 1: armor[1]=ShoulderProtection.blackShoulder;break;
	   case 2: armor[1]=ShoulderProtection.blueShoulder;break;
	   case 3: armor[1]=ShoulderProtection.yellowShoulder;break;
	   }
	   System.out.println("Rüstungsmenü Brustschutz: Sie haben 3 verschieden Brustschutz zur Auswahl:");
	   System.out.println("1.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("2.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("3.Rüstungsteil:  -Health|- Stärke|-skill");
	   
	   inputString= JOptionPane.showInputDialog("//Auswahl für Brustschutz:");
	   inputInt = Integer.parseInt(inputString);
	   
	   switch(inputInt)
	   {
	   case 1: armor[2]=ChestProtection.blackChestProtection;break;
	   case 2: armor[2]=ChestProtection.blueChestProtection;break;
	   case 3: armor[2]=ChestProtection.yellowChestProtection;break;
	   }
	   System.out.println("Rüstungsmenü Stiefelteile: Sie haben 3 verschieden Stiefelteile zur Auswahl:");
	   System.out.println("1.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("2.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("3.Rüstungsteil:  -Health|- Stärke|-skill");
	   
	   inputString= JOptionPane.showInputDialog("//Auswahl für Stiefel:");
	   inputInt = Integer.parseInt(inputString);
	   
	   switch(inputInt)
	   {
	   case 1: armor[3]=FootProtection.blackFootProtection;break;
	   case 2: armor[3]=FootProtection.blueFoodProtection;break;
	   case 3: armor[3]=FootProtection.yellowFoodProtection;break;
	   }
	   System.out.println("Rüstungsmenü Beinschutz: Sie haben 3 verschieden Beinschutzteile zur Auswahl:");
	   System.out.println("1.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("2.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("3.Rüstungsteil:  -Health|- Stärke|-skill");
	   
	   inputString= JOptionPane.showInputDialog("Auswahl für Beinschutz:");
	   inputInt = Integer.parseInt(inputString);
	   
	   switch(inputInt)
	   {
	   case 1: armor[4]=LegProtection.blackLegProtection;break;
	   case 2: armor[4]=LegProtection.blueLegProtection;break;
	   case 3: armor[4]=LegProtection.yellowLegProtection;break;
	   }
	   System.out.println("Rüstungsmenü Armschienen: Sie haben 3 verschieden Armschienen zur Auswahl:");
	   System.out.println("1.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("2.Rüstungsteil:  -Health|- Stärke|-skill");
	   System.out.println("3.Rüstungsteil:  -Health|- Stärke|-skill");
	   
	   inputString= JOptionPane.showInputDialog("Auswahl für Armschienen:");
	   inputInt = Integer.parseInt(inputString);
	   
	   switch(inputInt)
	   {
	   case 1: armor[5]=Bracers.blackBracers;break;
	   case 2: armor[5]=Bracers.blueBracers;break;
	   case 3: armor[5]=Bracers.yellowBracers;break;
	   }		
   }
    public void addWeapon(Weapon[]weopen,int input)
    {
       System.out.println("Sie sind im Waffenmenü. Sie haben genau zwei Slots für Schild und Schwert.1.Slot:Schwert|2.Slot:Schild|## ");
       String inputString= JOptionPane.showInputDialog("Auswahl für die Waffe:");
 	   int inputInt = Integer.parseInt(inputString);
 	   
 	   switch(inputInt)
 	   {
 	   case 1: weapon[0]=Swort.blackSwort;break;
 	   case 2: weapon[0]=Swort.blueSwort;break;
 	   case 3: weapon[0]=Swort.yellowSwort;break;
 	   }
 	   System.out.println("Sie sind im Waffenmenü. Sie haben genau zwei Slots für Schild und Schwert.1.Slot:Schwert|2.Slot:Schild|## ");
       inputString= JOptionPane.showInputDialog("Auswahl für die Waffe:");
	   inputInt = Integer.parseInt(inputString);
	   
	   switch(inputInt)
	   {
	   case 1: weapon[1]=Shield.blackShield;break;
	   case 2: weapon[1]=Shield.blueShield;break;
	   case 3: weapon[1]=Shield.yellowShield;break;
	   }
    }
   
    //Getter and Setter
    public Weapon[] getWeapon() {
		return weapon;
	}
    public Weapon[]setWeapon(){
    	return weapon;
    }
	public Armor[] getArmor() {
		return armor;
	}

	public void setArmor(Armor[] armor) {
		this.armor = armor;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}
	//corefunkction
	public int damage()
	{
		return strength*skill;
	}
	public int getDamage(int damage)
	{
		return health=health-damage;
	}

}
