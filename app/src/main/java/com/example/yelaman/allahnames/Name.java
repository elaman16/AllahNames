package com.example.yelaman.allahnames;

/**
 * Created by Yelaman on 20/02/2017.
 */

public class Name {
    String nameKz, nameAr, nameTr;

    public Name() {
    }

    public Name(String nameKz, String nameAr, String nameTr) {
        this.nameKz = nameKz;
        this.nameAr = nameAr;
        this.nameTr = nameTr;
    }

    public String getNameKz() {
        return nameKz;
    }

    public void setNameKz(String nameKz) {
        this.nameKz = nameKz;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameTr() {
        return nameTr;
    }

    public void setNameTr(String nameTr) {
        this.nameTr = nameTr;
    }
}
