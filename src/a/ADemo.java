package a;

public class ADemo {

	public static void main(String[] args) {
		System.out.println("ADemo: TeamA");

		System.out.println("cool kids club");
		String name = "Sally";
		System.out.println(name);
		// test test
		for (int i = 0; i >= 20; i++) {

			System.out.println(i);
		}

		
		// Beginning of Code <--> Added by Sam 
		System.out.println("***** NESTED LOOP ******");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println("("+ i + " , " + j + ")");
			}
		}
		// End of Nested Loop <--> Added by Sam  
		
		
		
		
	}
	if (goal.isChallenging()) {
	    System.out.println("Keep pushing, you're doing great!");
	    goal.moveForward();
	
	
int a=5;
int b= 10;


		int a = 5;
		int b = 10;

		if (a != b) {

			System.out.println("Keep pushing, you're doing great!");
		}

		for (int y = 0; y >= 25; y++) {
			System.out.println(y);

		}

	}

	public static int add(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	public void greeting() {
		System.out.println("Hello teamA");
	}

	public String comboString(String a, String b) {
		String result = "";

		int lengtha = a.length();
		int lengthb = b.length();

		if (lengtha < lengthb) {
			result = a + b + a;
		} else {
			result = b + a + b;
		}

		return result;
	}

	// New Method - Sam
	public boolean sleepIn(boolean weekday, boolean vacation) {

		boolean result = false;

		if (!weekday || vacation == true) {
			result = true;
		}
		return result;
	}


	public void setMode() {
		System.out.println("Happy!");

}

	public void greating() {
		System.out.println("hello teamA");
	}
	// new method by Farah

	public int sumDouble(int a, int b) {
		int sum = a + b;

		if (a == b) {
			sum = sum * 2;
		}
		return sum;

	}

	//new method by sally
	public static void getColor(String color) {
		
	 System.out.println("the color of the season: " + color);
	 
	
	



	}
}



