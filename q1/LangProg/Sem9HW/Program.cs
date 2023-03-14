// Задача 64: Задайте значение N. Напишите программу, которая выведет 
// все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.
// N = 5 -> "5, 4, 3, 2, 1"
// N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"

// System.Console.Write("Enter the number: ");
// int n = Convert.ToInt32(Console.ReadLine());
// int count = 1;

// void PrintFromNToOne(int count){
//     if(count > n){
//         return;
//     }
//     PrintFromNToOne(count + 1);
//     System.Console.Write($"{count} ");
// }
// PrintFromNToOne(count);

// ========================================================

// Задача 66: Задайте значения M и N. Напишите программу, 
// которая найдёт сумму натуральных элементов в промежутке от M до N.
// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30

// System.Console.Write("Enter the first number(M): ");
// int m = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the second number(N): ");
// int n = Convert.ToInt32(Console.ReadLine());

// int SumFromMToN (int m, int n){
//     if(m == n){
//         return n;
//     }else{
//         return m + SumFromMToN (m + 1, n);
//     }
// }
// System.Console.WriteLine(SumFromMToN(m,n));

// ========================================================

// Задача 68: Напишите программу вычисления функции Аккермана с 
// помощью рекурсии. Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m,n) = 9
// m = 3, n = 2 -> A(m,n) = 29

// System.Console.Write("Enter the first number(M): ");
// int m = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the second number(N): ");
// int n = Convert.ToInt32(Console.ReadLine());

// int AkkermanFunc(int m, int n){
//     if(m == 0){
//         return n + 1;
//     }else if(m > 0 && n == 0){
//         return AkkermanFunc(m - 1, 1);
//     }else if(m > 0 && n > 0){
//         return AkkermanFunc(m - 1, AkkermanFunc(m, n - 1));
//     }
//     return 500;
// }

// System.Console.WriteLine(AkkermanFunc(m, n));