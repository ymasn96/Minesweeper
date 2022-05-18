package org.example;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    int[][] gameBoard = new int[8][10];

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.printf("|_| ", gameBoard[i][j]);
        }
        System.out.println();
    }

//    System.out.println(Arrays.deepToString(boardArray[i][j]));

    }
}