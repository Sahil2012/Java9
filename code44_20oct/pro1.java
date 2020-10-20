
import java.io.*;

class Vowel {

	public static void main(String... args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = new String(br.readLine().trim());

		int count = 0;

		for(int i = 0; i < s1.length(); i++) {

			if('a' == s1.charAt(i) || 'e' == s1.charAt(i) || 'i' == s1.charAt(i) || 'o' == s1.charAt(i) || 'u' == s1.charAt(i) || 'A' == s1.charAt(i) || 'E' == s1.charAt(i) || 'I' == s1.charAt(i) || 'O' == s1.charAt(i) || 'U' == s1.charAt(i))
				count ++;
		}

		System.out.println("No of Vowels : " + count);
	}
}
