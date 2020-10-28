
import java.io.*;

class AlterAppend {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the String1 : ");
		StringBuilder s1 = new StringBuilder(br.readLine().trim());
		
		System.out.print("Enter the String2 : ");
		StringBuilder s2 = new StringBuilder(br.readLine().trim());

		StringBuilder s3 = new StringBuilder();

		if(s1.length() <= s2.length()) {

			for(int i = 0; i < s1.length(); i++) {

				s3.append(s1.charAt(i));
				s3.append(s2.charAt(i));
			}
			s3.append(s2.substring(s1.length(),s2.length()));
		} else {

			for(int i = 0; i < s2.length(); i++) {

				s3.append(s1.charAt(i));
				s3.append(s2.charAt(i));
			}
			s3.append(s1.substring(s2.length(),s1.length()));
		}

		System.out.println(s3);

	}
}
