
import java.io.*;

class Calc {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2;
		char op;

		//Accept the integer values in num1 and num2
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		//Accept the operator in op
		op = '+';

		//Switching the operator and calculating the result
		switch(op) {

			case '+' :
				System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
				break;

			case '-' :
				System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
				break;
			
			case '*' :
				System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
				break;

			case '/' :
				System.out.println("Division of "+num1+" and "+num2+" is "+(((float)num1)/num2));
				break;
		}
	}
}
