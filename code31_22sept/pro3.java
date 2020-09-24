
import java.io.*;

class Name {

	public static void main(String[] args) throws IOException {

		BufferedReader brOne = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brTwo = new BufferedReader(new InputStreamReader(System.in));
		
		String firstName = brOne.readLine();
		String lastName = brTwo.readLine();
		brTwo.close();
		brOne.close();

		System.out.println(firstName + " " + lastName);
	}
}
