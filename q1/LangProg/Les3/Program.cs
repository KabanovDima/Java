// ____Вид 1________________________________________________
// void Method1() {
//     System.Console.WriteLine("Author ...");
// }
// Method1();

// ____Вид 2________________________________________________
// void Method2(string msg){
// System.Console.WriteLine(msg);
// }
// Method2(msg: "Text of message");

// void Method21(string msg, int count){
//     int i = 0;
//     while (i < count){
//         System.Console.Write(msg);
//         i++;
//     }
// }
// Method21("h", 5);

//____Вид3___________________________________________________
// int Method3(){
//     return DateTime.Now.Year;
// }
// int year = Method3();
// System.Console.WriteLine(year);

// ____Вид4___________________________________________________
// string Method4(int count, string c){
//     int i = 0;
//     string result = String.Empty;
//     while(i < count){
//     result = result + c;
//     i++;
//     }
//     return result;
// }
// string str = Method4(10, "z");
// System.Console.WriteLine(str);

// string Method4(int count, string c){    
//     string result = String.Empty;
//     for(int i = 0; i < count; i++){
//     result = result + c;    
//     }
//     return result;
// }
// string str = Method4(10, "z");
// System.Console.WriteLine(str);

// ____Таблица умножения_______________________________________
// for (int i = 2; i <=10; i++) {
//     for (int j = 2; j <=10; j++){
//         System.Console.WriteLine($"{i} * {j} = {i * j}");
//     }
//     System.Console.WriteLine();
// }

// ____Заменить элементы текста________________________________
// Дан текст. В нём нужно все пробелы заменить чёрточками, маленькие буквы «к»
// заменить большими «К», а большие «С» заменить на маленькие «с».

// string text = "— Я думаю, — сказал князь, улыбаясь, — что, "
//     + "ежели бы вас послали вместо нашего милого Винценгероде, "
//     + "вы бы взяли приступом согласие прусского короля. "
//     + "Вы так красноречивы. Вы дадите мне чаю?";

// // string s = "qwerty"
// //             012
// //             s[3 //r]

// string Replace(string text, char oldValue, char newValue){
//     string result = String.Empty;
//     for (int i = 0; i < text.Length; i++){
//         if(text[i] == oldValue){
//             result = result + $"{newValue}";
//         } else{
//             result = result + $"{text[i]}";
//         }
//     }
//     return result;
// }

// string newText = Replace(text, ' ', '|');
// System.Console.WriteLine(newText);
// System.Console.WriteLine();

// newText = Replace(newText, 'к', 'К');
// System.Console.WriteLine(newText);
// System.Console.WriteLine();

// newText = Replace(newText, 'С', 'с');
// System.Console.WriteLine(newText);

// ____Сортировка чисел методом выбора_________________________________

int[] arr = {1, 5, 4, 3, 2, 6, 7, 1, 1, };

void PrintArray(int[] arr){
    for (int i = 0; i <arr.Length; i++){
        System.Console.Write($"{arr[i]} ");
    }
    System.Console.WriteLine();
}
void SelectionSort(int[] arr){
    for (int i = 0; i < arr.Length - 1; i++)
    {
        int minPosition = i;
        for (int j = i + 1; j <arr.Length; j++){
            if(arr[j] < arr[minPosition]){
                minPosition = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[minPosition];
        arr[minPosition] = temp;
    }
}
PrintArray(arr);
SelectionSort(arr);
PrintArray(arr);