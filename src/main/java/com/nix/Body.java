package com.nix;

public class Body {
    protected String content;
    public Body(String bodyContent){
        content = bodyContent;
    }

    public String getContent() {
        return content;
    }

    public String build(){
        return content;
    }
}
