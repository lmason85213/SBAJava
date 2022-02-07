package Company2;

public class Manager extends Employee {

	public Manager(long id, String name, String address, String phone,
			double salary) {
		super(id, name, address, phone, salary);
		// TODO Auto-generated constructor stub
	}
	

	public double calculateTransportAllowance() {
		double transportAllowance = 15* basicSalary/100;
		return transportAllowance;
	}
	
}
