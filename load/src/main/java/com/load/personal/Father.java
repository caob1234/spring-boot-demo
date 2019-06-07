package com.load.personal;


public class Father extends Grandpa {
    static {
        System.out.println("father in static code block");
    }
    public static int factor = 25;
    public Father(){
        System.out.println("I'm father");
    }
}