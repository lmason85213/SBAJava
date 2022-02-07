package om.presholas.java_basics;

public class Student {

	private int studentId;
	private String firstName;
	private String lastName; 
	private String email;
	private String studentPhone;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	
	public Student(int studentId, String firstName, String lastName, String email, String studentPhone) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.studentPhone = studentPhone;
	}
	
	public void aboutStudent() {
		System.out.printf("Hello my name is %s %s",firstName,lastName);
	}
}
