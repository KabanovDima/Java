// VAR1
// int n = Convert.ToInt32(Console.ReadLine());
// for (int i = 1; i <= n; i++){
//    for (int j = 1; j <= n; j++){
//     System.Console.Write(i*j);
//     System.Console.Write("\t");
//    } 
//    System.Console.WriteLine();
// }

// VAR2
int n = Convert.ToInt32(Console.ReadLine());
int[,] array = new int[n,n];

for (int i = 0; i < n; i++){
    for (int j = i; j < n; j++){
        array[i,j] = (i+1)*(j+1);
        array[j,i] = (i+1)*(j+1);
    }
}
for (int i = 0; i < n; i++){
    for (int j = 0; j < n; j++){
        System.Console.Write(array[i,j]);
        System.Console.Write("\t");
    }
    System.Console.WriteLine();
}