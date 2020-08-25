
class SumAvg {

	public static void main(String[] args) {

		int sum = 0;

		//Looping and calculating the sum
		for(int num = 0;num < 10;num++) {
			int a = Integer.parseInt(args[num]);
			sum += a;
		}

		System.out.println("Sum of 10 numbers : " + sum);

		//Calculating and printing avg
		System.out.println("Average of 10 numbers : " + (sum / 10.0));
	}
}
