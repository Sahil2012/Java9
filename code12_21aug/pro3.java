
class Emp {

	public static void main(String... args) {

		int age = 28;
		char sex = 'F',marital = 'N';

		//checking criteria for working
		if((sex == 'F' ) || (sex == 'M' && (age >= 40 && age <= 60))) {

			System.out.println("You can work in Urban area");
		} else if(sex == 'M' && (age >= 20 && age < 40)){

			System.out.println("You can work anywhere");
		} else {

			System.out.println("Not fit for the job");
		}
	}
}
