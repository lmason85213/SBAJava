package Company2;
import Company2.Manager;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		Employee manager1 = new Manager(126534,"Peter","Chennai India","237844",65000);
		Employee trainee1 = new Trainee(29846,"Jack","Mumbai india","442085",45000);
		
		System.out.println(manager1.calculateSalary());
		System.out.println(trainee1.calculateSalary());
	
		System.out.println(trainee1.calculateTransportAllowance());
		System.out.println(manager1.calculateTransportAllowance());
		
	}
}
