package om.presholas.java_basics;

public class oop {
	
	public static void main(String[] args) {
		Student michael = new Student(0001,"Michael","Gabriel","mgabriel@prescholas.org","123-456-7890");
		
		Student bairon = new Student(0002,"Bairon","Vasquez","bvasquez@prescholas.org","123-456-7891");
		
		michael.aboutStudent();
		System.out.println();
		bairon.aboutStudent();
	
		
	}

}
