package com.nix;

import java.util.Calendar;

public class Footer {
    private String declarationCity;
    private int declarationYear;

    public Footer(String declarationCity){
        this.declarationCity = declarationCity;
        declarationYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getDeclarationYear() {
        return declarationYear;
    }

    public String getDeclarationCity() {
        return declarationCity;
    }

    public String build(){
        return declarationCity+"\n"+declarationYear;
    }
}
