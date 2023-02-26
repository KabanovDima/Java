// Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2

// void FillArray (int[] array){
//     for (int i = 0; i < array.Length; i++){
//         array[i] = new Random().Next(100, 1000);
//     }
// }
// void PrintArray(int[] array){
//     for (int i = 0; i < array.Length; i++){
//         System.Console.Write($"{array[i]} ");
//     }
//     System.Console.WriteLine();
// }
// void CountEvenNumber (int[] array){
//     int count = 0;
//     for (int i = 0; i < array.Length; i++){
//         if((array[i] % 2) == 0){
//             count++;
//         }
//     }
//     System.Console.WriteLine($"The number of even numbers in the array is: {count}");
// }
// System.Console.Write("Enter the array length: ");
// int length = Convert.ToInt32(Console.ReadLine());
// int[] arr = new int[length];
// FillArray(arr);
// PrintArray(arr);
// CountEvenNumber(arr);

// ===============================================================

// Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

// void FillArray(int[] array){
//     for (int i = 0; i < array.Length; i++){
//         array[i] = new Random().Next(1, 5);
//     }
// }
// void PrintArray(int[] array){
//     for (int i = 0; i < array.Length; i++){
//         System.Console.Write($"{array[i]} ");        
//     }
//     System.Console.WriteLine();
// }
// void SummDigitsNotEvenIndex(int[] array){
//     int summ = array[0]; // array[0] чтобы влючить число под индектом 0, потому что 0, это четное число.
//     for (int i = 1; i < array.Length; i++){
//         if((i % 2) != 0){
//             summ = summ + array[i];
//         }
//     }
//     System.Console.WriteLine($"The summ of digits on the not even index is: {summ}");
// }
// System.Console.Write("Enter the array length: ");
// int length = Convert.ToInt32(Console.ReadLine());
// int[] arr = new int[length];
// FillArray(arr);
// PrintArray(arr);
// SummDigitsNotEvenIndex(arr);

// ===============================================================

// Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.
// [3 7 22 2 78] -> 76

// void FillArray(double[] array){
//     for (int i = 0; i < array.Length; i++){
//         array[i] = new Random().Next(-99, 99);
//     }
// }
// void PrintArray(double[] array){
//     for (int i = 0; i < array.Length; i++){
//         System.Console.Write($"{array[i]} ");        
//     }
//     System.Console.WriteLine();
// }
// double Max(double[] arr){
//     double max = arr[0];
//     for (int i = 1; i < arr.Length; i++){
//         if(arr[i] > max) {
//             max = arr[i];
//         }
//     }
//     System.Console.WriteLine($"Maximum digit from array is: {max}");
//     return max;
// }
// double Min(double[] arr){
//     double min = arr[0];
//     for (int i = 1; i < arr.Length; i++){
//         if(arr[i] < min) {
//             min = arr[i];
//         }
//     }
//     System.Console.WriteLine($"Maximum digit from array is: {min}");
//     return min;
// }
// System.Console.Write("Enter the array length: ");
// int length = Convert.ToInt32(Console.ReadLine());
// double[] arr = new double[length];
// FillArray(arr);
// PrintArray(arr);
// double result = Max(arr) - Min(arr);
// System.Console.WriteLine($"The difference between max and min is: {result}");