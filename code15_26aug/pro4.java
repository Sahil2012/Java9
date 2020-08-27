
import java.io.*;

class Table {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		//Accept a number in num 
		int num = Integer.parseInt(br.readLine());

		//looping and printing table
		for(int i = 1;i <= 10;i++) {

			System.out.print(num*i + " ");
		}
		System.out.println();
	}
}
