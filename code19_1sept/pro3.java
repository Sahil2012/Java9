
import java.io.*;

class Even {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2;

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		for(;num1 <= num2;num1++){

			if(num1 % 2 == 0)
				System.out.println("Square : " +num1 * num1 + " Cube : "+num1 * num1 *num1);
		}		
	
	}
}
