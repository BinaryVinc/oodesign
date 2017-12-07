package com.vinc.oo.strategy;

/**
 * Created by wangaixu@chuchujie.com on 2017/12/7.
 */
public abstract class Fish extends Animal {

    private Color color;

    public Fish(Color color) {
        super(new BreathWithGill());
        if(this.color == null)
            new ColorDefault();
        this.color = color;
    }

    public Fish() {
    }

    public void clasz() {
        System.out.println(" clasz: fish ...");
    }


    public void environment() {
        System.out.println(" environment: in the sea ... ");
    }

    public void showColor() {
        color.clo();
    }

}
