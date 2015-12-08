using System;

class PrintCompanyInformation
{
    static void Main()
    {
        Console.Write("Company name: ");
        string compName = Console.ReadLine();
        Console.Write("Company address: " );
        string compAddress = Console.ReadLine();
        Console.Write("Enter phone number: ");
        string phoneNumber = Console.ReadLine();
        Console.Write("Enter fax number: ");
        string faxNumber = Console.ReadLine();
        if (string.IsNullOrEmpty(faxNumber))
        {
            faxNumber = "(no fax)";
        }
        Console.Write("Enter site: ");
        string site = Console.ReadLine();
        Console.Write("Manager first name: ");
        string firstName = Console.ReadLine();
        Console.Write("Manager last name: ");
        string lastName = Console.ReadLine();
        Console.Write("Manager age: ");
        string age = Console.ReadLine();
        Console.Write("Manager phone: ");
        string phone = Console.ReadLine();
        Console.WriteLine("\n" + "**********************************************" + "\n");
        Console.WriteLine("{0}\n{1}\n{2}\n{3}\n{4}\n{5} {6}", compName,"Address: " + compAddress,"Tel: " + phoneNumber,"Fax: " + faxNumber,"Web site: " + site,"Manager: " + firstName + " " + lastName,"(age: \n" + age + ", tel. " + phone + ")");
    }
}