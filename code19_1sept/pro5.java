
import java.io.*;

class Max {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2;

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		if(num1 >= num2)
			System.out.println("Maximum no from "+num1 +" & " + num2 +" is : " +num1);
		else
			System.out.println("Maximum no from "+num1 +" & " + num2 +" is : " +num2);
	}
}
