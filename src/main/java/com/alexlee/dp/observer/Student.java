package com.alexlee.dp.observer;

import com.google.common.eventbus.Subscribe;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Question ask(String content) {
        Question question = new Question();
        question.setContent(content);
        question.setUserName(name);
        return question;
    }

    @Subscribe
    public void readAnswer(Answer answer) {
        System.out.println("=================================");
        System.out.println(name + " 同学你好，您的提问:\n" +
                answer.getQuestion().getContent() + "\n" +
                "收到一条来自 " + answer.getName() + "老师的回复:\n" +
                answer.getContent()
        );
    }


}
