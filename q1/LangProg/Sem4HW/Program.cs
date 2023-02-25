// ===========================================

// Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.
// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16

// double Degree (double num1, double num2){
//     double result = Math.Pow(num1, num2);
//     System.Console.Write($"{num1} ^ {num2} = {result}");
//     return result;
// }
// System.Console.Write("Enter an integer: ");
// double A = Convert.ToDouble(Console.ReadLine());
// System.Console.Write("To what power should a number be raised?: ");
// double B = Convert.ToDouble(Console.ReadLine());
// Degree(A,B);

// ===========================================

// Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
// 452 -> 11
// 82 -> 10
// 9012 -> 12

// System.Console.Write("Enter the number: ");
// int number = Convert.ToInt32(Console.ReadLine());
// int numbForPrint = number;
// int sum = 0;
// while(number > 0){
//     sum = sum + number%10;
//     number= number / 10;
// }
// System.Console.Write($"sum of numbers {numbForPrint} = {sum}");

// ===========================================

// Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.
// 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
// 6, 1, 33 -> [6, 1, 33]

System.Console.Write("Enter the array length: ");
int lengthArr = Convert.ToInt32(Console.ReadLine());

int[] CreateArray (int number){
    int[] arr = new int[number];
    for (int i = 0; i < arr.Length; i++){
        arr[i] = new Random().Next(0, 99);
    } 
    return arr;
}
void PrintArray(int[] arr){
    for (int i = 0; i < arr.Length; i++){
        System.Console.Write($"{arr[i]}, ");
    }
}
PrintArray(CreateArray(lengthArr));

