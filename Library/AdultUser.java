package Library;

public class AdultUser  implements LibraryUser{

	protected int age;
	protected String bookType;
	
	
	
	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	
	public AdultUser(int age) {
		super();
		this.age = age;
	}
	
	


	public AdultUser(String bookType) {
		super();
		this.bookType = bookType;
	}


	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
	
		if(age >12) {
			System.out.println("You have successfully registered under an Adult Account");
		}else if (age < 12) {
			System.out.println("Sorry,Age must be greater than 12 to register as an adult");		
			
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		
		if(bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else {
			System.out.println("Oops, you allowed to take only adult Fiction books");
		}
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	

}
