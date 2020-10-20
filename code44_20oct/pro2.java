
import java.io.*;

class Toggle {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = new String(br.readLine().trim());
		char[] str = s1.toCharArray();

		for(int i = 0; i < str.length; i++) {

			if(((int)str[i] >= 65) && ((int)str[i] <= 90))
				str[i] = (char)((int)str[i] + 32);
			else if(((int)str[i] >= 97) && ((int)str[i] <= 122))
				str[i] = (char)((int)str[i] - 32);
		}

		System.out.println(str);
	}
}
