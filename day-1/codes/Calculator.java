/*
class Calculator implements Nums 
{
	public int add(int x, int y){
		return x + y;
	}

	public static void main(String[] args) 
	{
		Nums numsRef = new Calculator();
		int x = 10;
		int y = 20;

		int sum = numsRef.add(x, y);
		System.out.println("Sum = " + sum);
	}
}
*/

class Calculator
{
	public static void main(String[] args) 
	{
		/*
		//- anonymous inner class
		Nums numsRef = new Nums(){
			public int add(int x, int y){
				return x + y;
			}
		};
		*/
		
		/*
		//-- lambda expression
		Nums numsRef = (int x, int y) -> {
							return x + y;
						};
		*/

		/*
		//-- lambda expression
		Nums numsRef = (x, y) -> {
							return x + y;
						};
		*/

		//-- lambda expression
		Nums numsRef = (x, y) -> x + y;
		int x = 10;
		int y = 20;

		int sum = numsRef.add(x, y);
		System.out.println("Sum = " + sum);
	}
}