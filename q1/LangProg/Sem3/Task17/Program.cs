// // Задача №17. Напишите программу, которая принимает на вход координаты точки (X и Y),
// // причем X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости, в которой находится эта точка.

int PromtStringtoInt (string message) {
    System.Console.WriteLine(message);
    int result = Convert.ToInt32(Console.ReadLine());
    return result;
}

string Quaters (int x, int y){
    string result = "";
    if (x > 0 && y > 0){
        result = "Point lies in the first quarter";
    } else if (x < 0 && y > 0){
        result = "Point lies in the second quarter";
    } else if (x < 0 && y < 0){
        result = "Point lies in the third quarter";
    } else if (x > 0 && y < 0){
        result = "Point lies in the fourth quarter";
    } else {
        result = "Point lies on one of the axes";
    }
    return result;
}


int X = PromtStringtoInt("Enter X coordinate: ");
int Y = PromtStringtoInt("Enter Y coordinate: ");
string quarter = Quaters (X, Y);
System.Console.WriteLine(quarter);