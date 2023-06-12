package org.example;

import java.io.Serializable;

public class Traitement<T extends Produit & Serializable & Cloneable> {
    private T a;
    private T b;

    public Traitement() {
        super();
    }

    public Traitement(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T b) {
        this.b = b;
    }













}
