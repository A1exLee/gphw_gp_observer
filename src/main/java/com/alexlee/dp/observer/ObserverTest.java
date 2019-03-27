package com.alexlee.dp.observer;

import com.google.common.eventbus.EventBus;

public class ObserverTest {
    public static void main(String[] args) {

        Teacher tom=new Teacher("tom");
        Teacher james=new Teacher("james");
        Student alexlee=new Student("alexlee");

        EventBus gperAsk=new EventBus();
        gperAsk.register(tom);
        gperAsk.register(james);

        EventBus gperAnswer=new EventBus();
        gperAnswer.register(alexlee);


        Question question=alexlee.ask("请问如何才能成为程序员精英？");
        gperAsk.post(question);
        Answer answer=tom.answer(question);
        gperAnswer.post(answer);


        Question question2=alexlee.ask("请问如何才能不秃头？");
        gperAsk.post(question2);
        Answer answer2=james.answer(question);
        gperAnswer.post(answer2);



    }
}
