
import java.io.*;

class ToggleIndex {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the String : ");
		String s = new String(br.readLine().trim());
	
		char[] s1 = s.toCharArray();

		System.out.print("Enter Index : ");
		int index = Integer.parseInt(br.readLine().trim());

		if(index < s.length()) {

			if(s1[index] >= 65 && s1[index] <= 90)
				s1[index] = (char)((int)s.charAt(index) + 32);
			else
				s1[index] = (char)((int)s.charAt(index) - 32);

			s = new String(s1);
			System.out.println(s);
		} else {

			System.out.println("Invalid Index");
		}
	}
}
