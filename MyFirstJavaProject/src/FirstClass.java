
public class FirstClass {

	public static void main(String[] args) {

		// %
		int num1 = 9;
		int num2 = 4;

		// declaring
		// assign
		int res = num1 / num2;// 9/3 = 3

		System.out.println("res num1/num2 :" + res);

		// re-assign
		res = num1 % num2; // 9%3 =0

		System.out.println("res num1%num2 : " + res);

		if (num1 % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
