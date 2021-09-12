/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithmtest;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BinarySearchAlg {

    public static void main(String[] args) {
        int[] arr = new int[100000];

        for (int i = 0; i < 100000; i++) {
            arr[i] = i;
        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int m, cout = 0;
        int arrRight = 1;
        int arrLeft = arr.length;

        while (arrRight < arrLeft) {
            m = (arrRight + arrLeft) / 2;

            if (a > arr[m]) {
                arrRight = m + 1;
            } else {
                arrLeft = m;
            }
            cout++;
        }
        if (a == arr[arrRight]) {
            System.out.println(cout + " " + "defeye tapildi.Tapilan eded: " + arrRight);

        } else {
            System.out.println("tapilmadi");
        }
    }

}
