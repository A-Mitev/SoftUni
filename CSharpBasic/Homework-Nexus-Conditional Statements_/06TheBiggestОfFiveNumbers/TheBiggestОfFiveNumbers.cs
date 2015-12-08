using System;

class TheBiggestОfFiveNumbers
{
    static void Main()
    {
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine());
        double d = double.Parse(Console.ReadLine());
        double e = double.Parse(Console.ReadLine());
        string biggest = "The biggest is: ";
        if (a > b && a > c && a > d && a > e)
        {
            Console.WriteLine(biggest + a);
        }
        if (a < b && b > c && b > d && b > e)
        {
            Console.WriteLine(biggest + b);
        }
        if (c > a && c > b && c > d && c > e)
        {
            Console.WriteLine(biggest + c);

        }
        if (d > a && d > b && d > c && d > e)
        {
            Console.WriteLine(biggest + d);
        }
        if (e > a && e > b && e > c && e > d)
        {
            Console.WriteLine(biggest + e);
        }
    }
}
