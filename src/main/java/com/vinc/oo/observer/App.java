package com.vinc.oo.observer;

/**
 * Description
 * java———————— observer Observable ...
 * 使用案例：hystrix 限流降级框架
 *
 * 一个被庄家收割的悲惨境遇
 * Created by vinc on 2018/3/3.
 */
public class App {

    public static void main(String[] args) {
        Market market = new Market();
        new NbOne(market);
        new Vegetables(market);
        System.out.println(" 9:30 is comming ...");
        market.setStr(" go up ! ....");
    }
}
