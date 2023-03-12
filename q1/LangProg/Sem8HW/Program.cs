// Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// В итоге получается вот такой массив:
// 7 4 2 1
// 9 5 3 2
// 8 4 4 2

// System.Console.Write("Enter the heigth and length of array (m x m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int [m, m];

// int[,] FillArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){                   
//             array[i,j] = new Random().Next(0, 7);                        
//         }
//     }
//     return array;
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

// void SortArrayToMin(int[,] array){
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){            
//             for (int k = 0; k < array.GetLength(1)-1; k++){
//                 if(array[i,k] > array[i,k+1]){
//                 int temp = array[i,k+1];
//                 array[i,k+1] = array[i, k];
//                 array[i, k] = temp;                
//                 }
//             }
//         }        
//     } 
//     for (int i = 0; i < array.GetLength(0); i++){
//         for (int j = 0; j < array.GetLength(1); j++){
//             System.Console.Write($"{array[i,j]} ");
//         }
//         System.Console.WriteLine();
//     } 
// }

// FillArray(array);
// Print2DArray(array);
// SortArrayToMin(array);

// ===============================================================================================

// Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка

// System.Console.Write("Enter the heigth of array (m): ");
// int m = Convert.ToInt32(Console.ReadLine());
// System.Console.Write("Enter the length of array (n): ");
// int n = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int [m, n];

// int[,] FillArray(int[,] array){    
//     for (int i = 0; i < array.GetLength(0); i++){        
//         for (int j = 0; j < array.GetLength(1); j++){                   
//             array[i,j] = new Random().Next(0, 7);                        
//         }
//     }
//     return array;
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

// void SumDigitsOfRow(int[,] array){
//     int[] sumArray = new int[array.GetLength(1)];
//     for (int i = 0; i < array.GetLength(0); i++){
//         int sum = 0;
//         for (int j = 0; j < array.GetLength(1); j++){
//             sum = sum + array[i,j];            
//         }
//         sumArray[i] = sum;
//         //System.Console.WriteLine(sum);
//     }
//     for (int i = 0; i < sumArray.Length; i++){
//         System.Console.Write($"{sumArray[i]} ");
//     }
//     System.Console.WriteLine();
    
//     int minIndex = 0;
//     for (int i = 0; i < sumArray.Length; i++){
//         int min = sumArray[0];
//         if(sumArray[i] < min){
//             minIndex = i;
//         }
//     }
//     System.Console.WriteLine($"Line with minimum sum of numbers: {minIndex+1}");
// }

// FillArray(array);
// Print2DArray(array);
// SumDigitsOfRow(array);

// ===============================================================================================

// Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.
// Массив размером 2 x 2 x 2
// 66(0,0,0) 25(0,1,0)
// 34(1,0,0) 41(1,1,0)
// 27(0,0,1) 90(0,1,1)
// 26(1,0,1) 55(1,1,1)

System.Console.Write("Enter the heigth and length of array (m x m x m): ");
int m = Convert.ToInt32(Console.ReadLine());
int[,,] array = new int [m, m, m];

int[,,] FillArray(int[,,] array){    
    for (int i = 0; i < array.GetLength(0); i++){        
        for (int j = 0; j < array.GetLength(1); j++){ 
            for (int k = 0; k < array.GetLength(2); k++){
                array[i,j,k] = new Random().Next(10, 99);
            }
        }
    }
    return array;
}
void Print3DArray(int[,,] array){    
    for (int i = 0; i < array.GetLength(0); i++){                
        for (int j = 0; j < array.GetLength(1); j++){
            for (int k = 0; k < array.GetLength(2); k++){
                System.Console.Write($"{array[i,j,k]} ({i},{j},{k}) ");
            }
            System.Console.WriteLine();            
        }        
    }    
}

FillArray(array);
Print3DArray(array);
