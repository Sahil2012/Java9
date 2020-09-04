
import java.io.*;

class Calender {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int d = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if(((m <= 7 && m >= 1) && m % 2 == 1) || ((m<= 12 && m>= 8) && m % 2 == 0)){

			if(d >= 1 && d <= 31)
				System.out.println("Valid Date!!");
			else
				System.out.println("Invalid Date!!");
		} else if(m == 2) {

			if(((y % 4 == 0) ||(y % 100 != 0 && y %4==0))&& (d >= 1 && d <= 29))
				System.out.println("Valid Date!!");
			else if(d >= 1 && d <= 28)
				System.out.println("Valid Date!!");
			else
				System.out.println("Invalid Date!!");

		} else if(m >= 1 && m <= 12) {

			if(d >= 1 && d <= 30)
				System.out.println("Valid Date!!");
			else
				System.out.println("Invalid Date!!");
		}
	}
}
