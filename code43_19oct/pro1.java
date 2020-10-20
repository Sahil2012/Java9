
import java.io.*;
import java.util.*;

class ReplaceString {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size of array : ");
		String[] name = new String[Integer.parseInt(br.readLine())];

		System.out.print("Enter the Elements : ");		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i < name.length; i++) {

			name[i] = st.nextToken().trim();
		}

		System.out.print("Find : ");
		String s = new String(br.readLine());

		System.out.print("Replace : ");
		String r = new String(br.readLine());

		/* Replacing s by r */
		int x = 1;
		for(int i = 0; i < name.length; i++) {
			
			if((name[i]).equals(s)) {

				name[i] = r;
				x = 0;
				break;
			}
		}

		if(x == 1) {

			System.out.println(s + " no such name in the array");
		} else {

			System.out.print("Elements in array : ");
			for(int i = 0; i < name.length; i++) {

				System.out.print(name[i] + " ");
			}
			System.out.println();
		}
	}	
}
