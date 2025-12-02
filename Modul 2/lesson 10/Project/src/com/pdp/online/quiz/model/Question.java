package com.pdp.online.quiz.model;

import com.pdp.online.quiz.core.GenericClass;
import com.pdp.online.quiz.core.Quiz;

import java.util.ArrayList;
import java.util.List;


/**
 * Question contains a text and list of answers. Implements Quiz to show itsself.
 */

public class Question extends GenericClass implements Quiz {
    private String questionText;
    private final List<Answer> answers;

    public Question(String questionText) {
        super();
        this.questionText = questionText;
        this.answers = new ArrayList<>();
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public int getAnswerCount() {
        return answers.size();
    }

    /**
     * Add answer
     */
    public void add(Answer answer) {
        answers.add(answer);
    }

    /**
     * Insert answer at index
     */
    public void add(int index, Answer answer) {
        if (index < 0 || index > answers.size()) return;
        answers.add(index, answer);
    }

    /**
     * Delete by object reference
     */
    public boolean delete(Answer answer) {
        return answers.remove(answer);
    }

    /**
     * Delete by index
     */
    public boolean delete(int index) {
        if (index < 0 || index >= answers.size()) return false;
        answers.remove(index);
        return true;
    }

    /**
     * Show question and options formatted
     */
    @Override
    public void show() {
        System.out.print(getQuestionText() + " -> ");
        for (int i = 0; i < answers.size(); i++) {
            System.out.print((i + 1) + ". " + answers.get(i).getText());
            if (i < answers.size() - 1) System.out.print(" , ");
        }
        System.out.println();
    }
}
