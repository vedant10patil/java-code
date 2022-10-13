public class UserDefinedException extends Exception
{
	
	static void gameAge(int gamer)
    {
		try
        {
			if(gamer < 19)
				throw new ArithmeticException("Press Start to play");
			else
            {
				System.out.println("Welcome to the lobby");
			}
			
		}
		catch(ArithmeticException e)
        {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args)
    {
		//Taking value more than 19
		gameAge(56);
		//Taking value less than 19
		gameAge(18);
	}

}