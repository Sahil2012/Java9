
class MulAdd { 

	public static void main(String... args) {

		int num = 5678,sum = 0,mul = 1;

		while(num != 0) {

			if((num % 10) % 2 == 0)
				sum += num % 10;
			else 
				mul *= num % 10;

			num /= 10;
		}

		System.out.println("Addition of even no : " + sum + "\nMultiplication of odd no : " + mul);
	}
}
