
import java.io.*;

class Table {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int num = Integer.parseInt(br.readLine());

		for(int itr = 10;itr >= 1;itr --) {

			System.out.println(num + " * " +itr+" = " + num*itr);
		}
	}
}
