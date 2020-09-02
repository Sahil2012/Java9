
import java.io.*;

class Even {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int low,high;

		//Accept the range in low and high
		low = Integer.parseInt(br.readLine());
		high = Integer.parseInt(br.readLine());

		System.out.print("The Series of Even numbers from " + low + " to "+high+" : ");
		//Looping from low to high
		for(int num = low;num <= high;num++) {

			//Check for the Even no
			if(num % 2 == 0)
				System.out.print(num + " ");
		}
		System.out.println();
		
	}
}
