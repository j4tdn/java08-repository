package java08.immutable;

import javax.swing.*;

public class StringCounter {
    private int numberOfLowerChars;
    private int numberOfUpperChars;
    private  int numberOfDigit;

    public StringCounter() {
    }

    public StringCounter(int numberOfLowerChars, int numberOfUpperChars, int numberOfDigit) {
        this.numberOfLowerChars = numberOfLowerChars;
        this.numberOfUpperChars = numberOfUpperChars;
        this.numberOfDigit = numberOfDigit;
    }

    public int getNumberOfLowerChars() {
        return numberOfLowerChars;
    }

    public void setNumberOfLowerChars(int numberOfLowerChars) {
        this.numberOfLowerChars = numberOfLowerChars;
    }

    public int getNumberOfUpperChars() {
        return numberOfUpperChars;
    }

    public void setNumberOfUpperChars(int numberOfUpperChars) {
        this.numberOfUpperChars = numberOfUpperChars;
    }

    public int getNumberOfDigit() {
        return numberOfDigit;
    }

    public void setNumberOfDigit(int numberOfDigit) {
        this.numberOfDigit = numberOfDigit;
    }

    @Override
    public String toString() {
        return "StringCounter{" +
                "numberOfLowerChars=" + numberOfLowerChars +
                ", numberOfUpperChars=" + numberOfUpperChars +
                ", numberOfDigit=" + numberOfDigit +
                '}';
    }
}
