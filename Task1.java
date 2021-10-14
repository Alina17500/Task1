package ru.vsu.cs.volobueva;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double length = checkCorrectTypeAndRead();
        checkCorrectLength(length);

        double radius = calculateRadius(length);

        double square = calculateSquare(radius);

        printTheAnswer(length, square);
    }

    static double checkCorrectTypeAndRead() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the catheter: length = ");

        if (!scanner.hasNextDouble()) {
            System.out.print("Error: the data type is incorrect");
            System.exit(0);
        }
        return scanner.nextDouble();
    }

    static void checkCorrectLength(double length) {
        if (length <= 0) {
            System.out.print("Error: the data is incorrect");
            System.exit(0);
        }
    }

    static double calculateRadius(double length) {
        return length * Math.sqrt(2) * 0.5;
    }

    static double calculateSquare(double radius) {
        return Math.PI * radius * radius;
    }

    static void printTheAnswer(double length, double square) {
        System.out.printf("for a triangle with a cathet = %1$.3f the area of the circumscribed circle = %2$.3f%n", length, square);
    }
}
