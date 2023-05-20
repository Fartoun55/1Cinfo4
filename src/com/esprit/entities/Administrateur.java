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
public class Administrateur extends User{

    public Administrateur(int id_user, String nom, String prenom, java.sql.Date dateNaissance, String mail, int tel, String login, String password) {
        super(id_user, nom, prenom, dateNaissance, mail, tel, login, password);
    }

    public Administrateur(String nom, String prenom, java.sql.Date dateNaissance, String mail, int tel, String login, String password) {
        super(nom, prenom, dateNaissance, mail, tel, login, password);
    }

    @Override
    public String toString() {
        return "Administrateur{" + '}'+super.toString();
    }

   
}
