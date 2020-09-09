
import java.io.*;

class GCD{

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2,x = 0;

		//Accept the two number in num1 and num2
		num1 = Integer.parseInt(br.readLine());	
		num2 = Integer.parseInt(br.readLine());	

		for(int div = 1;div <= num1;div++){

			if(num1 % div == 0 && num2 % div == 0){
		
				x = div;
			}
		}

		System.out.println("GCD of " + num1 + " & "+num2 +" is : "+x);
	}
}
