package com.vinc.oo.observer;

/**
 * Description
 * Created by vinc on 2018/3/3.
 */
public interface Subject {
    void register(Observer ob);

    void remove(Observer ob);

    void notifyOb();

}
