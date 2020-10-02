
import java.io.*;

class Marks {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("No of Subjects : ");
		int[] mark = new int[Integer.parseInt(br.readLine())];
		int sum = 0;

		for(int i = 0; i < mark.length;i++) {

			mark[i] = Integer.parseInt(br.readLine());
			
			sum += mark[i];
		}

		System.out.println("Total Marks : " + sum);
		System.out.println("Percentage : " + (((float)sum/((mark.length)*100))*100));
	}
}
