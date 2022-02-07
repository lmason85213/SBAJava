package Library;
import Library.AdultUser;
import Library.KidUsers;


public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kid1 = new KidUsers(10);
		KidUsers kid2 = new KidUsers(18);
		KidUsers kid3 = new KidUsers("Kids");
		KidUsers kid4 = new KidUsers("Fiction");
		
		AdultUser adult1 = new AdultUser(5);
		AdultUser adult2 = new AdultUser(23);
		AdultUser adult3 = new AdultUser("Kids");
		AdultUser adult4 = new AdultUser("Fiction");
		
		
	   kid1.registerAccount();
	   kid2.registerAccount();
	   kid3.requestBook();
	   kid4.requestBook();
	   
	   adult1.registerAccount();
	   adult2.registerAccount();
	   adult3.requestBook();
	   adult4.requestBook();
		
	}
}
