package org.example;

public class Couple<T> {
    private  T a;
    private  T b;
    public Couple(){

    }
    public Couple(T a,T b){
        super();
        this.a=a;
        this.b=b;
    }
    public T getA(){
        return  a;
    }
    public T getB(){
        return  b;
    }


}
