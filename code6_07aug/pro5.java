
class Avg {

	public static void main(String... args) {

		int num = 12345,sum = 0,count = 0;

		while(num != 0) {

			sum += (num % 10);
			count += 1;

			num /= 10;
		}

		System.out.println("Avg = "+(sum / count));
	}
}
