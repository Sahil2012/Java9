
import java.io.*;

class BSUpto {

	public static void main(String... args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuffer s = new StringBuffer(br.readLine().trim());

		for(int i = 0; i < 5; i++) {

			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.print(s.substring(0,5));
	}
}
