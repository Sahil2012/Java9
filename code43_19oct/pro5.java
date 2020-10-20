
import java.io.*;

class Pattern {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the no of rows : ");
		int row = Integer.parseInt(br.readLine().trim());

		for(int i = 0 , j = 0; i < row; ) {

			if(j <= i + 1) {

				System.out.print((char)(65 + j) + " ");
				j ++;
			} else {

				System.out.println();
				j = 0;
				i ++;
			}
		}
	}
}
