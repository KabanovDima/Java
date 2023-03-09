// Задача 46: Задайте двумерный массив размером m×n, заполненный случайными целыми числами.
// m = 3, n = 4.
// 1 4 8 19
// 5 -2 33 -2
// 77 3 8 1

// System.Console.Write("Enter the heigth of array (m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the length of array (n): ");
// int n = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int [m, n];

// int[,] FillArray(int[,] array){
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             array[i,j] = new Random().Next(0, 10);
//         }
//     }
//     return array;
// }
// void PrintArray(int[,] array){
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             System.Console.Write($"{array[i,j]} ");            
//         }
//         System.Console.WriteLine();
//     }
// }
// FillArray(array);
// PrintArray(array);

// =================================================================

// Задача 48: Задайте двумерный массив размера m на n, каждый элемент в массиве
//  находится по формуле: Aₘₙ = m+n. Выведите полученный массив на экран.
// m = 3, n = 4.
// 0 1 2 3
// 1 2 3 4
// 2 3 4 5

// System.Console.Write("Enter the heigth of array (m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the length of array (n): ");
// int n = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int [m, n];
// int[,] FillArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){            
//             array[i,j] = i+j;                        
//         }
//     }
//     return array;
// }
// void PrintArray(int[,] array){
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             System.Console.Write($"{array[i,j]} ");            
//         }
//         System.Console.WriteLine();
//     }
// }
// FillArray(array);
// PrintArray(array);

// =================================================================

// Задача 49: Задайте двумерный массив.
// Найдите элементы, у которых оба индекса чётные, и замените эти элементы на их квадраты.

// System.Console.Write("Enter the heigth and length of array (m x m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int [m, m];
// int[,] FillArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){                   
//             array[i,j] = new Random().Next(2, 5);                        
//         }
//     }
//     return array;
// }
// void PrintArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){                
//         for (int j = 0; j < array.GetLength(1); j++){
//             System.Console.Write($"{array[i,j]} ");
//         }
//         System.Console.WriteLine();
//     }
//     System.Console.WriteLine();
// }
// int[,] ChangeArray(int[,] array){
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){ 
//             if((i % 2) == 0 && (j % 2) == 0){
//                 array[i,j] = Convert.ToInt32(Math.Pow(array[i,j], 2));
//             } else {
//                 array[i,j] = array[i,j];
//             }                                    
//         }
//     }
//     return array;
// }
// FillArray(array);
// PrintArray(array);
// ChangeArray(array);
// PrintArray(array);

// =================================================================

// Задача 51: Задайте двумерный массив. Найдите сумму элементов, находящихся на главной диагонали (с индексами (0,0); (1;1) и т.д.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Сумма элементов главной диагонали: 1+9+2 = 12

// System.Console.Write("Enter the heigth and length of array (m x m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int [m, m];
// int[,] FillArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){                   
//             array[i,j] = new Random().Next(2, 5);                        
//         }
//     }
//     return array;
// }
// void PrintArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){                
//         for (int j = 0; j < array.GetLength(1); j++){
//             System.Console.Write($"{array[i,j]} ");
//         }
//         System.Console.WriteLine();
//     }
//     System.Console.WriteLine();
// }
// int SumNumbDiagonal(int[,] array){
//     int sum = 0;
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             if(i == j){
//                 sum += array[i,j];
//                 System.Console.Write($"{array[i,j]} ");
//             }
//         }
//     }
//     System.Console.WriteLine();
//     return sum;
// }

// FillArray(array);
// PrintArray(array);
// System.Console.WriteLine($"Sum diagonal numbers = {SumNumbDiagonal(array)}");