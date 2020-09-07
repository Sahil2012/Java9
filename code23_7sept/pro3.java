
import java.io.*;

class QR {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int divident,divisor;

		//Accept the divident and divisor
		divident = Integer.parseInt(br.readLine());
		divisor = Integer.parseInt(br.readLine());

		System.out.println("Quotient : "+(divident/divisor)+"\nRemainder : "+(divident%divisor));
	}
}
