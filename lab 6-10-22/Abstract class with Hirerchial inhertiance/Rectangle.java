class Rectangle extends Shape
{
   double x=5,y=6;

   double area()
   {
       return x*y;
   }

   double circumference()
   {
       return 2*(x+y);
   }

   Rectangle(double length, double width)
   {
       x = length;
       y = width;
   }
}