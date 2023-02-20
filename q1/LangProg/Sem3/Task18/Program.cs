// Напишите программу, которая по заданному номеру четверти, показывает диапазон возможных координат точек в этой четверти (x и y).

// Var1:
// int TypeQuarter (string message){
//     System.Console.WriteLine(message);
//     int result = Convert.ToInt32(Console.ReadLine());
//     return result;
// }

// string QuarterRange (int quarter){
//     string result = "";
//     if(quarter == 1) {
//         result = "The range of values is: X > 0; Y > 0";
//     } else if(quarter == 2) {
//         result = "The range of values is: X < 0; Y > 0";
//     } else if(quarter == 3) {
//         result = "The range of values is: X < 0; Y < 0";
//     } else if(quarter == 4) {
//         result = "The range of values is: X > 0; Y < 0";
//     } else {
//         result = "You entered a number not in the range from 1 to 4";
//     }
//     return result;
// }
// int quarter = TypeQuarter("Enter the number of quorter (1 to 4): ");
// string result = QuarterRange(quarter);
// System.Console.WriteLine(result);

//Var2:

int TypeQuarter (string message){
    System.Console.WriteLine(message);
    int result = Convert.ToInt32(Console.ReadLine());
    return result;
}

bool Checked (int quarter){
    if(quarter >= 1 && quarter <=4){
        return true;
    } else {
        return false;
    }
}

string[] arr = {"x > 0, y > 0", "x < 0, y > 0", "x < 0, y < 0", "x > 0, y < 0" };
int quarter = TypeQuarter("Enter the number of quorter (1 to 4): ");

if (Checked(quarter)){
    System.Console.WriteLine(arr[quarter - 1]);
} else {
    System.Console.WriteLine("You entered a number not in the range from 1 to 4");
}


