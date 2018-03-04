package com.vinc.oo.decorate;

/**
 * Description
 * Created by vinc on 2018/3/4.
 */
public class Xiaomi extends Company {
    public Xiaomi() {
        desc = "xiaomi";
    }

    /**
     * 初始资金100w
     */
    @Override
    public int invest() {
        return 100;
    }
}
