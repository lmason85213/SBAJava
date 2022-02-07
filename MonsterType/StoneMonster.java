package MonsterType;

public class StoneMonster extends Monster{

	private static final String attackType = "Stone";

	public StoneMonster(String name) {
		super(name, attackType);
		// TODO Auto-generated constructor stub
		
	}
	
	public String attack() {
		return "Attack with " + attackType + "!"; 
	}

	
}
