package MonsterType;

public class Monster {

	//Fields
	private String name;
    String attackType = "!@#!%*& I dont know how to attack!";
	
	//Constructor
	public Monster(String name, String attackType) {
		super();
		this.name = name;
		this.attackType = attackType;
	}	


	public Monster(String name) {
		super();
		this.name = name;
	}
	


	//Methods
	public String attack() {
		return   attackType; 
	}


	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttackType() {
		return attackType;
	}

	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}
	
	
	
	
	
	
	
	
	
	
}
