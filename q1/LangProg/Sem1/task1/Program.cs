Console.Write("Inter number 1: ");
int number1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Inter number 2: ");
int number2 = Convert.ToInt32(Console.ReadLine());

if (number1/number2 == number2){
    Console.Write($"Число {number1} является квадратом чиста {number2}");
} else
{
    Console.Write($"Число {number1} не является квадратом числа {number2}");
}


