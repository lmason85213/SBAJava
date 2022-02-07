package Company2;

public class Employee {

	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hra= 1000.50;
	
	
	public Employee(long employeeId, String employeeName, String employeeAddress, String employePhone,
			double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employePhone = employePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		this.hra = hra;
	}

	
	public Employee(long employeeId, String employeeName, String employeeAddress, String employePhone,
			double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employePhone = employePhone;
		this.basicSalary = basicSalary;
	}


	
	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		return salary;
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = basicSalary*10/100;	
	  return transportAllowance;
	}
	
	

	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeAddress() {
		return employeeAddress;
	}


	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}


	public String getEmployePhone() {
		return employePhone;
	}


	public void setEmployePhone(String employePhone) {
		this.employePhone = employePhone;
	}


	public double getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}


	public double getSpecialAllowance() {
		return specialAllowance;
	}


	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}
	
	
	
}
