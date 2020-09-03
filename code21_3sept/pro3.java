
import java.io.*;

class Ohm {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		float i,r,v;

		//Accept the current and resistance in i and r
		i = Integer.parseInt(br.readLine());
		r = Integer.parseInt(br.readLine());

		v = i * r;

		System.out.println("Voltage = " + v);
	}
}
