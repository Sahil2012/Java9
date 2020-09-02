
import java.io.*;

class Max {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2,num3;

		//Accept the range in low and high
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		num3 = Integer.parseInt(br.readLine());

		System.out.print("The Max no amongst "+num1+","+num2+" and "+num3+" is ");
		System.out.println((num1 >= num2 && num1 >= num3)?num1:((num2 >= num1 && num2 >= num3)?num2 : num3));
		
	}
}
