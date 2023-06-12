package org.example;

import java.io.Serializable;

public class ProduiLiquide extends Produit implements Cloneable {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
