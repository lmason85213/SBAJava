package MonsterType;

public class FireMonster extends Monster{

	private static final String attackType = "Fire";

	public FireMonster(String name) {
		super(name, attackType);
		// TODO Auto-generated constructor stub
		
	}
	
	public String attack() {
		return "Attack with " + attackType + "!"; 
	}
	


	
}
