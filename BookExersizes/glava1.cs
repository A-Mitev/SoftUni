using System;

namespace BookEx1
{
    class Glava1
    {
        static void Main()
        {
            Console.WriteLine("Добър Ден");
            Console.WriteLine("1");
            Console.WriteLine("101");
            Console.WriteLine("1001");
            Console.WriteLine(DateTime.Now);
            Console.WriteLine(Math.Sqrt(12345));

            for (int i = 2; i < 102; i++)
            {
                if (i%2 == 0)
                {
                    Console.Write(i + ", ");
                }
                else
                {
                    Console.WriteLine("-" + i + ", ");
                }
            }
            int currAge = Int32.Parse(Console.ReadLine());
            Console.WriteLine("YOur age after 10 years will be " + (currAge + 10));
        }
    }
}
