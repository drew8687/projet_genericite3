package org.example;

public class Main4 {
    public static void main(String[] args) {
        Traitement<ProduiLiquide> t=new Traitement<>(new ProduiLiquide(),new ProduiLiquide());
        System.out.println(t.getA().getQuantity());
        System.out.println(t.getB().getQuantity());



    }
}
