import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задвача 1");
        int [] massiv = new int[]{1,2,3};
        massiv [0] = 1;
        massiv [1] = 2;
        massiv [2] = 3;
        for ( int i = 0; i < 3; i++ ){
            System.out.println( massiv[i]);
        }
        float[] number = new float[]{1.57f, 7.654f,9.986f} ;
        for ( int i = 0; i < 3; i++) {
            System.out.println(number[i]);
        }

        System.out.println("Задача2");
        int [] massiv1 = new int[]{1,2,3};
        for ( int r = 0; r < 3; r++){
            System.out.print( massiv1[r]);
            if (r != massiv1.length -1){
            System.out.print(", ");}
        }
        System.out.println();
        float[] number1 = new float[]{1.57f, 7.654f,9.986f} ;
        for ( int y = 0; y < 3; y++){
            System.out.print(number1[y]);
            if (y!= number1.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача3");
        int [] mass2 = new int[]{1,2,3};
        for (int i = mass2.length - 1; i>=0;i--){
            if (i == mass2.length -1 ) {
                System.out.print(mass2[i]);
            }else {
                System.out.print(", " + mass2[i]);
            }
        }
        System.out.println();
        float[] number2 = new float[]{1.57f, 7.654f,9.986f} ;
        for (int y = number2.length - 1; y>=0; y--){
            if (y == number2.length -1) {
                System.out.print(number2[y]);
            }else {
                System.out.print(" , " + number2[y]);
            }
        }
        System.out.println();
        System.out.println("Задача4");
        int [] arr = new int []{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        }








    }