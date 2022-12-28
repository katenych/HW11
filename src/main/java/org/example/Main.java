package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M;
        int N;
        System.out.println("Enter M: ");
        M = scanner.nextInt();
        System.out.println("Enter N: ");
        N = scanner.nextInt();

        int [][] matrix = new int [M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = N * i + j;
            }

        }

        System.out.println("Початкова матриця");
        System.out.println("      ");
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < M; ++j) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < M; i++) {
            for (int j = i+1; j < M; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("Транспонована матриця");
        System.out.println("       ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
