package org.example;

public class Mainn3 {
    public static void main(String[] args) {
        Calcul<String> c=new Calcul<>();
        Double a=4.5;
        Double b=3.5;
        String e="azerty";
        String d="azerty";

        System.out.println(c.comparer(a,b));
        System.out.println(c.comparer(e,d));
        Produit  p1=new Produit();
        Produit p2=new Produit();
        System.out.println(c.comparer(p1,p2));

    }
}
