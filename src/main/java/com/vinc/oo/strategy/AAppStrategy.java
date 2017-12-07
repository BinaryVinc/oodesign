package com.vinc.oo.strategy;

/**
 * Created by wangaixu@chuchujie.com on 2017/12/7.
 * 策略模式
 *
 * 抽取共同,实现具体
 *
 * 少继承多组合
 *
 */
public class AAppStrategy {
    public static void main(String[] args) {

        ColorBlack colorBlack = new ColorBlack();
        LiveAfrica liveAfrica = new LiveAfrica();
        Man kenya = new ManKenya(colorBlack,liveAfrica);
        kenya.summary();

        System.out.println();

        ColorYellow colorYellow = new ColorYellow();
        LiveAsian liveAsian = new LiveAsian();
        ManChinese manChinese = new ManChinese(colorYellow,liveAsian);
        manChinese.summary();

        System.out.println();

        ColorWhite colorWhite = new ColorWhite();
        LiveEurope liveEurope = new LiveEurope();
        ManEnglish manEnglish = new ManEnglish(colorWhite, liveEurope);
        manEnglish.summary();


        System.out.println("---------------------------------------");

        FishShark fishShark = new FishShark(colorWhite);
        fishShark.summary();


    }
}
