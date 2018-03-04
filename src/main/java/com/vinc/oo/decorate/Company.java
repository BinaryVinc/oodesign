package com.vinc.oo.decorate;

/**
 * Description
 * Created by vinc on 2018/3/4.
 */
public abstract class Company {

    protected String desc = "unknown";

    protected String getDesc() {
        return desc;
    }

    public abstract int invest();
}

