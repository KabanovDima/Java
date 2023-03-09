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

// System.Console.Write("Enter the heigth of array (m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the length of array (n): ");
// int n = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int[m,n];
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

// int[,] ChangeRowToColoms(int[,] array){
//     int[,] newArray = new int[array.GetLength(1), array.GetLength(0)];
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             newArray[j,i] = array[i,j];
//         }
//     }
//     return newArray;
// }

// FillArray(array);
// PrintArray(array);
// System.Console.WriteLine();
// int[,] changedArray =  ChangeRowToColoms(array);
// PrintArray(changedArray);

// =====================================================================

// Задача 57: Составить частотный словарь элементов двумерного массива. 
// Частотный словарь содержит информацию о том, 
// сколько раз встречается элемент входных данных.
// 1, 2, 3
// 4, 6, 1
// 2, 1, 6
// 1 встречается 3 раза
// 2 встречается 2 раза
// 3 встречается 1 раз
// 4 встречается 1 раз
// 6 встречается 2 раза

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
// int MaxValue(int[,] array){
//     int maxNumber = 0;
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             if(array[i,j] > maxNumber){
//                 maxNumber = array[i,j];
//             }
//         }
//     }
//     // System.Console.WriteLine(maxNumber);
//     return maxNumber;
// }
// void Print2DArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){                
//         for (int j = 0; j < array.GetLength(1); j++){
//             System.Console.Write($"{array[i,j]} ");
//         }
//         System.Console.WriteLine();
//     }
//     System.Console.WriteLine();
// }
// void Print1DArray(int[] array){    
//     for (int i = 0; i < array.GetLength(0); i++){
//         if(array[i] != 0){
//         System.Console.WriteLine($"The digits {i} appears {array[i]} times");
//         }
//     }
//     System.Console.WriteLine();
// }
// int[] FrequencyDictionary(int[,] array){
//     int[] countArray = new int[MaxValue(array)+1];

//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             countArray[array[i,j]]++;
//         }
//     }
//     return countArray;
// }

// FillArray(array);
// Print2DArray(array);
// MaxValue(array);
// System.Console.WriteLine();
// int[] countArray = FrequencyDictionary(array);
// Print1DArray(countArray);

// =====================================================================

// Задача 59: Задайте двумерный массив из целых чисел. Напишите программу, которая
// удалит строку и столбец, на пересечении которых расположен элемент массива.
// Например, задан массив:
// 1 4 7 2 
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Наименьший элемент 1, на выходе получим следующий массив:
// 9 4 2
// 2 2 6
// 3 4 7

// System.Console.Write("Enter the heigth and length of array (m x m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int [m, m];
// int indexMinDigitI = 0;
// int indexMinDigitJ = 0;
// int[,] FillArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){                   
//             array[i,j] = new Random().Next(2, 5);                        
//         }
//     }
//     return array;
// }
// int MinValue(int[,] array){
//     int minNumber = 0;
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             if(array[i,j] < minNumber){
//                 minNumber = array[i,j];
//                 indexMinDigitI = i;
//                 indexMinDigitJ = j;              
//             }
//         }
//     }
//     return minNumber;
// }
// void Print2DArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){                
//         for (int j = 0; j < array.GetLength(1); j++){
//             System.Console.Write($"{array[i,j]} ");
//         }
//         System.Console.WriteLine();
//     }
//     System.Console.WriteLine();
// }
// void Print2DArrayWoMinIndex(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){                
//         for (int j = 0; j < array.GetLength(1); j++){
//             if(indexMinDigitI != i && indexMinDigitJ != j){
//             System.Console.Write($"{array[i,j]} ");
//             }
//         }
//         System.Console.WriteLine();
//     }
//     System.Console.WriteLine();
// }

// FillArray(array);
// Print2DArray(array);
// MinValue(array);
// System.Console.WriteLine();
// Print2DArrayWoMinIndex(array);