package b;

public class BDemo {
	
	public static void main(String[] args) {
		System.out.println("BDemo: TeamA");
		
		// Variable
		int a = 5;

		// Beginning of Code Added By Sam

		int day = 4;

		System.out.println("*** Switch Statement: Days of the Week");

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;
		
		default:
			System.out.println("Invalid Number!");
		}
		System.out.println("*** END OF Switch Statement: Days of the Week");
		// Code Ended Here -> SAM.
	}

}
