package com.vinc.oo.observer;

/**
 * Description  韭菜
 * Created by vinc on 2018/3/3.
 */
public class Vegetables implements Observer, Action {

    private Subject subject;

    private String accpet;

    public Vegetables(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    public void update(String news) {
        this.accpet = news;
        doSomething();
    }

    public void doSomething() {
        System.out.println(accpet + "=== noob is nervous ... buy and lost lots of money ,then go to cliff...");
    }
}
