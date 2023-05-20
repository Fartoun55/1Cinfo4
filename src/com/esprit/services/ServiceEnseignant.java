/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Administrateur;
import com.esprit.entities.Eleve;
import com.esprit.entities.Enseignant;
import com.esprit.entities.User;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ServiceEnseignant {
     private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(User u) {
        if (u instanceof Enseignant) {
            try {
         
            String req = "INSERT INTO user(nom, prenom, dateNaissance, mail, tel, login, password, role, matricule) VALUES (?,?,?,?,?,?,?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, u.getNom());
            pst.setString(2, u.getPrenom());
            pst.setDate(3,u.getDateNaissance());
            pst.setString(4, u.getMail());
            pst.setInt(5, u.getTel());
            pst.setString(6, u.getLogin());
            pst.setString(7, u.getPassword());
            pst.setString(8, "Enseiganat");
            pst.setInt(9, ((Enseignant) u).getMatricule());
            pst.executeUpdate();
            System.out.println("Enseiganat ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        }
        
        
        
    }
    
     public void modifier(User u) {
        if (u instanceof Enseignant){
            try {
            String req = "UPDATE user SET nom=?, prenom=?, dateNaissance=?, mail=?, tel=?, login=?, password=?, matricule=? WHERE id_user=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            
            pst.setString(1, u.getNom());
            pst.setString(2, u.getPrenom());
            pst.setDate(3, u.getDateNaissance());
            pst.setString(4, u.getMail());
            pst.setInt(5, u.getTel());
            pst.setString(6, u.getLogin());
            pst.setString(7, u.getPassword());
            pst.setInt(8, ((Enseignant) u).getMatricule());
            pst.setInt(9, u.getId_user());
            pst.executeUpdate();
            System.out.println("Enseignant modifiée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        }
        
    }
    
    public void supprimer(User u) {
        try {
            String req = "DELETE from user WHERE id_user=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, u.getId_user());
            pst.executeUpdate();
            if (u instanceof Enseignant) {
                   System.out.println("Enseignanat supprimée !");
            }
            if (u instanceof Eleve) {
                   System.out.println("Eleve supprimée !");
            }
            if (u instanceof Administrateur) {
                   System.out.println("Administrateur supprimée !");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<User> afficher(String role) {
        
        List list = null;
        String req = "SELECT * FROM user where role=?";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, role);
            ResultSet rs = pst.executeQuery();
            if (role.equals(role)){
            list = new ArrayList<Enseignant>(); 
           while(rs.next()) {
                list.add(new Enseignant(rs.getInt("matricule"),rs.getInt("id_user"), rs.getString("nom"), rs.getString("prenom"), rs.getDate("dateNaissance"), rs.getString("mail"), rs.getInt("tel"), rs.getString("login"),rs.getString("password")));
            
            }
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        return list;
    }
    
}
