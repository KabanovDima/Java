// Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.
// A (3,6,8); B (2,1,-7), -> 15.84
// A (7,-5, 0); B (1,-1,9) -> 11.53

double Distance3D (double Xa, double Xb, double Ya, double Yb, double Za, double Zb) {
    double result = Math.Sqrt(Math.Pow(Xa - Xb, 2) + Math.Pow(Ya - Yb, 2) + Math.Pow(Za - Zb, 2));
    return Math.Round(result, 2);
}

System.Console.Write("Введите координату Х точки a: ");
double Xa = Convert.ToDouble(Console.ReadLine());
System.Console.Write("Введите координату Y точки a: ");
double Ya = Convert.ToDouble(Console.ReadLine());
System.Console.Write("Введите координату Z точки a: ");
double Za = Convert.ToDouble(Console.ReadLine());

System.Console.Write("Введите координату Х точки b: ");
double Xb = Convert.ToDouble(Console.ReadLine());
System.Console.Write("Введите координату Y точки b: ");
double Yb = Convert.ToDouble(Console.ReadLine());
System.Console.Write("Введите координату Z точки b: ");
double Zb = Convert.ToDouble(Console.ReadLine());

double distance = Distance3D(Xa, Xb, Ya, Yb, Za, Zb);
System.Console.WriteLine(distance);

