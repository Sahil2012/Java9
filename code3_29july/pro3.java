
class Program3 {

	public static void main(String[] args) {
	
		int a = 40,b = 70,c = 130;

		if(a >= b && a >= c) {

			System.out.println("Largest no is " + a);
		} else if(b >= a && b >= c) {

			System.out.println("Largest no is " + b);
		} else {

			System.out.println("Largest no is " + c);
		}
	}
}
