package com.pdp.online.quiz;

import com.pdp.online.quiz.service.AuthService;
import com.pdp.online.quiz.service.StudentService;
import com.pdp.online.quiz.service.TeacherService;
import com.pdp.online.quiz.storage.Storage;
import com.pdp.online.quiz.util.ConsoleUtil;

/**
 * Entry point for Quiz Application.
 * App.run() manages menus and main flow (login/register).
 */
public class App {

    public static void main(String[] args) {
        new App().run();
    }

    /**
     * Starts the console application and handles main menu.
     */
    public void run() {
        ConsoleUtil.println("=== Welcome to Quiz System ===");
        Storage.bootstrapSampleUsers();

        while (true) {
            ConsoleUtil.println("\nMain Menu:");
            ConsoleUtil.println("1) Login");
            ConsoleUtil.println("2) Register");
            ConsoleUtil.println("3) Exit");
            int choice = ConsoleUtil.readInt("Select option (1-3): ", 1, 3);
            switch (choice) {
                case 1 -> handleLogin();
                case 2 -> handleRegister();
                case 3 -> {
                    ConsoleUtil.println("Goodbye!");
                    return;
                }
            }
        }
    }

    private void handleRegister() {
        ConsoleUtil.println("\n=== Register ===");
        String username = ConsoleUtil.readLine("Enter username: ");
        String password = ConsoleUtil.readLine("Enter password: ");
        boolean ok = AuthService.register(username, password);
        if (ok) ConsoleUtil.println("User registered successfully with role STUDENT.");
    }

    private void handleLogin() {
        ConsoleUtil.println("\n=== Login ===");
        String username = ConsoleUtil.readLine("Enter username: ");
        String password = ConsoleUtil.readLine("Enter password: ");
        String roleStr = AuthService.login(username, password);
        if (roleStr == null) return;

        switch (roleStr) {
            case "STUDENT" -> {
                ConsoleUtil.println("Logged in as STUDENT.");
                StudentService.menu(username);
            }
            case "TEACHER" -> {
                ConsoleUtil.println("Logged in as TEACHER.");
                TeacherService.menu(username);
            }
            default -> ConsoleUtil.println("Unknown role.");
        }
    }
}
