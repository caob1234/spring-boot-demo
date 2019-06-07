package com.load.personal;


public class Son extends Father {
    static{
        System.out.println("son in static code block");
    }

    public Son() {
        System.out.println("I'm son");
    }
}