
import java.io.*;

class StrApp {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuffer s = new StringBuffer(br.readLine().trim());
		String s1 = new String(br.readLine());

		s.append(s1);

		System.out.println(s);
	}
}
