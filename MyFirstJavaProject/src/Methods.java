
public class Methods {

	public static void main(String[] args) {
		int num = 4;

		int sqOfNum = getSquare(num);
		printRes(sqOfNum);
		// System.out.println("Result is " + sqOfNum);

		int sum = getSum(3, 4);
		printRes(sum);
		// System.out.println("Result is " + sum);

		// printRes(sqOfNum);

	}

	public static int getSquare(int n) {
		return n * n;
	}

	public static int getSum(int a, int b) {
		return a + b;
	}

	public static void printRes(int n) {
		System.out.println("Result after cal is  " + n);
	}

}
