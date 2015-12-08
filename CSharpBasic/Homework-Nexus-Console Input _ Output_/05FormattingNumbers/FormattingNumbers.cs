using System;

class FormattingNumbers
{
    static void Main()
    {
        int a = int.Parse(Console.ReadLine());
        if ((a < 0) || (a > 500))
        {
            Console.WriteLine("Invalid input");
        }
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine()); 
        Console.WriteLine("|{0,-10:X}|{1}|{2,10:0.00}|{3,-10:0.000}|", a, Convert.ToString(a, 2).PadLeft(10, '0'), b, c); 
    }
}
