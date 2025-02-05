package b;

public class BDemo {
	
	public static void main(String[] args) {
		System.out.println("BDemo: TeamA");
	
	BDemo demo = new BDemo();
	demo.createTeam();
	
	int a = 5;
	int b= 10;
	int sum = a + b;
	System.out.println("The sum of " + a + "and " + b + " is: " + sum);
}
	public void createTeam() {
		System.out.println("TeamA");
	}
	
}