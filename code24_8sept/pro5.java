
import java.io.*;

class Perfect {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		//Accept the upper limit in range
		int range = Integer.parseInt(br.readLine());

		if(range >= 1) {

			for(int num = 1;num <= range;num++) {

				int sum = 0;
				for(int div = 1;div <= (num/2);div++) {
	
					if(num % div == 0)
						sum += div;
				}

				if(sum == num)
					System.out.print(num + " ");
			}
			System.out.println();
		} else  if(range <= -1){

		
			for(int num = -1;num >= range;num--) {

				int sum = 0;
				for(int div = -1;div >= (num/2);div--) {
	
					if(num % div == 0)
						sum += div;
				}

				if(sum == num)
					System.out.print(num + " ");
			}
			System.out.println();

		} else {

			System.out.println("Invalid Input");
		} 
	}
}
