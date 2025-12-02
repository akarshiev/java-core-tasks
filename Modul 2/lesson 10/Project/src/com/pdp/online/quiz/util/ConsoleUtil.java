package com.pdp.online.quiz.util;

import java.util.Scanner;

/**
 * Console utilities for safe input and output
 */
public class ConsoleUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine(String prompt) {
        System.out.print(prompt);
        String s = scanner.nextLine();
        return s == null ? "" : s.trim();
    }

    public static int readInt(String prompt, int min, int max) {
        while (true) {
            String s = readLine(prompt);
            try {
                int val = Integer.parseInt(s);
                if (val < min || val > max) {
                    System.out.println("Out of range. Enter between " + min + " and " + max);
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid integer.");
            }
        }
    }

    public static void println(String s) {
        System.out.println(s);
    }
}
