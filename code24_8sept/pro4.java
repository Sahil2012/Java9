
import java.io.*;

class Pat2 {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int rowCount,count;

		//Accept the no rows in rowCount
		rowCount = Integer.parseInt(br.readLine());
		count = (2*rowCount) - 1;

		if(rowCount >= 0) {

			for(int row = 1,column = 1;row <= rowCount;) {
			
				if(column <= row) {

					System.out.print(count + "\t");
					count--;
					column++;
				} else {
					
					column = 1;
					row++;
					count = (2*rowCount) - row;
					System.out.println();
				} 
			}
		} else {

			System.out.println("Invalid Input");
		}
	}
}
