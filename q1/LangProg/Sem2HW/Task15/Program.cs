// Задача 15: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
// 6 -> да
// 7 -> да
// 1 -> нет

System.Console.Write("Enter a number in the range 1-7 inclusive (1 is Mon, 7 is Sun): ");
int number = Convert.ToInt32(Console.ReadLine());

if(number >= 1 && number <=7){
    if (number == 6 || number == 7) {
        System.Console.WriteLine("Yes, it's holiday");
    } else {
        System.Console.WriteLine("No, it's not a holiday");
    }
} else{
    System.Console.WriteLine("You entered a number not from the range 1-7");
}