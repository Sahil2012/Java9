
class MaxDigit {

	public static void main(String... args) {

		int num = 237892356,max = 0;

		while(num != 0) {

			if(max < (num % 10))
				max = num % 10;

			num /= 10;
		}

		System.out.println("Max Digit = " + max);
	}
}
