
import java.io.*;

class Fact {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num,fact = 1;

		//Accept the integer value in num
		num = Integer.parseInt(br.readLine());

		//looping from 1 to num and calculating the factorial
		for(int f = 1;f <= num;f++) {

			fact *= f;
		}

		System.out.println("Factorial of "+num+" is : " + fact);
	}
}
