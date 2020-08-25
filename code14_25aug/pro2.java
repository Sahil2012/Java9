
import java.io.*;

class SumOfNum {

	public static void main(String... args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int range,sum = 0;

		//Accept the range from user where to stop
		range = Integer.parseInt(br.readLine());

		//Iteraring through the loop upto range and calculating sum
		for(int num = 1;num <= range;num++) {

			sum += num;
		}

		System.out.println("Sum of " + range +" numbers : " + sum);
	}
}
