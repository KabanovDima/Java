// Задача 39: Напишите программу, которая перевернёт одномерный массив
// (последний элемент будет на первом месте, а первый - на последнем и т.д.)
// [1 2 3 4 5] -> [5 4 3 2 1]
// [6 7 3 6] -> [6 3 7 6]
// void FillArray (int[] array){
//     for (int i = 0; i < array.Length; i++){
//         array[i] = new Random().Next(1, 10);
//     }
// }
// void PrintArray(int[] array){
//     for (int i = 0; i < array.Length; i++){
//         System.Console.Write($"{array[i]} ");
//     }
//     System.Console.WriteLine();
// }
// void FlipArray(int[] array){
//     for (int i = 0; i < array.Length / 2; i++){
//         int temp = array[i];
//         array[i] = array[array.Length - 1 - i];
//         array[array.Length - 1 - i] = temp;
//     }
// }
// System.Console.Write("Enter the array length: ");
// int length = Convert.ToInt32(Console.ReadLine());
// int[] arr = new int[length];
// FillArray(arr);
// PrintArray(arr);
// FlipArray(arr);
// PrintArray(arr);

// ====================================================================

// Задача 40: Напишите программу, которая принимает на вход три числа и проверяет,
// может ли существовать треугольник сo сторонами такой длины.
// Теорема о неравенстве треугольника: каждая сторона треугольника меньше суммы двух других сторон.

// System.Console.WriteLine("Enter the side A triangle ABC: ");
// int A = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Enter the side B triangle ABC: ");
// int B = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Enter the side C triangle ABC: ");
// int C = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine($"A = {A}, B = {B}, C = {C}");
// if(A + B > C && A + C > B && B + C > A){
//     System.Console.WriteLine("Exist");
//     } else {
//     System.Console.WriteLine("Doesn't exist");
// }

// ====================================================================

// Напишите программу, которая будет преобразовывать десятичное число в двоичное.
// 45 -> 101101
// 3 -> 11
// 2 -> 10

// void BinareView(int number){
//     if (number <= 0){
//         return;
//     } else {
//         BinareView(number / 2);
//         System.Console.Write(number % 2);
//     }
// }
// System.Console.Write("Enter the number: ");
// int number = Convert.ToInt32(Console.ReadLine());
// BinareView(number);

// System.Console.Write("Enter the number: ");
// int number = Convert.ToInt32(Console.ReadLine());
// string arr = "";

// while (number > 0){
//     arr = arr + Convert.ToString(number % 2);
//     number =number / 2;
// }
// System.Console.WriteLine(arr);
// char[] charArray = arr.ToCharArray();
// Array.Reverse(charArray);
// System.Console.WriteLine(string.Join("", charArray));


// ====================================================================

// Задача 44: Не используя рекурсию, выведите первые N чисел Фибоначчи. Первые два числа Фибоначчи: 0 и 1.
// Если N = 5 -> 0 1 1 2 3
// Если N = 3 -> 0 1 1
// Если N = 7 -> 0 1 1 2 3 5 8

// System.Console.Write("Enter the number: ");
// int n = Convert.ToInt32(Console.ReadLine());
// void Fibonacci (int number){
//     int x1 = 0;
//     int x2 = 1;
//     System.Console.Write($"{x1} {x2} ");
//     int res = 0;
//     for (int i = 2; i < n; i++){
//         res = x1 + x2;
//         System.Console.Write($"{res} ");
//         x1 = x2;
//         x2 = res;
//     }
// }
// Fibonacci(n);

// ====================================================================

// Задача 45: Напишите программу, которая будет создавать копию заданного массива с помощью поэлементного копирования.
// System.Console.Write("Enter the length og array: ");
// int len = Convert.ToInt32(Console.ReadLine());
// int[] array = new int[len];
// int[] array1 = new int[len];
// void FillArray(int[] arr){
//     for (int i = 0; i < arr.Length; i++){
//         arr[i] = new Random().Next(0, 10);
//     }
// }
// void PrintArray(int[] arr){
//     for (int i = 0; i < arr.Length; i++){
//         System.Console.Write($"{arr[i]} ");
//     }
// }
// void ArrayCopy(int[] arr){
//     for (int i = 0; i < arr.Length; i++){
//         array1[i] = array[i];
//     }
// }
// FillArray(array);
// PrintArray(array);
// ArrayCopy(array);
// System.Console.WriteLine();
// PrintArray(array1);
