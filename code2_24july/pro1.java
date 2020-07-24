
class Check {

	int evenOdd(int x) {

		return (x % 2);
	}
	public static void main(String[] args) {

		Check eo = new Check();
		int res = eo.evenOdd(8);

		if(res == 1)
			System.out.println("It is odd.");
		else
			System.out.println("It is even.");
	
	}
}
