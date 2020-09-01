
import java.io.*;

class Swap {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2,a;

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		System.out.println("Before swap : " + num1 + " " + num2);
		a = num1;
		num1 = num2;
		num2 = a;
		System.out.println("After swap : " + num1 + " " + num2);
	}
}
