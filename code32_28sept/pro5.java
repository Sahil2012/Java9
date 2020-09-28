
import java.util.*;

class Pattern {

	public static void main(String[] args) {

		/* Making a object of Scanner Class */
		Scanner scan = new Scanner(System.in);

		/* Accept the no of rows in rowCount */
		int rowCount = scan.nextInt();

		for(int row = 1,col = 1; row <= rowCount; ) {

			if(col <= rowCount) {

				if((row + col) % 2 == 1)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				col ++;
			} else {

				System.out.println();
				row ++;
				col = 1;
			}
		}
	}
}
