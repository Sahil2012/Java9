
import java.io.*;

class Score {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int [] score = new int[Integer.parseInt(br.readLine())];
		int total = 0;

		for(int i = 0; i < score.length; i++) {

			score[i] = Integer.parseInt(br.readLine());
			total += score[i];
		}

		System.out.println("Total Score : " + total);
	}
}
