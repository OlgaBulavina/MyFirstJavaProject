package ArraysSortings;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] array = {7, 15, 2, 1, 8, 6, 3, 22, 11, 5};

        //пузырьковая сортировка

        for (int i = 0; i < array.length; i++) {
            int temp;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array [j] = array[j+1];
                    array[j+1] = temp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
