package com.nix;

public class Report {
    protected Header header;
    protected Body body;
    protected Footer footer;

    public Report(Header header, Body body, Footer footer){
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public String build(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header.build());
        stringBuilder.append('\n');
        stringBuilder.append(body.build());
        stringBuilder.append('\n');
        stringBuilder.append(footer.build());
        return stringBuilder.toString();
    }
}
