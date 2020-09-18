
import java.io.*;

class Series {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int diff;

		/* Accept the difference from user */
		diff = Integer.parseInt(br.readLine());

		/* Iterate and print series */
		for(int i = 1;i < 50;i += diff) {

			System.out.print(i + " ");
		}
		System.out.println();
	}
}
