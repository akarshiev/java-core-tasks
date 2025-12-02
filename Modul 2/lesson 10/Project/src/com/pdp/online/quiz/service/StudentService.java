package com.pdp.online.quiz.service;

import com.pdp.online.quiz.storage.Storage;
import com.pdp.online.quiz.model.Question;
import com.pdp.online.quiz.model.Answer;
import com.pdp.online.quiz.util.ConsoleUtil;

import java.util.List;

/**
 * Handles student menu and quiz flow.
 */
public class StudentService {

    public static void menu(String username) {
        while (true) {
            ConsoleUtil.println("\nStudent Menu:");
            ConsoleUtil.println("1) Start");
            ConsoleUtil.println("2) Exit");
            int c = ConsoleUtil.readInt("Select (1-2): ", 1, 2);
            if (c == 2) return;
            startQuiz(username);
        }
    }

    private static void startQuiz(String username) {
        if (Storage.questionCount == 0) {
            ConsoleUtil.println("No quizzes available.");
            return;
        }
        ConsoleUtil.println("\n=== Quiz started ===");
        for (int i = 0; i < Storage.questionCount; i++) {
            Question q = Storage.questions[i];
            q.show();
            int max = q.getAnswerCount();
            int choice = ConsoleUtil.readInt("Your answer (1-" + max + "): ", 1, max);
            List<Answer> answers = q.getAnswers();
            boolean correct = answers.get(choice - 1).isCorrect();
            Storage.saveUserResult(q.getQuestionText(), String.valueOf(choice), correct);
            ConsoleUtil.println("Your answer is " + (correct ? "correct" : "wrong"));
        }
        ConsoleUtil.println("\n=== Quiz finished. Results: ===");
        for (int i = 0; i < Storage.resultCount; i++) {
            String[] row = Storage.userResult[i];
            if (row[0] == null) continue;
            ConsoleUtil.println(row[0] + " -> " + row[1] + " => " + row[2]);
        }
    }
}
