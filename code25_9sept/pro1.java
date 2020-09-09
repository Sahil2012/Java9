
import java.io.*;

class OddRev {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int upperLimit;

		//Accept the upper limit in upperLimit
		upperLimit = Integer.parseInt(br.readLine());
	
		//For positive upperLimit
		if(upperLimit > 0) {

			for(int num = upperLimit;num >= 1;num--) {

				if(num % 2 == 1)
					System.out.print(num + " ");
			}
			System.out.println();
		//For negative upperLimit
		} else if(upperLimit < 0) {

			for(int num = upperLimit;num <= 1;num++) {

				if(num % 2 == -1)
					System.out.print(num + " ");
			}
			System.out.println();

		} else {

			System.out.println("Invlid Input");
		}
	}
}
