package org.example;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    int[][] gameBoard = new int[10][10];

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.printf("[ ]", gameBoard[i][j]);
        }
        System.out.println();
    }

//    System.out.println(Arrays.deepToString(boardArray[i][j]));

    }
}