package com.model;

public class Developer extends Angajat implements Coding {

    Integer coffee;

    @Override
    public String scrieCod(){
        System.out.println("Transforming" + coffee + " coffee to code");
    }
}
