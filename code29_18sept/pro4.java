
import java.io.*;

class Pattern {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		/* Accept the no of rows in rowCount  */
		int rowCount = Integer.parseInt(br.readLine());
		int count = 1;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= row) {

				System.out.print(count + "\t");
				count ++;
				col ++;
			} else {

				col = 1;
				row ++;
				System.out.println();
			}
		}
	}
}
