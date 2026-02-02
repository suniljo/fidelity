class Except2 
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int z = x / y;

		System.out.println(String.format("%d + %d = %d", x, y , z));

		System.out.println("--- done ----");
	}
}
