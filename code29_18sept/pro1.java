
import java.io.*;

class UInput {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("------Options-----");
		System.out.println("1.Integer");
		System.out.println("2.String");

		/* Accept choice from user in s */
		System.out.print("Enter your Choice : ");
		int s = Integer.parseInt(br.readLine());

		/* Switch s */
		switch(s) {

			case 1 : System.out.println(Integer.parseInt(br.readLine()));
				break;

			case 2 : System.out.println(br.readLine());
				break;
	
			default :System.out.println("Invalid Choice");
				break;
		}
	}
}
