
public class Calculator {

	public static void main(String[] args) {

		//
		int a = 4;
		int b = 6;

		// ?
		// swap : a =6, b=4

		System.out.println(a);
		System.out.println(b);

		int sum1 = add(2, 3);
		System.out.println(sum1);

		int sum2 = add(2, 3, 4);
		System.err.println(sum2);

		System.out.println(multiply(3.45, 45.67));

	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static int add(int a, int b) {
		System.out.println("inside :: add(int a, int b)");
		return a + b;
	}

	public static int add(int a, int b, int c) {
		System.out.println("inside :: add(int a, int b , int c)");
		return a + b + c;
	}

	public static int add(int a, char b) {
		System.out.println("inside :: add(int a, int b)");
		return a + b;
	}

}
