
import java.io.*;

class AddSub {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num1,num2,add,sub;

		//Accept two number from user and store into num1 and num2 resp
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		//Storing addition in add
		add = num1 + num2;

		//checking for greater no & and storing difference in sub
		if(num1 >= num2) 
			sub = num1 - num2;
		else
			sub = num2 - num1;

		System.out.println("Addition is " + add);
		System.out.println("Subtraction is " + sub);
	}
}
