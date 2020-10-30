
import java.io.*;

class AppendStr {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		StringBuffer sb = new StringBuffer(br.readLine().trim());

		/* before Append */
		System.out.println(sb);

		sb.append(br.readLine());

		/* After Append */
		System.out.println(sb);
	}
}
