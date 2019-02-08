
public class Arrays {
	
	public static void main(String[] args) {
		
		double[] studentGrades = new double[5];
		String[] studentNames = {"Tom", "Sam", "Bill", "Tim", "Tammy", "John"};
		
		studentGrades[0] = 78.99;
		studentGrades[1] = 72.99;
		studentGrades[2] = 75.99;
		studentGrades[3] = 24.99;
		studentGrades[4] = 99.99;
		
		double difference = studentGrades[studentGrades.length - 1] - studentGrades[0];
		
		System.out.println(average(studentGrades));
		System.out.println(average(new double[] {34.34, 43643.74, 254.56}));
		
		int count = getNumberOfStringsThatStartWithLetter(studentNames, 'T');
		System.out.println(count);
	}
	
	public static int getNumberOfStringsThatStartWithLetter(String[] strings, char letter) {
		int result = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].charAt(0) == letter) {
				result++;
			}
		}
		return result;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum / array.length;
	}
}
