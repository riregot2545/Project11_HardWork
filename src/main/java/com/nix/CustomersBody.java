package com.nix;

public class CustomersBody extends Body {
    private String customers;
    public CustomersBody(String bodyContent,String customers) {
        super(bodyContent);
        this.customers = customers;
    }

    public String getCustomers() {
        return customers;
    }

    @Override
    public String build() {
        return super.build()+"\n"+customers;
    }
}
