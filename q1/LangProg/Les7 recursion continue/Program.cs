// ___________________________________________________________________________________
// Собрать строку с числами от a до b, a<=b __________________________________________

// string NumbersFor(int a, int b){
//     string result = String.Empty;
//     for (int i = a; i <= b; i++){
//         result += $"{i} ";
//     }
//     return result;
// }
// string NumbersRec(int a, int b){
//     if(a <= b){
//         return $"{a} " + NumbersRec(a + 1, b);
//     } else{
//         return String.Empty;
//     }
// }
// string NumbersRec1(int a, int b){
//     if(a < b){
//         return $"{a} " + NumbersRec(a + 1, b);
//     } else{
//         return Convert.ToString(b);
//     }
// }

// System.Console.WriteLine(NumbersFor(1, 10));
// System.Console.WriteLine(NumbersRec(1, 10));
// System.Console.WriteLine(NumbersRec1(1, 10));

// ___________________________________________________________________________________
// Собрать строку с числами от a до b, a<=b __________________________________________

// string NumbersFor(int a, int b){
//     string result = String.Empty;
//     for (int i = b; i >= a; i--){
//         result += $"{i} ";
//     }
//     return result;
// }
// string NumbersRec(int a, int b){
//     if(a <= b){
//         return NumbersRec(a + 1, b) + $"{a} ";
//     } else{
//         return String.Empty;
//     }
// }

// System.Console.WriteLine(NumbersFor(1, 10));
// System.Console.WriteLine(NumbersRec(1, 10));

// ___________________________________________________________________________________
// Сумма чисел от 1 до n _____________________________________________________________

// int SumFor(int n){
//     int result = 0;
//     for (int i = 0; i <= n; i++){
//         result += i;
//     }
//     return result;
// }

// int SumRec(int n){
//     if(n == 0){
//         return 0;
//     }else{
//         return n + SumRec(n - 1);
//     }
// }

// System.Console.WriteLine(SumFor(10));
// System.Console.WriteLine(SumRec(10));

// ___________________________________________________________________________________
// Факториал числа____________________________________________________________________

// int FactorialFor(int n){
//     int result = 1;
//     for (int i = 1; i <= n; i++){
//         result = result * i; // result *= i
//     }
//     return result;
// }

// int FactorialRec(int n){
//     if (n == 1){
//         return 1;
//     }else{
//         return n * FactorialRec(n - 1);
//     }
// }

// System.Console.WriteLine(FactorialFor(10));
// System.Console.WriteLine(FactorialRec(10));

// ___________________________________________________________________________________
// Вычислить a в степени n____________________________________________________________

// int PowerFor(int a, int n){
//     int result = 1;
//     for (int i = 1; i <= n; i++){
//         result = result * a; //result *= a
//     }
//     return result;
// }

// int PowerRec(int a, int n){
//     // return n == 0 ? 1 : PowerRec(a, n - 1) * a
//     if(n == 1){
//         return a;
//     }else{
//         return a * PowerRec(a, n - 1);
//     }
// }

// System.Console.WriteLine(PowerFor(2, 10));
// System.Console.WriteLine(PowerRec(2, 10));

// __________________________________________________________________________________
// В некотором машинном алфавите имеются четыре буквы "а", "и", "с" и "в". __________
// Покажите все слова, состоящие из Т букв, _________________________________________
// которые мржно построить из букв этого алфавита.___________________________________

// int n = 1;
// void FindWords( string alphabet, char[] word, int length = 0){
//     if(length == word.Length){
//         System.Console.WriteLine($"{n++} {new String(word)}");
//         return;
//     }
//     for (int i = 0; i < alphabet.Length; i++){
//         word[length] = alphabet[i];
//         FindWords(alphabet, word, length + 1);
//     }
// }

// FindWords("аисв", new char[5]);

// __________________________________________________________________________________
// Работа с директориями_____________________________________________________________

// ----- example1 -----
// string path = "C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/LangProg/Les1/Ex001_HelloConsole";
// DirectoryInfo di = new DirectoryInfo(path);
// System.Console.WriteLine(di.CreationTime);
// FileInfo[] fi = di.GetFiles();
// for (int i = 0; i < fi.Length; i++){
//     System.Console.WriteLine(fi[i].Name);
// }

// ----- example2 -----

// void CatalogInfo(string path, string indent = ""){
//     DirectoryInfo catalog = new DirectoryInfo(path);
//     DirectoryInfo[] catalogs = catalog.GetDirectories();
//     for (int i = 0; i < catalogs.Length; i++){
//         System.Console.WriteLine($"{indent}{catalogs[i].Name}");
//         CatalogInfo(catalogs[i].FullName, indent + "  ");
//     }

//     FileInfo[] files = catalog.GetFiles();
//     for (int i = 0; i < files.Length; i++){
//         System.Console.WriteLine($"{indent}{files[i].Name}");
//     }
// }

// string path = "C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper";
// CatalogInfo(path);

// ____________________________________________________________________________________
// Игра в пирамидки ___________________________________________________________________

// void Towers(string with = "1", string on = "3", string some = "2", int count = 3){
//     if(count > 1){
//         Towers(with, some, on, count - 1);
//     }
//     System.Console.WriteLine($"{with} >> {on}");
//     if(count > 1){
//         Towers(some, on, with, count - 1);  
//     }      
// }

// Towers();

// ____________________________________________________________________________________
// Обход разных структур_______________________________________________________________

// string emp = String.Empty;
// string[] tree = {emp, "/", "*", "10", "-", "+", emp, emp, "4", "2", "1", "3"};
// //                0    1    2     3    4    5    6    7    8    9    10   11

// void InOrderTraversal(int pos = 1){
//     if (pos < tree.Length){
//         int left = 2 * pos;
//         int right = 2 * pos +1;
//         if (left < tree.Length && !String.IsNullOrEmpty(tree[left])){
//             InOrderTraversal(left);
//         }
//         System.Console.WriteLine(tree[pos]);
//         if(right < tree.Length && !String.IsNullOrEmpty(tree[right])){
//             InOrderTraversal(right);
//         }
//     }
// }

// InOrderTraversal();