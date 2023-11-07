package homework2ArraysSortings;

import java.util.Arrays;

public class SortBubbles {
    public static void main(String[] args) {
        int [] array = {7, 15, 2, 1, 8, 6, 3, 22, 11, 5};

        //пузырьковая сортировка

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
        for (int i = 0; i < array.length - i - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array [i] = array[i+1];
                    array[i+1] = temp;
                    System.out.println(Arrays.toString(array));
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
