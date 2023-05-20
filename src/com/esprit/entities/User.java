/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

import java.sql.Date;

/**
 *
 * @author admin
 */
  public abstract class User {
    private int id_user;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String mail;
    private int tel;
    private String login;
    private String password;

    @Override
    public String toString() {
        return "id=" + id_user + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", mail=" + mail + ", tel=" + tel + ", login=" + login + ", password=" + password + ", role=" + role ;
    }
    private String role;

    public User(int id_user, String nom, String prenom, Date dateNaissance, String mail, int tel, String login, String password) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.tel = tel;
        this.login = login;
        this.password = password;
        
    }

    public User(String nom, String prenom, Date dateNaissance, String mail, int tel, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.tel = tel;
        this.login = login;
        this.password = password;
        
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
}
