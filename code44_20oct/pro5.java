
import java.io.*;

class Pass {

	public static void main(String... args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = new String(br.readLine().trim());
		int[] arr = {0,0,0,0};

		for(int i = 0; i < s1.length(); i++) {

			if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
				arr[0] = 1;
			else if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
				arr[1] = 1;
			else if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
				arr[2] = 1;
			else if(s1.charAt(i) == '@' || s1.charAt(i) == '$' || s1.charAt(i) == '%' || s1.charAt(i) == '#')
				arr[3] = 1;

		}

		int x = 1;
		for(int i = 0; i < 4; i++) {

			if(arr[i] == 0) {
				x = 0;
				break;
			}
		}

		if(s1.length() >= 8) {
			if(x == 1)
				System.out.println("PassWord Accepted");
			else
				System.out.println("Invalid Password");
		} else { 
			System.out.println("Too Short");
		}
	}
}
