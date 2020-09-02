
import java.io.*;

class Min {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2;

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		if(num1 > num2)
			System.out.println("Minimum no amongst "+num1+" and "+num2+" is "+num2);
		else if(num2 > num1)
			System.out.println("Minimum no amongst "+num1+" and "+num2+" is "+num1);
		else 
			System.out.println("Both are Equal");
	}
}
