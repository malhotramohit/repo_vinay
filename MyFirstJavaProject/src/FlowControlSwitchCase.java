
public class FlowControlSwitchCase {

	public static void main(String[] args) {

		String day = "FRI";

		// if (day == "Mon" || day == "Tue" || day == "Wed" || day == "Thurs") {
		// System.out.println("ist weekday");
		// } else if (day == "Fri") {
		// System.out.println("near weekend");
		// } else if (day == "Sat" || day == "Sun") {
		// System.out.println("its a weekend");
		// } else {
		// System.out.println("Wrong day");
		// }

		switch (day) {

		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			System.out.println("Working days");
			break;
		case "FRI":
			System.out.println("Weekend is about to come");
			break;
		case "SAT":
		case "SUN":
			System.out.println("Wow its weekend");
			break;
		default:
			System.out.println("Invalid Day");

		}

	}

}
