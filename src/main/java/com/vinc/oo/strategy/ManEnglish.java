package com.vinc.oo.strategy;

/**
 * Created by wangaixu@chuchujie.com on 2017/12/7.
 */
public class ManEnglish extends Man {

    public ManEnglish() {
    }

    public ManEnglish(Color colorr, Live live) {
        super(colorr, live);
    }

    @Override
    public void language() {
        System.out.println(" language: english ...");
    }

    public void against() {
        System.out.println(" against: i can do if i need ...");
    }



    public void nation() {
        System.out.println(" nation:  i am English ...");
    }


    public void summary() {
        manSummary();
        against();
    }

    public void welcomed() {
        System.out.println(" welcomed: good ...");
    }
}
