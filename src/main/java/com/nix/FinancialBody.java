package com.nix;

public class FinancialBody extends Body {
    private String financialTable;
    public FinancialBody(String bodyContent,String financialTable) {
        super(bodyContent);
        this.financialTable = financialTable;
    }

    public String getFinancialTable() {
        return financialTable;
    }

    @Override
    public String build() {
        return super.build()+"\n"+financialTable;
    }
}
