
import java.io.*;

class SubCheck {

	public static void main(String... args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine().trim();
		String s2 = br.readLine().trim();

		if(s1.length() < s2.length()) {

			System.out.println(s2 + " is not a substring of " + s1);
		} else {

			int x = 0;
			for(int i = 0; i < s1.length() - s2.length() + 1;i++) {

				if(s1.substring(i,i + s2.length()).equals(s2)) {

					x = 1;
					break;
				}
					
			}
			if(x == 1)
				System.out.println(s2 + " is a Sub String of " + s1);
			else  
				System.out.println(s2 + " is not a Sub String of " + s1);
		}
	}
}
