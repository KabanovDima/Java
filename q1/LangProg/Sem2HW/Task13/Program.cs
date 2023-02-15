// Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6

System.Console.WriteLine("Enter any integer: ");
int number = Convert.ToInt32(Console.ReadLine());

while(number > 1000) {
    number = number /10;

} if(number > 99 && number < 1000){
int digit3 = number%10;

System.Console.WriteLine(digit3);
} else {
    System.Console.WriteLine("There is no third digit. You entered a number less than three digits");
}
