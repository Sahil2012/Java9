
class Grade {

	public static void main(String... args) {

		//store marks of each sub
		int math = 90,chem = 92,phy = 70,bio = 75,comp = 80;
		float total,percent;

		//Calculating total marks obtained
		total = math + chem + phy + bio + comp;
		
		//Calculating percentage and storing into percent
		percent = (total/500) * 100;

		if(percent >= 90)
			System.out.println("Grade A");
		else if(percent >= 80)
			System.out.println("Grade B");
		else if(percent >= 70)
			System.out.println("Grade C");
		else if(percent >= 60)
			System.out.println("Grade D");
		else if(percent >= 40)
			System.out.println("Grade E");
		else if(percent < 40)
			System.out.println("Grade F");
		
	}
}
