
import java.io.*;

class Swap {

	public static void main(String... args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2;

		//Accepting the values in num1 and num2
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		System.out.println("Before Swap : " + num1 +" " + num2);

		//Swaping the numbers
		num1 += num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After Swap : " + num1 + " " +num2);

	}		
}
