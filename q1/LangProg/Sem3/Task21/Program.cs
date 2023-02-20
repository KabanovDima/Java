// Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 2D пространстве.
// A (3,6); B (2,1) -> 5,09
// A (7,-5); B (1,-1) -> 7,21

double Distance2D(double ax, double ay, double bx, double by){
    double distance = Math.Sqrt(Math.Pow(bx - ax, 2) + Math.Pow(by - ay, 2));
    return Math.Round(distance, 3);
}

System.Console.WriteLine("Введите координату Х точки А: ");
double AX = Convert.ToDouble(Console.ReadLine());

System.Console.WriteLine("Введите координату Y точки А: ");
double AY = Convert.ToDouble(Console.ReadLine());

System.Console.WriteLine("Введите координату Х точки B: ");
double BX = Convert.ToDouble(Console.ReadLine());

System.Console.WriteLine("Введите координату Y точки B: ");
double BY = Convert.ToDouble(Console.ReadLine());

double result = Distance2D(AX, AY, BX, BY);
System.Console.WriteLine(result);
