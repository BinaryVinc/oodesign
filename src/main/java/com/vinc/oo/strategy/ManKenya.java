package com.vinc.oo.strategy;

/**
 * Created by wangaixu@chuchujie.com on 2017/12/7.
 */
public class ManKenya extends Man {

    public ManKenya() {
    }

    public ManKenya(Color colorr, Live live) {
        super(colorr, live);
    }

    @Override
    public void language() {
        System.out.println(" language: kiswahili ...");
    }

    public void against() {
        System.out.println(" against: i will do ...");
    }

    public void nation() {
        System.out.println(" nation: i am Kenya ...");
    }
    public void summary() {
        manSummary();
        against();
    }

    public void welcomed() {
        System.out.println(" welcomed: ok ...");
    }
}
