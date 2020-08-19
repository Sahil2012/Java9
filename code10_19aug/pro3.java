
class NOD {

	public static void main(String... args) {

		int Month = 4;

		//Switching Month and trying to match with an Case
		switch(Month) {

			case 1 :
				System.out.println("Jan is a 30 days month.");
				break;

			case 3 :
				System.out.println("March is a 30 days month.");
				break;

			case 5 :
				System.out.println("May is a 30 days month.");
				break;

			case 7 :
				System.out.println("July is a 30 days month.");
				break;

			case 8 :
				System.out.println("Aug is a 30 days month.");
				break;

			case 10 :
				System.out.println("Oct is a 30 days month.");
				break;

			case 12 :
				System.out.println("Dec is a 30 days month.");
				break;

			case 2 :
				System.out.println("Feb is a 28/29 days month.");
				break;

			case 4 :
				System.out.println("April is a 30 days month.");
				break;

			case 6 :
				System.out.println("June is a 30 days month.");
				break;

			case 9 :
				System.out.println("Sept is a 30 days month.");
				break;

			case 11 :
				System.out.println("Nov is a 30 days month.");
				break;

			//If no case matches
			default :
				System.out.println("Wrong Input");
				break;
				

		}
	}
}
