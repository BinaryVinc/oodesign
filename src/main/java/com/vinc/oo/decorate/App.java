package com.vinc.oo.decorate;

/**
 * 实现相同的抽象类，对被装饰者进行不同穿插
 * java —————— inputstream 系列类
 * Description
 * Created by vinc on 2018/3/4.
 */
public class App {
    public static void main(String[] args) {

        Company xiaomi = new Xiaomi();
        System.out.println(xiaomi.getDesc() + "___ invest :" + xiaomi.invest());
        xiaomi = new InvestorA(xiaomi);
        xiaomi = new InvestorC(xiaomi);
        System.out.println(xiaomi.getDesc() + "___ invest :" + xiaomi.invest());

        Company tencent = new Tencent();
        tencent = new InvestorB(tencent);
        tencent = new InvestorC(tencent);
        System.out.println(tencent.getDesc() + "___ invest :" + tencent.invest());


    }
}
