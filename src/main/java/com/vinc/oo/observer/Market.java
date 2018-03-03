package com.vinc.oo.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Description z证券市场
 * Created by vinc on 2018/3/3.
 */
public class Market implements Subject {

    private String news;

    private List<Observer> obs = Collections.synchronizedList(new ArrayList<Observer>());;

    public void register(Observer ob) {
        obs.add(ob);
    }

    public void remove(Observer ob) {
        obs.remove(ob);
    }

    public void notifyOb() {
        obs.forEach(ob -> ob.update(news));
    }

    public void setStr(String s) {
        this.news = s;
        notifyOb();
    }


}
