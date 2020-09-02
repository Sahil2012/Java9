
import java.io.*;

class Velocity {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int dist,time;
		float velo;

		//Accept the distance and time in dist and time
		dist = Integer.parseInt(br.readLine());
		time = Integer.parseInt(br.readLine());

		//Claculating the velocity and storing into velo
		velo = dist / (float)time;		

		System.out.println("The velocity of Particle is " + velo);
	}
}
