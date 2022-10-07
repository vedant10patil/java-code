public class SwapIntegers
{
 public void area(int l, int b) 
 {
  int result = l * b;
  System.out.println(result);
 }
   
   public void area(double l, double b) 
   {
		double result = l * b;
		System.out.println(result);
   }

	    public static void main(String[] args) 
          {
		SwapIntegers si = new SwapIntegers();
		si.area(10, 3);
		si.area(6, 3.5);
	    }

}