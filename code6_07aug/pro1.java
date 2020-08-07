
class Count {

	public static void main(String... args) {
	
		int count = 0,num = 123;

		while(num != 0) {

			count += 1;

			num /= 10;
		}

		System.out.println("Count = " + count);
	}
}
