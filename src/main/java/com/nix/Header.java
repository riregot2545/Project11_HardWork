package com.nix;

public class Header {
    private String topHeader;
    private String documentHeader;

    public Header(String topHeader, String documentHeader){
        this.topHeader = topHeader;
        this.documentHeader = documentHeader;
    }

    public String getTopHeader() {
        return topHeader;
    }

    public String getDocumentHeader() {
        return documentHeader;
    }

    public String build(){
        return topHeader+"\n"+documentHeader;
    }
}
