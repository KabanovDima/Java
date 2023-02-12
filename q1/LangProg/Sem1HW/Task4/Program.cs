Console.Write ("Type number 1: ");
int number1 = Convert.ToInt32(Console.ReadLine());
Console.Write ("Type number 2: ");
int number2 = Convert.ToInt32(Console.ReadLine());
Console.Write ("Type number 3: ");
int number3 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine ($"You typed two numbers: {number1}, {number2}, {number3}.");

int MAX = 0;

if(number1 > number2) {
    MAX = number1;
} else {
    MAX = number2;
}
if (number3 > MAX){
    MAX = number3;
}
Console.Write($"MAX number is: {MAX}");