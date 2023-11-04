package homework1;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int sum = 0;

        Scanner console = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array [i] = console.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            sum += array [i];
        }
        System.out.println("Среднее арифметическое введенных чисел - " + (sum/array.length));

        console.close();
    }
}
