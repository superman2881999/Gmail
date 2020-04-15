package com.example.gmail3;


public class ContactModel {
    String fullname;
    String main;
    String main2;
    boolean isSelected;
    String time;

    public ContactModel(String fullname,String main,String main2,String time) {
        this.fullname = fullname;
        this.main=main;
        this.main2=main2;
        this.time=time;
    }

    public String getMain2() {
        return main2;
    }

    public void setMain2(String main2) {
        this.main2 = main2;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getMain() {
        return main;
    }
    public void setMain(String main) {
        this.main = main;
    }
    public boolean isSelected() {
        return isSelected;
    }
    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}


