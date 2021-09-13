package sort;

import sort.InsertionSort;

import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        for(int size = 10; size < 1000000; size *= 2) {
            testTimeForSize(size);
        }

    }

    public static void testTimeForSize(int size) {
        int[] a = generateRandomArray(size);
        long start = System.currentTimeMillis();
        InsertionSort.sort(a);
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed(" + size + "): " + (float)(end - start) / 1000.0F);
    }

    public static int[] generateRandomArray(int size) {
        int[] a = new int[size];
        Random random = new Random();

        for(int i = 0; i < size; ++i) {
            a[i] = random.nextInt();
        }

        return a;
    }
}