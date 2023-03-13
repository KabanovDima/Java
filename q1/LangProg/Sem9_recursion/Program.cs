// Задача 63: Задайте значение N. Напишите программу, которая 
// выведет все натуральные числа в промежутке от 1 до N.
// N = 5 -> "1, 2, 3, 4, 5"
// N = 6 -> "1, 2, 3, 4, 5, 6"

// System.Console.Write("Enter the number: ");
// int N = Convert.ToInt32(Console.ReadLine());

// void RoadToN(int N){
//     if(N == 0){
//         return;
//     }
//     RoadToN(N - 1);
//     System.Console.Write($"{N} ");
// }
// RoadToN(N);

// ________________________________________________________________________________________

// Задача 65: Задайте значения M и N. Напишите программу, 
// которая выведет все натуральные числа в промежутке от M до N.
// M = 1; N = 5 -> "1, 2, 3, 4, 5"
// M = 4; N = 8 -> "4, 6, 7, 8"

// System.Console.Write("Enter the first number(M): ");
// int M = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the second number(N): ");
// int N = Convert.ToInt32(Console.ReadLine());

// void RoadMToN(int M, int N){
//     if(M > N){
//         return;
//     }
//     RoadMToN(M, N - 1);
//     System.Console.Write($"{N} ");
// }
// RoadMToN(M, N);

// ________________________________________________________________________________________

// Задача 67: Напишите программу, которая будет принимать 
// на вход число и возвращать сумму его цифр.
// 453 -> 12
// 45 -> 9

// System.Console.Write("Enter the number: ");
// int number = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine(Sum(number));

// int Sum(int number){
//     if(number == 0){
//         return 0;
//     }
//     return number % 10 + Sum(number / 10);
// }

// ________________________________________________________________________________________

// Задача 69: Напишите программу, которая на вход принимает два числа A и B, 
// и возводит число А в целую степень B с помощью рекурсии.
// A = 3; B = 5 -> 243 (3⁵)
// A = 2; B = 3 -> 8

// System.Console.Write("Enter the first number(A): ");
// int A = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the second number(B): ");
// int B = Convert.ToInt32(Console.ReadLine());

// int ADegreeB(int A, int B){
//     if(B == 0){
//         return 1;
//     }
//     return A * ADegreeB(A, B - 1);
// }
// System.Console.WriteLine(ADegreeB(A,B));