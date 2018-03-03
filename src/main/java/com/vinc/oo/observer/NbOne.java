package com.vinc.oo.observer;

/**
 * Description 牛逼货
 * Created by vinc on 2018/3/3.
 */
public class NbOne implements Observer ,Action {

    private Subject subject;

    private String accept;

    public NbOne(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    public void update(String news) {
        this.accept = news;
        doSomething();
    }

    public void doSomething() {
        System.out.println(accept +" ___ nb is serious ... sell and earn lots of money...");
    }
}
