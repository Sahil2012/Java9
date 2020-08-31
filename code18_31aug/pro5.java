
import java.io.*;

class PerDiv {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		//Accept the integer value in num
		int num = Integer.parseInt(br.readLine());

		System.out.print("Perfect Divisors of " + num + " are : ");
		//Looping from 1 to num - 1
		for(int div = 1;div < num;div++) {

			//Checking for divisor
			if(num % div == 0)
				System.out.print(div + " ");
		}
		System.out.println();
	}
}
