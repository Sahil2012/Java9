
import java.io.*;

class EvenOdd {

	public static void main(String [] args) throws Exception {

		int num;

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		//Accepting a number as input in num
		num = Integer.parseInt(br.readLine());

		if(num % 2 == 0) {

			System.out.println(num + " is a even number");
		} else {

			System.out.println(num + " is a odd number");
		}

	}
}
