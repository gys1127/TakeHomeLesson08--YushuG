package com.android.geostudyguide;

public class Question {

    private int question;
    private boolean isTrue;

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public Question(int question, boolean isTrue) {
        this.question = question;
        this.isTrue = isTrue;
    }
}
