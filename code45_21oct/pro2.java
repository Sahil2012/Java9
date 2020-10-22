
import java.io.*;

class LengthComp {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = new String(br.readLine().trim());
		String s2 = new String(br.readLine().trim());

		if(s1.length() == s2.length()) {

			System.out.println("Length of both the Strings is Same");
		} else {

			System.out.println("Length of both strings are Different");
		}
	}
}
