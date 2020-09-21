
import java.io.*;

class Leap {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int year = Integer.parseInt(br.readLine());

		if(year > 0) {
			if(year % 400 == 0)
				System.out.println(year + " is a leap year");
			else if(year % 4 == 0 && year % 100 != 0)
				System.out.println(year + " is a leap year");
			else 
				System.out.println(year + " is not a leap year");
		} else {

			System.out.println("Invaid Input");
		}
	}
}