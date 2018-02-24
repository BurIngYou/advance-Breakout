package com.huyou.main;


import com.huyou.define.Annota;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {


    public static void main(String[] args) {
        //System.out.println("Hello World!");
        try {
            annoTest();
            annoMethod();
        }catch (Exception e){

        }


    }

    public static void annoTest() throws  ClassNotFoundException{
        Class clazz =  Class.forName("com.huyou.define.Student");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation:annotations) {
            Annota annota = (Annota)annotation;
            System.out.println("id= "+annota.id()+"; name= "+annota.name());

        }
    }
    public static void annoMethod() throws  ClassNotFoundException{
        Class clazz =  Class.forName("com.huyou.define.Student");
        Method[] methods =  clazz.getDeclaredMethods();
        for (Method method:methods){
            if (method.isAnnotationPresent(Annota.class)){
                Annota annota =  method.getAnnotation(Annota.class);
                System.out.println("id= "+annota.id()+"; name= "+annota.name());
            }
        }
    }
}
