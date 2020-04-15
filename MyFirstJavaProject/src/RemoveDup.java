
public class RemoveDup {

	public static void main(String[] args) {

		int[] array = { 23, 45, 56, 45, 78, 67, 56 };
		// 23 45 56 78 67

		// int[7] : 0 0 0 0 0 0 0
		removeDupAndDisplayArray(array);

		if (checkIfPresent(45, array)) {
			System.out.println("45 is present");
		} else {
			System.out.println("45 is not present");
		}

	}

	private static void removeDupAndDisplayArray(int[] array) {

		int[] nonDupArray = new int[array.length];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (!checkIfPresent(array[i], nonDupArray)) { // array[i] in nonDupArray
				nonDupArray[j] = array[i];
				j++;
			}
		}

		for (int i = 0; i < j; i++) {
			System.out.println(nonDupArray[i]);
		}

	}

	private static boolean checkIfPresent(int value, int[] nonDupArray) {
		boolean ifPresent = false;
		for (int i = 0; i < nonDupArray.length; i++) {
			if (nonDupArray[i] == value) {
				ifPresent = true;
				break;
			}
		}
		return ifPresent;
	}

}
