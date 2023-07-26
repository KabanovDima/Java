package Sem2;

import java.util.Arrays;

public class Task2 {

    /**
     * Обработайте возможные исключительные ситуации. "Битые" значения в исходном массиве считайте нулями.
     * Можно внести в код правки, которые считаете необходимыми
    **/
    public static void main(String[] args) {
        String[][] arr0 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };

        String[][] arr = new String[][]{
                {"1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "2"},
                {"3", "4"},
                {"2", "6"}
        };

//        fillArray(arr, 5);
//        System.out.println(Arrays.deepToString(arr));
        sum2d(arr0);
    }

    private static int sum2d(String[][] arr){
        int sum = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum +=val;
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Block catch");
            fillArray(arr, arr.length);
            System.out.println(Arrays.deepToString(arr));
        }catch (NumberFormatException e){
            System.out.println("Введено не число");
            System.exit(1);
        }
        return sum;
    }

    private static String[][] fillArray(String[][] array, int lenght){
        for (int i = 0; i < lenght; i++) {
            String[] current = array[i];
            if(current.length < lenght){
                String[] temp = new String[lenght];
                System.arraycopy(current, 0,temp,0, current.length);
                for (int j = current.length; j < lenght; j++) {
                    temp[j] = "0";
                }
                current = temp;
                array[i] = current;
            }
        }
        return array;
    }
}
