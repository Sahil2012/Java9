
import java.io.*;

class Min {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2,num3;

		//Accept the numbers in num1,num2,num3
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		num3 = Integer.parseInt(br.readLine());

		System.out.println("Minimum number amongst " + num1+ ","+num2 +" and " +num3+" is " +((num1 <= num2 && num1 <= num3)?num1:((num2<= num1 && num2 <= num3)?num2:num3)));
	}
}
