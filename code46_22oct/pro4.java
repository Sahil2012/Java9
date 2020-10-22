
import java.io.*;

class UpperLower {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String first = new String(br.readLine().trim());
		String last = new String(br.readLine().trim());

		System.out.println(first.toUpperCase() + " " + last.toLowerCase());
	}
}
