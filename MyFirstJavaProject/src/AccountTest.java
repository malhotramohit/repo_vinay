
public class AccountTest {
	
	public static void main(String[] args) {

		// Constructor
		// are special methods
		// used to initialize objects
		// 1) They have same name as class name
		// 2) They don;t have any return type
		// 3) it cannot static

		Account account1 = new Account(23, "SB");

		System.out.println(account1.accNum);
		System.out.println(account1.accType);

	}

}
