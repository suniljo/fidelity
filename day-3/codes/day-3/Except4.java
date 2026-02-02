class Except4 
{
	public static void main(String[] args) 
	{
       try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			int z = x / y;

			System.out.println(String.format("%d + %d = %d", x, y , z));
       }catch(Exception ex){
			System.out.println("exception occured!!");
			System.out.println("message = " + ex.getMessage());
			System.out.println("toString() = " + ex.toString());
			System.out.println();

			ex.printStackTrace();
			System.out.println();
			System.out.println(ex instanceof ArithmeticException);
	   }
	   System.out.println("--- done ----");
	}
}
