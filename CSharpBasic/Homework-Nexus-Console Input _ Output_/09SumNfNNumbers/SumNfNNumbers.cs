using System;

    class SumNfNNumbers
    {
        static void Main()
        {
            double n = double.Parse(Console.ReadLine());
            double sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += double.Parse(Console.ReadLine());
            }
            Console.WriteLine(sum);
        }
    }
