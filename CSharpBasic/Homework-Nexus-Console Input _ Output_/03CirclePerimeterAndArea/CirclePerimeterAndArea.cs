using System;

    class CirclePerimeterAndArea
    {
        static void Main()
        {
            double r = double.Parse(Console.ReadLine());
            double perimeter = (2 * Math.PI) * r;
            Console.WriteLine("{0:00.00}", perimeter);
            double area = Math.PI * Math.Pow(r, 2);
            Console.WriteLine("{0:00.00}", area);
        }
    }
