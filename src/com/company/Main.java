package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5};
        int array2[] = {2, 5, 6, 9, 8};

        int array3[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("");

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println("");

        for (int a : array) {
            for (int b : array2) {
                if (a == b) {
                    System.out.print(a + " ");
                }
            }
        }

    }
}