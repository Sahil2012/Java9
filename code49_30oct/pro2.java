
import java.io.*;

class CharAtIndex {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuffer sb = new StringBuffer(br.readLine().trim());

		/*
		 * CharAt() method takes int as parameter and return the cahrecter at that index
		 * indexOf() mrthod takes String as parameter and return the starting index
		 */

		System.out.println("Char At 5 : " + sb.charAt(5));
		System.out.println("Index of e : " + sb.indexOf("e"));
	}
}
