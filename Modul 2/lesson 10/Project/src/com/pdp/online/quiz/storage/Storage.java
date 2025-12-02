package com.pdp.online.quiz.storage;

import com.pdp.online.quiz.model.Question;
import com.pdp.online.quiz.model.Answer;
import com.pdp.online.quiz.model.Role;

/**
 * Central in-memory storage using arrays matrix as required
 *
 *
 *
 * userList[r] = { username, password, role }
 * questions[] = Question objects
 * userResult[r] = { questionText, userChoiceIndex, correct }
 */
public class Storage {

    public static final String[][] userList = new String[10][3];
    public static int userCount = 0;

    public static final Question[] questions = new Question[10];
    public static int questionCount = 0;

    public static final String[][] userResult = new String[10][3];
    public static int resultCount = 0;

    public static int findUserIndex(String username) {
        for (int i = 0; i < userCount; i++) {
            if (userList[i][0].equals(username)) return i;
        }
        return -1;
    }

    public static boolean userExists(String username) {
        return findUserIndex(username) != -1;
    }

    public static boolean addUser(String username, String password, Role role) {
        if (userCount >= userList.length) return false;
        userList[userCount][0] = username;
        userList[userCount][1] = password;
        userList[userCount][2] = role.name();
        userCount++;
        return true;
    }

    public static boolean addQuestion(Question q) {
        if (questionCount >= questions.length) return false;
        questions[questionCount++] = q;
        return true;
    }

    public static boolean deleteQuestion(int index) {
        if (index < 0 || index >= questionCount) return false;
        for (int i = index; i < questionCount - 1; i++) {
            questions[i] = questions[i + 1];
        }
        questions[--questionCount] = null;
        return true;
    }

    public static boolean updateQuestion(int index, Question q) {
        if (index < 0 || index >= questionCount) return false;
        questions[index] = q;
        return true;
    }

    public static void saveUserResult(String questionText, String userChoice, boolean correct) {
        if (resultCount >= userResult.length) return;
        userResult[resultCount][0] = questionText;
        userResult[resultCount][1] = userChoice;
        userResult[resultCount][2] = String.valueOf(correct);
        resultCount++;
    }

    public static void bootstrapSampleUsers() {
        if (userCount > 0) return;
        addUser("Aly", "pass1", Role.STUDENT);
        addUser("Abdukarim", "pass2", Role.STUDENT);
        addUser("Javohir", "teach1", Role.TEACHER);
        addUser("Atamjon", "pass3", Role.STUDENT);
        addUser("Obidjon", "teach2", Role.TEACHER);
    }
}
