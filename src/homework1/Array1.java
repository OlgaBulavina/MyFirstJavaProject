package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int [] array = new int[5];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        System.out.println("Исходный массив" + Arrays.toString(array));

        //сортировка массива по возрастанию
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = (i + 1); j < (array.length); j++) {
                if (array [i] > array[j]) {
                    temp = array [i];
                    array [i] = array [j];
                    array [j] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        console.close();
    }
}
