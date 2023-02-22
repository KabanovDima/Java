void FillArray(int[] arr){
    int length = arr.Length;
    int index = 0;
    while(index < length){
        arr[index] = new Random().Next(1, 10);
        index++;
    }
}

void PrintArray(int[] array){
    int length = array.Length;
    int index = 0;
    while(index < length) {
        System.Console.Write($"{array[index]} ");
        index++;
    }
}

int IndexOf(int[] array, int find){
    int length = array.Length;
    int index = 0;
    int position = -1;

    while(index < length){
        if(array[index] == find){
            position = index;
            break;
        }
        index++;
    }
    return position;
}

int[] arr = new int[10];

FillArray(arr);
PrintArray(arr);
System.Console.WriteLine();
int pos = IndexOf(arr, 4);
System.Console.WriteLine(pos);
