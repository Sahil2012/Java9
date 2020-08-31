
import java.io.*;

class CS {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		//Accepting the max range from user
		int maxRange = Integer.parseInt(br.readLine());

		//looping from 1 to given range
		for(int num = 1;num <= maxRange;num++) {

			System.out.println("Cube of " + num + " : "+num*num*num + " and Square of "+num + " : "+num*num);
		}
	}
}
