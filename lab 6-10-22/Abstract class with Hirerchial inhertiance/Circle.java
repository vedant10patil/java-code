class Circle extends Shape
{
   double r=5;

     public double area()
   {
     return 3.14*r*r;
   }

    double circumference()
    {
      return 2*3.14*r;
    }


     Circle(double radius)
   {
      r=radius;
   }
}