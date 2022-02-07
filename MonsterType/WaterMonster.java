package MonsterType;

public class WaterMonster extends Monster{

	private static final String attackType = "Water";

	public WaterMonster(String name) {
		super(name, attackType);
		// TODO Auto-generated constructor stub
		
	}
	
	public String attack() {
		return "Attack with " + attackType + "!"; 
	}
	 

}
