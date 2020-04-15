
public class Account {

	int accNum;
	String accType;
	int numOfDependents;

	// public Account() {
	//
	// }

	static {
		System.out.println("Network socket check is runnig");
	}

	static {
		System.out.println("DB check is runnig");
	}

	public Account(int accn, String acType) {
		System.out.println("Account(int accn, String acType) is runnig");

		accNum = accn;
		accType = acType;
	}

	public Account(int accn, String acType, int numOfDep) {
		System.out.println("Account(int accn, String acType, int numOfDep) is runnig");

		accNum = accn;
		accType = acType;
		numOfDependents = numOfDep;
	}

}
