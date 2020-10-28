
import java.io.*;

class SubStr {

	public static void main(String... args)  throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the String : ");
		String s = new String(br.readLine().trim());

		System.out.print("Enter the Sub-String : ");
		String sub = new String(br.readLine().trim());

		int x = -1;
		for(int i = 0; i < s.length() - sub.length(); i++) {

			if(s.substring(i,sub.length() + i).equals(sub)) {

				x = i;
			}
		}

		if(x == -1) {

			System.out.println("String " + sub + " is not present in " + s);
		} else {

			System.out.println("Last Occurence : " + x);
			
		}
	}
}
