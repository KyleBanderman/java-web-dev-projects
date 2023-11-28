package org.launchcode;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input1 = new Scanner (System.in);
        System.out.println("What is the length of the rectangle?");
        int length = input1.nextInt();

        Scanner input2 = new Scanner (System.in);
        System.out.println("What is the height of the rectangle?");
        int height = input2.nextInt();

        int area = length * height;
        System.out.println("The area of the rectangle is " + area);
    }
}
