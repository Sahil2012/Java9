
import java.io.*;

class CS {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2,sum,sub;

		//Accept two integer in num1 and num2
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		//Calculating the sum of cubes
		sum = num1*num1*num1 + num2*num2*num2;

		//Calculating the sub of square and storing in sub
		sub = num1*num1 - num2*num2;

		System.out.println("Addition of "+num1*num1*num1+" and "+num2*num2*num2+" is "+sum);
		System.out.println("Subtraction of " + num1*num1 +" and " +num2*num2+" is "+sub);
	}
}
