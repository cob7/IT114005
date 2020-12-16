public class work1 {
	public static void main(String[] args) {

		int[] intArray = { 1, 3, 4, 6, 8, 10, 14, 21, 27 };
		System.out.println("The numbers:");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

		System.out.println("\nThe even numbers:");
		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] % 2 == 0)
				System.out.print(intArray[i] + " ");
		}
	}
}
