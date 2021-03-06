
public class ArrayTest1 {

	// non-static plus outside method
	double[] arrays;

	public static void main(String[] args) {

		double[] arraysOfSalaries = createArray();

		printArrayValues(arraysOfSalaries);

		double[] arraysOfYoExps = new double[10];

		// way 2

		arraysOfYoExps[0] = 23.34; // if 0 then 10000
		arraysOfYoExps[1] = 1.4 * 5000; // o
		// dd then odd num * 5000
		arraysOfYoExps[2] = 2.6 * 3000; // even the even num * 3000
		arraysOfYoExps[3] = 3.8 * 5000; // even the even num * 3000
		arraysOfYoExps[4] = 4.4 * 3000; // even the even num * 3000

		printArrayValues(arraysOfYoExps);

		// syntax

	}

	public static void printArrayValues(double[] array) {

		System.out.println("values in the array are :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static double[] createArray() {

		// 
		double[] salaries = new double[100];

		// way 2

		// arraysOfSalaries[0] = 0; // if 0 then 10000
		// arraysOfSalaries[1] = 1 * 5000; // odd then odd num * 5000
		// arraysOfSalaries[2] = 2 * 3000; // even the even num * 3000
		// arraysOfSalaries[3] = 3 * 5000; // even the even num * 3000
		// arraysOfSalaries[4] = 4 * 3000; // even the even num * 3000

		for (int index = 0; index < salaries.length; index++) {
			if (index == 0) {
				salaries[index] = 10000;
			} else if (index % 2 == 0) {
				salaries[index] = index * 3000;
			} else {
				salaries[index] = index * 5000;

			}
		}

		return salaries;
	}

	/**
	 * this method is used to test way 1 of array
	 */
	public static void testcase1() {
		// way 1
		// logical collection of related items
		int[] productionInDays = { 25, 26, 28, 29, 30, 45, 56, 78 };

		//
		// 2000 2004 2008 2012
		// 25 26 28 29 30
		// 0 1 2 3 4

		System.out.println("value at index 3 : " + productionInDays[3]);

		// System.out.println("value at index 89 : "+productionInDays[89]);

		// System.out.println("value at index -1 : "+productionInDays[-1]);

		System.out.println("len of array is :" + productionInDays.length);

		System.out.println("last value of array is : " + productionInDays[productionInDays.length - 1]);
	}

}
