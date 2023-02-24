// Задача 24: Напишите программу, которая принимает на вход число (А) и выдаёт сумму чисел от 1 до А. 
// 7 -> 28
// 4 -> 10
// 8 -> 36

// Var1
// int EnterNumber(){
//     System.Console.Write("Enter the number: ");
//     int number = Convert.ToInt32(Console.ReadLine());
//     System.Console.WriteLine($"You typed number: {number}"); 
//     return number;   
// }
// int Summ(int number){
//     int startDigit = 1;
//     int summ = 0; 
//     while (startDigit <= number){
//         summ = summ + startDigit;
//         startDigit++;
//     }
//     System.Console.WriteLine($"Summ digits from 1 to {number} = {summ}");
//     return summ;
// }
// int numb = EnterNumber();
// Summ(numb);

// Var2
// int Sum (int number){
//     int sum = 0;
//     for (int i = 0; i <= number; i++){
//         sum+=i;
//     }
//     return sum;
// }
// System.Console.Write("Enter the integer: ");
// int A = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine($"Summ digit from 1 to {A} = {Sum(A)}");

// ==============================================================================================================

// Задача 26: Напишите программу, которая принимает на вход число и выдаёт количество цифр в числе.
// 456 -> 3
// 78 -> 2
// 89126 -> 5

// int Counter(int number){
//     int count = 0;
//     if(number == 0){
//         count = 1;    
//     }
//     while (number > 0){
//         number = number / 10;
//         count++;
//     }
//     return count;
// }
// System.Console.Write("Enter the integer: ");
// int number = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine($"Количество цифр в числе: {Counter(number)}");

// =============================================================================================================

// Задача 28: Напишите программу, которая принимает на вход число N и выдаёт произведение чисел от 1 до N.
// 4 -> 24
// 5 -> 120

// int MultiplDigits(int numb){
//     int result = 1;
//     for (int i = 2; i <= numb; i++){
//         result*=i;
//     }
//     return result;
// }
// System.Console.Write("Enter an integer: ");
// int result = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine($"Произведение числе от 1 до {result} = {MultiplDigits(result)}");

// ===========================================================================================================

// Задача 30: Напишите программу, которая выводит массив из 8 элементов, заполненный нулями и единицами в случайном порядке.
// [1,0,1,1,0,1,0,0]

int[] arr = new int[8];
for (int i = 0; i <arr.Length; i++){
    System.Console.Write($"{arr[i] = new Random().Next(0,2)} ");
}


