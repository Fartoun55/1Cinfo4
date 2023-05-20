/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Eleve extends User{
    private int n_carte;

    public Eleve(int n_carte, int id_user, String nom, String prenom, java.sql.Date dateNaissance, String mail, int tel, String login, String password) {
        super(id_user, nom, prenom, dateNaissance, mail, tel, login, password);
        this.n_carte = n_carte;
    }

    public Eleve(int n_carte, String nom, String prenom, java.sql.Date dateNaissance, String mail, int tel, String login, String password) {
        super(nom, prenom, dateNaissance, mail, tel, login, password);
        this.n_carte = n_carte;
    }

    public int getN_carte() {
        return n_carte;
    }

    public void setN_carte(int n_carte) {
        this.n_carte = n_carte;
    }

    @Override
    public String toString() {
        return "Eleve{" + "n_carte=" + n_carte + '}'+super.toString();
    }

    
}
