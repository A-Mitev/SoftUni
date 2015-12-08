using System;

class PlayWithIntDoubleAndString
{
    static void Main()
    {
        Console.WriteLine("Please choose a type: \n1 --> int \n2 --> double \n3 --> string");
        int choise = int.Parse(Console.ReadLine());
        switch (choise)
        {
            case 1: Console.WriteLine(" Please enter a int: ");
                int a = int.Parse(Console.ReadLine());
                Console.WriteLine(++a);
                break;
            case 2: Console.WriteLine("Please enter a double: ");
                double b = double.Parse(Console.ReadLine());
                Console.WriteLine(++b);
                break;
            case 3: Console.WriteLine("Please enter as string:");
                string c = Console.ReadLine();
                Console.WriteLine(c + "*");
                break;
            default: Console.WriteLine("Invalid input!");
                break;
        }
    }
}
