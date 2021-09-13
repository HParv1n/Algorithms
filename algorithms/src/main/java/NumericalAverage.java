import java.util.Scanner;

public class NumericalAverage {
    public NumericalAverage() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int[] arr = new int[sc.nextInt()];

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
            c += arr[i];
        }

        c /= arr.length;

        for(i = 0; i < arr.length; ++i) {
            if (arr[i] > c) {
                System.out.println(arr[i]);
            }
        }

    }
}