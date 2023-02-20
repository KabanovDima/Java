// Напишите программу, которая принимает на вход число (N) и выдаёт таблицу квадратов чисел
// от 1 до N.
// 5 -> 1, 4, 9, 16, 25.
// 2 -> 1,4

// Var1:
// System.Console.WriteLine("Введите число: ");
// int number = Convert.ToInt32(Console.ReadLine());
// int x = 1;
// int y = 0;

// while (x <= number)
// {
//     y = x * x;
//     System.Console.Write($"{y} ");
//     x++;
// }

//Var2:
System.Console.WriteLine("Введите число: ");
int number = Convert.ToInt32(Console.ReadLine());

for(int i = 1; i <= number; i++){
    System.Console.Write($"{Math.Pow(i, 2)} ");
}
