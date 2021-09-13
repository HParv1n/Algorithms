package sort;

public class MergeSort {
    public MergeSort() {
    }

    public static void sort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    private static void mergeSort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }

    }

    private static void merge(int[] a, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        int i;
        for(i = 0; i < n1; ++i) {
            L[i] = a[p + i];
        }

        for(i = 0; i < n2; ++i) {
            R[i] = a[q + 1 + i];
        }

        L[n1] = 2147483647;
        R[n2] = 2147483647;
        i = 0;
        int j = 0;

        for(int k = p; k <= r; ++k) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                ++i;
            } else {
                a[k] = R[j];
                ++j;
            }
        }

    }
}
