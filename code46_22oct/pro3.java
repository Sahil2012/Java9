
import java.io.*;

class OccFL {

	public static void main(String... args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = new String(br.readLine().trim());
		char ch1 = (char)br.read();
		System.out.println("First Occurence : " + s.indexOf(ch1));

		for(int i = s.length() - 1; i >= 0; i--) {

				if(s.charAt(i) == ch1) {
					System.out.println("Last Occurence : " + i);
					break;
				}
		}
	}
}
