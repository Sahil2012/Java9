
import java.io.*;

class Fact {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int lowerLimit,upperLimit;
		
		/* Accept lower and upper limit in loerLimit and upperLimit */
		lowerLimit = Integer.parseInt(br.readLine());
		upperLimit = Integer.parseInt(br.readLine());

		/* upperLimit should be greater than lowerLimit */
		if(upperLimit > lowerLimit) {

			for(int i = lowerLimit; i <= upperLimit; i++) {
				
				/* Claculating factorial */
				int f = 1;
				for(int j = 1;j <= i; j++) {

					f *= j;
				}
				System.out.println("Factorial of " + i + " is : " + f);
			}
		} else {

			System.out.println("Wrong Input");
		}
	}
}
