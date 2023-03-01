// Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 3

// System.Console.Write("How mach numbers you want to inter?: ");
// int x = Convert.ToInt32(Console.ReadLine());
// int[] arr = new int[x];

// for (int i = 0; i < x; i++){
//     System.Console.Write($"Enter the positive or negative integer #{i+1}: ");
//     int n = Convert.ToInt32(Console.ReadLine());
//     arr[i] = n;
// }
// void PrintArray(int[] arr){
//     for (int i = 0; i < arr.Length; i++){
//         System.Console.Write($"You entered: {arr[i]} ");
//     }
// }
// int CountPositiveDigits(int[] arr){
//     int count = 0;
//     for (int i = 0; i < arr.Length; i++){
//         if(arr[i] > 0){
//             count++;
//         }
//     }
//     System.Console.WriteLine($"You enterd {count} positive digits");
//     return count;
// }

// PrintArray(arr);
// System.Console.WriteLine();
// CountPositiveDigits(arr);

// ========================================================================

// Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; 
// значения b1, k1, b2 и k2 задаются пользователем.
// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

// System.Console.Write("Enter b1: ");
// double b1 = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter k1: ");
// double k1 = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter b2: ");
// double b2 = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter k2: ");
// double k2 = Convert.ToInt32(Console.ReadLine());

// double resultx = ((b2-b1)/(k1-k2));
// double resulty = k2 * ((b2-b1)/(k1-k2)) + b2;
// System.Console.WriteLine($"{resultx}, {resulty}");


