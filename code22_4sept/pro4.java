
import java.io.*;

class Pat {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int rowCount = Integer.parseInt(br.readLine());
		int count = rowCount - 1;

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= row) {

				System.out.print(count + " ");
				count++;
				column ++;
			} else {
				
				column = 1;
				row ++;
				count = rowCount - row;
				System.out.println();
			}			
		}
	}
}
