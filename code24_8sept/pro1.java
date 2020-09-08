
import java.io.*;

class Diff {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int diff,len;

		//Store the integer increment value and length in diff and len
		diff = Integer.parseInt(br.readLine());
		len = Integer.parseInt(br.readLine());

		if(len > 0 && diff > 0) {

			//Iterate from 1 to (diff * len)
			for(int itr = 1;itr <= (diff*len);itr += diff) {

				System.out.print(itr + " ");
			}
			System.out.println();

		} else if(len > 0 && diff < 0){
			
			//iterate from 1 to (diff * len)
			for(int itr = 1;itr >= (diff*len);itr += diff) {

				System.out.print(itr + " ");
			}
			System.out.println();

		} else {

			System.out.println("Invlaid Input");
		}
	}
}
