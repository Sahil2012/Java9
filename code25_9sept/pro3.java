
import java.io.*;

class HS {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		float hours,seconds;

		//Accept the no of hours in hours
		hours = Float.parseFloat(br.readLine());

		//Check for hours ,time cannot be negative
		if(hours >= 0) {

			//Calculating the seconds
			seconds = (3600 * hours);
			System.out.println(hours + " hours : " + (int)seconds + " seconds");
		} else {

			System.out.println("Invalid Input");
		}
	}
}
