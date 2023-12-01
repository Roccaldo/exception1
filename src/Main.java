public class Main {
	public static void main(String[] args) {

		checkNumb(3, 10, 5);
	}

	public static boolean checkNumb(int number, int max, int min) {
		if (number >= min && number <= max) {
			return true;
		} else {
			throw new ArithmeticException("the number is wrong");
		}
	}
}