
class Program4 {

	static boolean isDivisible(int x,int y) {

		if(x % y == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int a = 10 , b = 3;

		boolean res = Program4.isDivisible(a,b);
		
		if(res == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
