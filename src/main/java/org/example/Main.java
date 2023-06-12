package org.example;


import  java.util.Date;

public class Main {
    public static void main(String[] args) {
        Couple<Integer> c1=new Couple<>(3,5);
        Couple<Date> c2=new Couple<>(new Date(),new Date());
        System.out.println(c1.getA());
        System.out.println(c1.getB());
        System.out.println(c2.getA());
        System.out.println(c2.getB());

        System.out.println("Hello world!");
    }
}