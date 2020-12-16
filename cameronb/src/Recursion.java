public class Recursion {

	public static void main(String[] args) {

		int[] numbers = new int[] { 5, 8, 9, 12 };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}

		System.out.println("The sum value of this array is : " + sum);

	}

}