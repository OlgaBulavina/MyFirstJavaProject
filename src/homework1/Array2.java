package homework1;

public class Array2 {
    public static void main(String[] args) {
        int N = 10;
        int[] array =  new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.println(array[i]);
        }
        System.out.println();

        int K = array [0];

       for (int i = 0; i < array.length; i++) {
            if(i == 0) {
                array[i] = array[N-1];
            } else if (i == N-1) {
                array[i] = K;
            }
            System.out.println(array[i]);
        }
    }
}
