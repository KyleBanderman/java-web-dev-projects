package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(4, 2);
        Divide(2, 0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", " ");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> item : studentFiles.entrySet()) {
            if (item.getValue().isBlank()) {
                System.out.println(-1);
                continue;
            }
            System.out.println(CheckFileExtension(item.getValue()));
        }
    }

    public static void Divide(int x, int y) {
        int x1 = x;
        int y1 = y;
        int z = 0;
            try {
                z = x1 / y1;
            } catch (ArithmeticException e) {
                System.out.println("Attempted to divide by 0");
                return;
            }
        System.out.println(z);
    }

    public static int CheckFileExtension(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            try {
                throw new Exception("No File Found");
            } catch (Exception e) {
                System.out.println("No File Found");
            }
        }
        //String lastFiveChars = fileName.substring((fileName.length() - 5));
        //String lastFiveChars = fileName.substring(fileName.length() - 5);
        int stringLengthMinus5 = fileName.length() - 5;
        //String lastFiveChars = fileName.substring(stringLengthMinus5);
        String test = fileName.substring(stringLengthMinus5);
        if (test.equals(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}