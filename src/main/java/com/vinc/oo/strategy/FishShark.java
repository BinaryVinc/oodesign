package com.vinc.oo.strategy;

/**
 * Created by wangaixu@chuchujie.com on 2017/12/7.
 */
public class FishShark extends Fish {

    public FishShark(Color color) {
        super(color);
    }

    public FishShark() {
    }



    public void summary() {
        environment();
        clasz();
        doBreath();
        showColor();

    }
}
