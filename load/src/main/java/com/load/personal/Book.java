package com.load.personal;
/*
* site:https://juejin.im/post/5cf51700f265da1bab299958?utm_source=gold_browser_extension#heading-8
* */
public class Book {
    static int amount = 112;
    int price = 110;

    public static void main(String[] args){
        staticFunction();
    }

    static Book book = new Book();
    static {
        System.out.println("static code of book");
    }
    {
        System.out.println("common code of book");
    }
    Book(){
        System.out.println("constructor method of book");
        System.out.println("price=" + price +",amount="+amount);
    }
    public static void staticFunction() {
        System.out.println("static function of book");
    }
}
