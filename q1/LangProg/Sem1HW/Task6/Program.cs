Console.Write ("Type number: ");
int number = Convert.ToInt32(Console.ReadLine());

Console.WriteLine ($"You typed number: {number} ");

int numberEven = number % 2;

if (numberEven == 0) {
    Console.Write($"number {number} is: even");
} else {
    Console.Write($"number {number} is: not even");
}
