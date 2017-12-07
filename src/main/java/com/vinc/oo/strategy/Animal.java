package com.vinc.oo.strategy;

/**
 * Created by wangaixu@chuchujie.com on 2017/12/7.
 */
public abstract class Animal {

    private Breath breath;

    public Animal() {
    }

    public Animal(Breath breath) {
        if(breath == null)
            breath = new BreathWithLung();
        this.breath = breath;
    }

    public void doBreath(){
        breath.beath();
    }

    abstract void clasz();  //类
    abstract void environment(); //生活环境
    abstract void showColor(); //生物颜色
    abstract void summary();    //总结

}
