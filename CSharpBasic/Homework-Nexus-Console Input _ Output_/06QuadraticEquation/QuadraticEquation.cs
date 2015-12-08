using System;
 
class QuadraticEquation
{
    static void Main()
    {
        
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine());
        double d = b * b - (4 * a * c);
        
        if (d < 0)
        {
            Console.WriteLine("no real roots");
        }
        else if (d == 0)
        {
            double x = (-1 * b) / (2 * a);
            Console.WriteLine("x(1,2) = {0}" , x);
        }
        else
        {
            double x2 = ((-1 * b) + Math.Sqrt(d)) / (2 * a);
            double x1 = ((-1 * b) - Math.Sqrt(d)) / (2 * a);
            Console.WriteLine("x1 = {0}" , x1);
            Console.WriteLine("x2= {0}" , x2);
        }
    }
}