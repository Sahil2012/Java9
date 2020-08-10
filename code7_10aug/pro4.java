
class FactRan {

	static int fact(int x) {

		int f = 1;

		for(int i = 1;i <= x;i++) {

			f = f*i;
		}

		return f;
	}

	public static void main(String[] args) {

		int num = 10;

		for(int i = 1;i <= num;i++) {

			System.out.println("Factorial of " + i + " : " + FactRan.fact(i));
		}
	}
}
