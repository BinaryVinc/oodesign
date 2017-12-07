package com.vinc.oo.strategy;

/**
 * Created by wangaixu@chuchujie.com on 2017/12/7.
 */
public class ManChinese extends Man {

    public ManChinese() {
    }

    public ManChinese(Color colorr, Live live) {
        super(colorr, live);
    }

    @Override
    public void language() {
        System.out.println(" language: chinese ...");
    }

    public void against() {
        System.out.println(" against: fuck i want to do it but ...");
    }

    public void nation() {
        System.out.println(" nation: i am chenese ...");
    }

    public void summary() {
        manSummary();
//        可以想 但不能做
//        against();

    }

    public void welcomed() {
        System.out.println(" welcomed: very good ...");
    }
}
