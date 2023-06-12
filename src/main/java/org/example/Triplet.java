package org.example;


public class Triplet<T,T2> extends Couple<T>{
    private T2 C;

    public T2 getC() {
        return C;
    }

    public void setC(T2 c) {
        C = c;
    }
public Triplet(){
        super();
}


    public Triplet(T a, T b, T2 c) {
        super(a, b);
        this.C= c;
    }
}
