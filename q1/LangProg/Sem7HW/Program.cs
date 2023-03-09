// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
// m = 3, n = 4.
// 0,5 7 -2 -0,2
// 1 -3,3 8 -9,9
// 8 7,8 -7,1 9

// System.Console.Write("Enter the heigth of array (m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the length of array (n): ");
// int n = Convert.ToInt32(Console.ReadLine());
// double[,] array = new double [m, n];
// double[,] FillArray(double[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){            
//             array[i,j] =Math.Round((new Random().NextDouble()*10), 2);                        
//         }
//     }
//     return array;
// }
// void PrintArray(double[,] array){
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             System.Console.Write($"{array[i,j]} ");            
//         }
//         System.Console.WriteLine();
//     }
// }
// FillArray(array);
// PrintArray(array);

// ===============================================================

// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
// и возвращает значение этого элемента или же указание, что такого элемента нет.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 17 -> такого числа в массиве нет

// System.Console.Write("Enter the heigth and length of array (m x m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int [m, m];
// System.Console.Write("Enter the 1st index of number to be found in the array: ");
// int a = Convert.ToInt32(Console.ReadLine()) - 1; // -1 вводим для удобсвтва пользователя, 
//                                                 //чтобы пользователь не считал длину массива с нулевого индекса.
// System.Console.Write("Enter the 2nd index of number to be found in the array: ");
// int b = Convert.ToInt32(Console.ReadLine()) - 1;
// int[,] FillArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){                   
//             array[i,j] = new Random().Next(2, 9);                        
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
// Var1 CheckExistNumber
// int CheckExistNumber (int[,] array, int a, int b){
//     int number = -1;
//     // int length = array.GetLength(0);
//     if(a > (array.GetLength(0)-1) || b > (array.GetLength(0)-1)){
//         System.Console.WriteLine("There is no such index.");
//     }  
//     for (int i = 1; i < array.GetLength(0); i++){
//             for (int j = 1; j <array.GetLength(1); j++){
//                 if (i == a && j == b){
//                 number = array[i,j];
//                 } 
//             }
//         }  
//     return number;
// }
// Var2 CheckExistNumber
// void CheckExistNumber (int[,] array, int a, int b){
//     if(a > (array.GetLength(0)-1) || b > (array.GetLength(0)-1)){
//         System.Console.WriteLine("There is no such index.");
//     }  else{
//         System.Console.WriteLine(array[a,b]);
//     }
// }


// FillArray(array);
// PrintArray(array);
// // System.Console.WriteLine(CheckExistNumber(array, a, b));
// CheckExistNumber(array, a, b);

// ===============================================================

// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

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
// double ArithmeticMeanOfColoms (int[,] array){
//     double result = 0;
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             result = result + array[j, i];                        
//         }
//         result = Math.Round(result/array.GetLength(0), 2);
//         System.Console.Write($"{result} ");
//     }
//     return result;
// }
// FillArray(array);
// PrintArray(array);
// ArithmeticMeanOfColoms(array);