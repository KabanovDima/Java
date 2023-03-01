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
