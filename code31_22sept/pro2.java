
import java.io.*;

class LoopInput {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0,sum = 0;

		for(; num < 50;) {
			
			sum += num;
			num = Integer.parseInt(br.readLine());
		}

		System.out.println("Sum : " + sum);
	}
}
