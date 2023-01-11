package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        System.out.println("Enter m: ");
        m = scanner.nextInt();
        int[][] a = new int[n][];
        int[][] b = new int[m][];
        for (int i = 0; i < b.length; i++)b[i] = new int [n];

        System.out.println( "Початкова матриця: ");
        for (int i = 0; i < a.length; i++){
            a[i] = new int [m];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = m*i + j;
                System.out.print(a[i][j]+ "   ");
            }
            System.out.println();
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.println("Транспонована матриця: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "   ");
            }
            System.out.println();
        }



    }
}
