package com.vinc.oo.decorate;

/**
 * Description
 * Created by vinc on 2018/3/4.
 */
public class Tencent extends Company {

    public Tencent() {
        desc = "tencent" ;
    }

    /**
     * 初始资金50
     */
    @Override
    public int invest() {
        return 50;
    }
}
