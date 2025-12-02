package com.pdp.online.quiz.service;

import com.pdp.online.quiz.model.Question;
import com.pdp.online.quiz.model.Answer;
import com.pdp.online.quiz.storage.Storage;
import com.pdp.online.quiz.util.ConsoleUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Teacher operations: create, delete, update, list quizzes.
 */
public class TeacherService {

    public static void menu(String username) {
        while (true) {
            ConsoleUtil.println("\nTeacher Menu:");
            ConsoleUtil.println("1) Create Quiz");
            ConsoleUtil.println("2) Delete Quiz");
            ConsoleUtil.println("3) Update Quiz");
            ConsoleUtil.println("4) List Quiz");
            ConsoleUtil.println("5) Exit");
            int choice = ConsoleUtil.readInt("Select (1-5): ", 1, 5);
            switch (choice) {
                case 1 -> createQuiz();
                case 2 -> deleteQuiz();
                case 3 -> updateQuiz();
                case 4 -> listQuiz();
                case 5 -> {
                    return;
                }
            }
        }
    }

    private static void createQuiz() {
        ConsoleUtil.println("\n=== Create Quiz ===");
        String qtext = ConsoleUtil.readLine("Enter question text: ");
        if (qtext.isBlank()) {
            ConsoleUtil.println("Question cannot be empty.");
            return;
        }
        Question q = new Question(qtext);
        for (int i = 1; i <= 4; i++) {
            String at = ConsoleUtil.readLine("Answer " + i + ": ");
            boolean dummy = false;
            q.add(new Answer(at, false));
        }
        int correctIndex = ConsoleUtil.readInt("Enter correct answer index (1-4): ", 1, 4);
        List<Answer> old = q.getAnswers();
        List<Answer> replaced = new ArrayList<>();
        for (int i = 0; i < old.size(); i++) {
            Answer a = old.get(i);
            replaced.add(new Answer(a.getText(), (i + 1) == correctIndex));
        }
        old.clear();
        old.addAll(replaced);

        boolean ok = Storage.addQuestion(q);
        if (ok) ConsoleUtil.println("Question added.");
        else ConsoleUtil.println("Question storage full. Cannot add.");
    }

    private static void deleteQuiz() {
        ConsoleUtil.println("\n=== Delete Quiz ===");
        if (Storage.questionCount == 0) {
            ConsoleUtil.println("No questions to delete.");
            return;
        }
        listQuiz();
        int idx = ConsoleUtil.readInt("Enter index to delete (0-based): ", 0, Storage.questionCount - 1);
        if (Storage.deleteQuestion(idx)) ConsoleUtil.println("Deleted.");
        else ConsoleUtil.println("Delete failed.");
    }

    private static void updateQuiz() {
        ConsoleUtil.println("\n=== Update Quiz ===");
        if (Storage.questionCount == 0) {
            ConsoleUtil.println("No questions to update.");
            return;
        }
        listQuiz();
        int idx = ConsoleUtil.readInt("Enter index to update (0-based): ", 0, Storage.questionCount - 1);
        String qtext = ConsoleUtil.readLine("Enter new question text: ");
        if (qtext.isBlank()) {
            ConsoleUtil.println("Question cannot be empty.");
            return;
        }
        Question q = new Question(qtext);
        for (int i = 1; i <= 4; i++) {
            String at = ConsoleUtil.readLine("Answer " + i + ": ");
            q.add(new Answer(at, false));
        }
        int correctIndex = ConsoleUtil.readInt("Enter correct answer index (1-4): ", 1, 4);
        List<Answer> old = q.getAnswers();
        List<Answer> replaced = new ArrayList<>();
        for (int i = 0; i < old.size(); i++) {
            Answer a = old.get(i);
            replaced.add(new Answer(a.getText(), (i + 1) == correctIndex));
        }
        old.clear();
        old.addAll(replaced);
        if (Storage.updateQuestion(idx, q)) ConsoleUtil.println("Updated.");
        else ConsoleUtil.println("Update failed.");
    }

    private static void listQuiz() {
        ConsoleUtil.println("\n=== Questions List ===");
        if (Storage.questionCount == 0) {
            ConsoleUtil.println("No questions.");
            return;
        }
        for (int i = 0; i < Storage.questionCount; i++) {
            System.out.print("[" + i + "] ");
            Storage.questions[i].show();
        }
    }
}
