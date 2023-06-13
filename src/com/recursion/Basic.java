package com.recursion;

public class Basic {

    public static void function(){
        System.out.println("1");
        function();
    }
    public static void main(String[] args) {
        function();
    }
}
