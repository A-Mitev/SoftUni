using System;

    class BonusScore
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());
            int result = 0;
            if ((n >= 1) && (n <= 3))
            {
                Console.WriteLine(result += (n*10));
            }
            else if ((n >= 4) && (n <= 6))
            {
                Console.WriteLine(result += (n*100));
            }
            else if ((n >= 7) && (n <=9))
            {
                Console.WriteLine(result += (n*1000));
            }
            else
            {
                Console.WriteLine("invalid score");
            }
        }
    }
