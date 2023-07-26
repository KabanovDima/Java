package Sem2_HW;

public class Task2 {
    public static void main(String[] args) {
        tryCatch();
    }

    private static void tryCatch(){

//        -------------- VAR1 ---------------------------
//        try {
//            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

//                -------------- VAR2 ---------------------------
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int d = 0;
            if(d != 0) {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
            System.out.println("Catching exception: " + "Деление на 0 недопустимо.");




    }

}
