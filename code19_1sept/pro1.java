
import java.io.*;

class ODD {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2;

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		for(;num1 <= num2;num1++){

			if(num1 % 2 == 1)
				System.out.print(num1 + " ");
		}		
		System.out.println();
	}
}
