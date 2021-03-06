package com.vinc.oo.decorate;

/**
 * Description
 * Created by vinc on 2018/3/4.
 */
public class InvestorB extends Company {
    private Company company;

    public InvestorB(Company company) {
        this.company = company;
    }

    @Override
    protected String getDesc() {
        return company.getDesc() + ", InvestorB";
    }

    @Override
    public int invest() {
        return company.invest() + 90;
    }
}
