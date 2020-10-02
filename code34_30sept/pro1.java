
class Comp {

	public static void main(String[] args) {

		int[] myArr1 = {1789,2035,1899,2013,1458,2458,1254,1472,2365};
		
		int x = 0,y = 0;
		for(int i = 0; i < myArr1.length; i++) {

			if(myArr1[i] == 2013) {
			
				x = 1;
			}	
			else if(myArr1[i] == 2015) {

				y = 1;
			}
		} 

		if(y == 1)
			System.out.println("Array Contains 2015");
		else 
			System.out.println("Array does not Contains 2015");
			
		if(x == 1)
			System.out.println("Array Contains 2013");
		else
			System.out.println("Array does not Contains 2013");
	}
}
