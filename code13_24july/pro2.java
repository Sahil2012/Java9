
class SumOfNatural {

	public static void main(String... args) {

		//taking the range where to stop
		int range = 10,sum = 0;

		//looping from 1 to range and calculating the sum
		for(int num = 1;num <= range;num++) {

			sum += num;
		}

		System.out.println("Sum of first " + range + " natural no : " + sum);
	}
}
