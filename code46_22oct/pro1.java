
import java.io.*;

class Replace {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = new String(br.readLine().trim());
		char ch1 = (char)br.read();
		br.skip(1);
		char ch2 = (char)br.read();

		s = s.replace(ch1,ch2);

		System.out.println(s);
	}
}
