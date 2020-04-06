
public class FlowControl {

	public static void main(String[] args) {

		// *
		// *
		// *
		// *
		// *

		// int i =0 ;
		// i++ : i=i+1;
		//
		for (int i = 5; i >= 6; i--) {
			System.out.println("*");
		}

		// *****
		// *****
		// *****
		// *****
		// *****
		// *****

		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
