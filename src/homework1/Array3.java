package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
          array[i] = console.nextInt();
        }
        System.out.println("Исходный массив - " + Arrays.toString(array));
        System.out.println();

        int [] array2 = new int[array.length/2];
        int [] array3 = new int[array.length/2];

        System.out.println("Массив 2:");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i];
            System.out.println("элемент " + (i+1) + "- " + array2[i]);
        }
        System.out.println("\n" + "Массив 3:");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array[i+5];
            System.out.println("элемент " + (i+1) + "- " + array3[i]);
        }
        console.close();
    }
}
