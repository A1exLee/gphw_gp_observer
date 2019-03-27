package com.alexlee.dp.observer;

import com.google.common.eventbus.Subscribe;

public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void readQuestion(Question question) {
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" + "您收到了一个来自“"
                + question.getUserName() + "”的提问，希望您解答，问题内容如下：\n" + question.getContent() + "\n");
        answer(question);
    }

    public Answer answer(Question question) {
        Answer answer = new Answer();
        answer.setQuestion(question);
        answer.setName(name);
        answer.setContent("咕泡，做技术人的指路明灯");
        return answer;
    }


}
