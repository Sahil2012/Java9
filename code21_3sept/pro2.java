
import java.io.*;

class Fact {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int start,end;

		//Accept the range in start and end
		start = Integer.parseInt(br.readLine());
		end = Integer.parseInt(br.readLine());

		//Iterate from start to end
		for(int itr = start;itr <= end;itr++) {
			
			int f = 1;
			//Iterate from 1 to itr and calculate factorial
			for(int num = 1;num <= itr ;num++) {
		
				f *= num;
			}

			System.out.println("Factorial of " + itr + " : " + f);
		}
	}
}
