
import java.io.*;

class MulDiv {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2,mul;
		float div;

		//Accept two int values in num1 and num2
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		//Multiply num1,num2 and storing into mul
		mul = num1 * num2;

		//Checking for smaller no and storing division
		if(num1 >= num2) 
			div = ((float)num1) / num2;
		else
			div = ((float)num2) / num1;
		
		System.out.println("Multiplication is " + mul);
		System.out.println("Division is " + div);
	}
}
