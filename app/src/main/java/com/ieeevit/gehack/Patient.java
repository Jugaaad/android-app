
package com.ieeevit.gehack;

import java.io.Serializable;

public class Patient implements Serializable{

    public int photo;
    public String name;
    public String age;
    public String gender;

    Patient(int photo, String name, String age, String gender){
        this.photo = photo;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
