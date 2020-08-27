
import java.io.*;

class Pat {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		//Accept the no of rows in rowCount
		int rowCount = Integer.parseInt(br.readLine());

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= row) {

				System.out.print("0 ");
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}
	}
}
