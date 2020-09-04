
import java.io.*;

class SP {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num = Integer.parseInt(br.readLine());

		System.out.println("Second Succesor : "+(num + 2)+"\nSecond Predecessor : "+(num - 2));
	}
}
