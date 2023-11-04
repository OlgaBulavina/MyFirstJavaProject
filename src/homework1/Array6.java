package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Задайте длину массива");
        int N = console.nextInt();
        int[] array = new int [N];
        System.out.println("Заполните массив целыми числами");
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        System.out.println("Ваш массив: " + Arrays.toString(array));

        for (int i = 0; i < N; i++) {
            System.out.println("Введите номер элемента массива");
            int number = console.nextInt();
            System.out.println("Элемент массива " + number + " - " + array[number]);
        }
        console.close();
    }
}
