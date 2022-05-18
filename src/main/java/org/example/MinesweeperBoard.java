package org.example;

public class MinesweeperBoard {

    private int number;
    private char B;
    private String empty;


    public MinesweeperBoard(int number, char b, String empty) {
        this.number = number;
        B = b;
        this.empty = empty;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getB() {
        return B;
    }

    public void setB(char b) {
        B = b;
    }

    public String getEmpty() {
        return empty;
    }

    public void setEmpty(String empty) {
        this.empty = empty;
    }
}
