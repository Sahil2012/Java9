
import java.io.*;

class SubStr {

	public static void main(String... args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = new String(br.readLine().trim());
		String sub = new String(br.readLine().trim());

		if(s.substring(0,sub.length()).equals(sub))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
