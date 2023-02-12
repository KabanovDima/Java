Console.Write ("Type number 1: ");
int number1 = Convert.ToInt32(Console.ReadLine());
Console.Write ("Type number 2: ");
int number2 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine ($"You typed two numbers: {number1} and {number2} ");

if(number1 > number2) {
    Console.Write($"MAX number is: {number1}");
} else{
    Console.Write($"MAX number is: {number2}");
}
