
import java.io.*;

class AgeDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] age = new int[Integer.parseInt(br.readLine())];
		int max,j;

		for(int i = 0; i < age.length; i++) {

			age[i] = Integer.parseInt(br.readLine());
		}
		
		max = age[0];
		j = 0;

		for(int i = 0;i < age.length; i++) {

			if(max < age[i])  {

				max = age[i];
				j = i;
			} 
		}

		System.out.println("Maximum Age is " + max + " at index " + j);
		
	}
}
