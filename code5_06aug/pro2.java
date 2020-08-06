
class Scholarship {

	public static void main(String[] args) {

		int year = 3,marks = 62;

		switch(year) {

			case 1 :
			case 2 :
				System.out.println("Not Eligible");
				break;

			case 3 :
			case 4 :
				if(marks >= 60)
					System.out.println("Eligible for Scholarship");
				else 
					System.out.println("Not Eligible");
				break;
		}
	}
}
