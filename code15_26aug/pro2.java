
import java.io.*;

class Cube {

	public static void main(String... args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		//Accepting the no as input in range
		int range = Integer.parseInt(br.readLine());

		//Looping and calculating the cube
		for(int num = 1;num <= range;num++) {

			System.out.println("Cube of "+num+" is : " + num*num*num);
		}
	}
}
