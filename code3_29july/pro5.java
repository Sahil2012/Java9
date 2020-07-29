
class Program5 {

	static int isEven(int x) {

		int y = x | 1;

		if(y == x)
			return 1;
		else 
			return 0;
	}
	
	public static void main(String[] args) {
		
		int a = 181;

		int res = Program5.isEven(a);

		if(res == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
