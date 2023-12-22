package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        do {
            System.out.println("What is the radius of the circle?");
            double radius = input.nextDouble();
            if (radius < 0) {
                System.out.println("Please enter a positive number.");
            } else {
                double area = Circle.getArea(radius);
                System.out.println("The area of your circle is " + area);
                break;
            }
        }
        while (0 == 0);
    }
}
