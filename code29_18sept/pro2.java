
import java.io.*;

class CS {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int upperLimit,lowerLimit;

		/* Accept the range from user in upperLimit and lowerLimit */
		lowerLimit = Integer.parseInt(br.readLine());
		upperLimit = Integer.parseInt(br.readLine());

		/* upperLimit should be greater than lowerLimit */
		if(upperLimit > lowerLimit) {

			for(int i = lowerLimit ;i <= upperLimit;i++) {

				if(i % 2 == 0)
					System.out.print(i * i + " ");
				else
					System.out.print(i * i * i + " ");
			}
			System.out.println();
		} else {

			System.out.println("Wrong Input");
		}
	}
}
