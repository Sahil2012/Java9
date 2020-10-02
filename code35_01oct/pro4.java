
import java.io.*;
import java.util.*;

class ArrayScore {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the total no of overs : ");
		int[] arr = new int[Integer.parseInt(br.readLine()) * 6];	
		int six = 0,four = 0,otr = 0,sum = 0,dot = 0;
		for(int i = 0;i < arr.length;i++) {

			System.out.print("Runs on " + (i+1) + " ball : ");
			arr[i] = Integer.parseInt(br.readLine());

			sum += arr[i];
			if(arr[i] == 6)
				six += 1;
			else if(arr[i] == 4)
				four += 1;
			else if(arr[i] == 0)
				dot += 1;
			else 
				otr += 1;
		}		

		System.out.println("-----------ScoreCard------------");
		System.out.println("Total Score : " + sum);
		System.out.println("Total no of balls : " + arr.length);
		System.out.println("Total no of sixes : " + six);
		System.out.println("Total no of fours : " + four);
		System.out.println("Others : " + otr);
		System.out.println("--------------------------------");

		
	}
}
