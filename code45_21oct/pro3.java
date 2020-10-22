
import java.io.*;

class GreaterThan5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the String : ");
		String s = new String(br.readLine().trim());

		if(s.length() >= 5) {

			System.out.println(s);
		} else {

			System.out.println("Invalid");
		}
	}
}
