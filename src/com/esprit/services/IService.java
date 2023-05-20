/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.esprit.services;

import java.util.List;

/**
 *
 * @author admin
 */
public interface IService<T> {
    public void ajouter(T u);
    public void modifier(T u);
    public void supprimer(T u);
    public List<T> afficher();
}

    

