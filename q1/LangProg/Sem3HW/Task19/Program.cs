// Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.
// 14212 -> нет
// 12821 -> да
// 23432 -> да

// Var1:
// System.Console.WriteLine("Enter a five-digit number: ");
// int number = Convert.ToInt32(Console.ReadLine());

// if(((number / 1000) % 10 == (number / 10) % 10) && ((number / 10000) == (number % 10))) {
//     System.Console.WriteLine("Yes");
// } else {
//     System.Console.WriteLine("No");
// }

//Var2:
System.Console.WriteLine("Enter a five-digit number: ");

int[] arr = new int[5];
for(int i = 0; i < arr.Length; i++){
    System.Console.Write($"Enter a {i+1} digit: ");
    arr[i] = Convert.ToInt32(Console.ReadLine());
    
}
System.Console.WriteLine();
System.Console.Write("{0}", string.Join(" ", arr));
System.Console.WriteLine();

int x = 0;
if(arr[x] == arr[arr.Length - 1] && arr[x+1] == arr[arr.Length -2]){
    System.Console.WriteLine("Yes, number is palindrome");
} else {
    System.Console.WriteLine("No, number is not a palindrome");
}


