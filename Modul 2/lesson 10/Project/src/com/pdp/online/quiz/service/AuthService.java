package com.pdp.online.quiz.service;

import com.pdp.online.quiz.storage.Storage;
import com.pdp.online.quiz.model.Role;
import com.pdp.online.quiz.util.ConsoleUtil;

/**
 * Authentication service: register and login using Storage arrays.
 */
public class AuthService {

    /**
     * Register a new user as STUDENT by defult
     *
     * @return true if registration succeeded, false otherwise
     */
    public static boolean register(String username, String password) {
        if (username == null || username.isBlank() || password == null || password.isBlank()) {
            ConsoleUtil.println("Username and password cannot be empty.");
            return false;
        }
        if (Storage.userExists(username)) {
            ConsoleUtil.println("User already exist");
            return false;
        }
        boolean ok = Storage.addUser(username, password, Role.STUDENT);
        if (!ok) ConsoleUtil.println("User storage is full. Cannot register.");
        return ok;
    }

    /**
     * Login and return role name string if success, null otherwise.
     */
    public static String login(String username, String password) {
        int idx = Storage.findUserIndex(username);
        if (idx == -1) {
            ConsoleUtil.println("User not found");
            return null;
        }
        String storedPassword = Storage.userList[idx][1];
        if (!storedPassword.equals(password)) {
            ConsoleUtil.println("User not found");
            return null;
        }
        return Storage.userList[idx][2];
    }
}
