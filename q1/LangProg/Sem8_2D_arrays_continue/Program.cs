// Задача 53: Задайте двумерный массив. Напишите программу, которая поменяет 
// местами первую и последнюю строку массива.

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

// int[,] ChangeFirstAndLastLines(int[,] array){
//     int temp;
//     for (int i = 0; i < array.GetLength(0); i++){
//         temp = array[0, i];
//         array[0, i] = array[array.GetLength(1)-1, i];
//         array[array.GetLength(1)-1, i] = temp;
//     }
//     return array;
// }

// FillArray(array);
// PrintArray(array);
// System.Console.WriteLine();
// ChangeFirstAndLastLines(array);
// PrintArray(array);

// =====================================================================

// Задача 55:Задайте двумерный массив. Напишите программу, которая заменяет строки
// на столбцы.