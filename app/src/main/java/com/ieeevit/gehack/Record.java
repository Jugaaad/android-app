
package com.ieeevit.gehack;

import java.io.Serializable;

public class Record implements Serializable{

    public String date;
    public String week;
    public String mchb;
    public String estradiol;
    public String hcg;
    public String papp;
    public String glucose;
    public String iron;
    public String folates;
    public String calcium;

    Record(String date, String week, String mchb, String estradiol, String hcg, String papp, String glucose, String iron, String folates, String calcium){
        this.date = date;
        this.week = week;
        this.mchb = mchb;
        this.estradiol = estradiol;
        this.hcg = hcg;
        this.papp = papp;
        this.glucose = glucose;
        this.iron = iron;
        this.folates = folates;
        this.calcium = calcium;
    }
}
