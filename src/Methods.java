
public class Methods {
	
	public static void main(String[] args) {
//		int lesser = findLesserValue(13, 8);
//		System.out.println(lesser);
//		
//		System.out.println(findLesserValue(4, 7));
//		
//		greet("David");
		System.out.println(multiplyString("Ode to Joy", 3));
		
		String myString = multiplyString("Hello World", 5);
		System.out.println(myString);
		
		System.out.println(makeFullName("Tim", "Sawyer"));
	}
	
	public static String makeFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public static void greet(String name) {
		System.out.println("Welcome, " + name);
		System.out.println("Glad to see you!");
	}
	
	public static int findLesserValue(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}
	
	

}
