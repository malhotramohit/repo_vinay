public class PrimeNumber {

	public static void main(String[] args) {

		int a = 31;
		boolean isPrime = true;
		// 32/2
		// 32/4
		// 32/8
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("prime num");
		} else {
			System.out.println("Not  a prime num");
		}
	}

}