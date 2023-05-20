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
public class Enseignant extends User {

    @Override
    public String toString() {
        return "Enseignant{" + "matricule=" + matricule + '}'+super.toString();
    }
    private int matricule;

    public Enseignant(int matricule, int id_user, String nom, String prenom, java.sql.Date dateNaissance, String mail, int tel, String login, String password) {
        super(id_user, nom, prenom, dateNaissance, mail, tel, login, password);
        this.matricule = matricule;
    }

    public Enseignant(int matricule, String nom, String prenom, java.sql.Date dateNaissance, String mail, int tel, String login, String password) {
        super(nom, prenom, dateNaissance, mail, tel, login, password);
        this.matricule = matricule;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

       
}
