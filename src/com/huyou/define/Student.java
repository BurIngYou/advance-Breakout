package com.huyou.define;

@Annota(name = "type",id = 1)
public class Student {

    @Annota(name = "param",id = 2)
    private int id;
    @Annota(name = "param",id = 3)
    private String sname ;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Annota(name="public method study",id=5) //类方法注解
    public  String study (){
        return "学习";
    }
}
