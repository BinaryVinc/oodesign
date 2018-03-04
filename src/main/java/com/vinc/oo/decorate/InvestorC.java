package com.vinc.oo.decorate;

/**
 * Description
 * Created by vinc on 2018/3/4.
 */
public class InvestorC extends Company{
    private Company company;

    public InvestorC(Company company) {
        this.company = company;
    }


    @Override
    protected String getDesc() {
        return company.getDesc() + ", InvestorC";
    }

    @Override
    public int invest() {
        return company.invest() + 400;
    }
}
