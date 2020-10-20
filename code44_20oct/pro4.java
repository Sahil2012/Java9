
import java.io.*;

class Pallindrome {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = br.readLine();
		char[] str = s1.toCharArray();
		char[] str1 = new char[str.length];

		for(int i = 0; i < str.length; i++) {

			str1[i] = str[str.length - 1 - i];
		}


		if(new String(str1).equals(s1))
			System.out.println(s1 + " is Pallindrome");
		else
			System.out.println(s1 + " is not Pallindrome");
	}
}
