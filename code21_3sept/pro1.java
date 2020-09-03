
import java.io.*;

class Perfect {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num,sum = 0;

		//Accepting the number in num
		num = Integer.parseInt(br.readLine());

		//Iterate from 1 to num/2
		for(int itr = 1;itr <= num/2;itr++) {

			//Check for the divisors
			if(num % itr == 0)
				sum += itr;
		}

		//Check for the cond of Perfect no
		if(sum == num) 
			System.out.println(num + " is a perfect no.");
		else
			System.out.println(num + " is not a perfect no.");
	}
}
