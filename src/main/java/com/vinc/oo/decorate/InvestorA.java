package com.vinc.oo.decorate;

/**
 * Description
 * Created by vinc on 2018/3/4.
 */
public class InvestorA extends Company {

    private Company company;

    public InvestorA(Company company) {
        this.company = company;
    }

    @Override
    protected String getDesc() {
        return company.getDesc() + ", InvestorA";
    }

    @Override
    public int invest() {
        return company.invest() + 130;
    }
}
