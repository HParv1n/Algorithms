package sort;

public class InsertionSort {
    public InsertionSort() {
    }

    public static void sort(int[] a) {
        for(int j = 1; j < a.length; ++j) {
            int key = a[j];

            int i;
            for(i = j - 1; i >= 0 && a[i] > key; --i) {
                a[i + 1] = a[i];
            }

            a[i + 1] = key;
        }

    }
}