package com.vinc.oo.strategy;

/**
 * Created by wangaixu@chuchujie.com on 2017/12/7.
 */
public abstract class Man extends Animal implements Welcome{

    private Color colorr;
    private Live live;

    public Man() {
        this(null, null);
    }

    public Man(Color colorr, Live live) {
        super(new BreathWithLung());
        if (colorr == null)
            colorr = new ColorDefault();
        if (live == null)
            live = new LiveDefault();
        this.colorr = colorr;
        this.live = live;
    }

    public void clasz() {
        System.out.println(" clasz: human ...");
    }

    public void environment() {
        System.out.println(" environment: on the ground ...");
    }

    public void showColor() {
        colorr.clo();
    }

    public void liveStyle() {
        live.liv();
    }

    public abstract void nation();

    public abstract void language();

    public abstract void against();

    public void manSummary() {
        environment();
        clasz();
        doBreath();
        nation();
        welcomed();
        language();
        showColor();
        liveStyle();
    }


}
