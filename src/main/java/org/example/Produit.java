package org.example;

import java.io.Serializable;
import java.security.PrivateKey;

public class Produit implements Serializable ,Cloneable {
    private Long idProduit;
    private String nom;
    private double prix;

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
