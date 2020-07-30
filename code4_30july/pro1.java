
class Calc {

	public static void main(String[] args) {

		int a = 10,b = 20;
		char op = '*';

		switch(op) {

			case '+' :
				System.out.println(a + b);
				break;

			case '-' :
				System.out.println(a - b);
				break;

			case '*' :
				System.out.println(a * b);
				break;
			case '/' :
				System.out.println(a / b);
				break;
			default :
				System.out.println("Invalid Operand Choice");
				break;
		}
	}
}
