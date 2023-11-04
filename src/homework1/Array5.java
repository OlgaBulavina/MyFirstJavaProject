package homework1;

public class Array5 {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4};
        int [] array2 = new int [array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = (array1.length - i);
            System.out.println(array2[i]);
        }
    }
}
