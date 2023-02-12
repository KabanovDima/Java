Console.Write ("Type number: ");
int number = Convert.ToInt32(Console.ReadLine());

Console.WriteLine ($"You typed number: {number} ");

int x = 1; 

while (x <= number)
{
    if((x % 2) == 0){
    Console.Write($"{x} ");
    }
    x++;
}


