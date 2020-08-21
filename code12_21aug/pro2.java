
class ElectricBill {

	public static void main(String... args) {

		//unit store unit of electricity used
		int unit = 100;

		if(unit <= 50) {

			System.out.println("Bill amount = " + (unit*0.5));
		} else if(unit <= 150) {

			System.out.println("Bill amount = " + (unit*0.75));
		} else if(unit <= 250) {

			System.out.println("Bill amount = " + (unit*1.2));
		} else if(unit > 250) {

			System.out.println("Bill amount = " + (unit * 1.5));
		}
	}
}
