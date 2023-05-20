/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.tests;

import com.esprit.entities.Administrateur;
import com.esprit.entities.Eleve;
import com.esprit.entities.Enseignant;
import com.esprit.services.ServiceAdministrateur;
import com.esprit.services.ServiceEleve;
import com.esprit.services.ServiceEnseignant;




import com.esprit.utils.DataSource;
import java.sql.Date;

/**
 *
 * @author admin
 */
public class MainProg {

    public static void main(String[] args) {
      
      //****************************************crud Administrateur*************************************************//
      
         ServiceAdministrateur sp = new ServiceAdministrateur();
         //sp.ajouter(new Administrateur("ali", "triki", Date.valueOf("2000-02-01"), "oussem.sallemi@esprit.tn", 28548751, "WIDED1", "WSABER3"));
         sp.modifier(new Administrateur(35, "alaa", "triki", Date.valueOf("2000-02-01"), "oussem.sallemi@esprit.tn", 28548751, "WIDED1", "WSABER3"));
         //sp.supprimer(new Administrateur(31, "oussema", "sellemi", Date.valueOf("2000-02-01"), "oussem.sallemi@esprit.tn", 28548751, "WIDED1", "WSABER3"));
         //System.out.println(sp.afficher("Administrateur"));
         
     //****************************************crud Enseignanat*************************************************// 
     
          //ServiceEnseignant sp1 = new ServiceEnseignant();
          
          //sp1.ajouter(new Enseignant(00124, "ahmed", "kefi", Date.valueOf("1988-08-06"), "sami.ibrahim@esprit.tn", 90200141, "MOALI", "Ali147"));
         //sp1.modifier((new Enseignant(00124, 34, "ahmed mohamed", "kefi", Date.valueOf("1988-08-06"), "sami.ibrahim@esprit.tn", 90200141, "MOALI", "Ali147")));
          // sp1.supprimer(new Enseignant(00124, 34, "ahmed mohamed", "kefi", Date.valueOf("1988-08-06"), "sami.ibrahim@esprit.tn", 90200141, "MOALI", "Ali147"));
          //System.out.println(sp1.afficher("Enseiganat")); 
         
         //****************************************crud Eleve*************************************************//
         
          //ServiceEleve sp2 = new ServiceEleve();
        
         // sp2.ajouter(new Eleve(4455, "ffhhh", "bbbbbb", Date.valueOf("1988-08-06"), "sami.ibrahim@esprit.tn", 90200141, "MOALI", "Ali147"));
         // sp2.modifier((new Eleve(4455, 29,"ffhhh222", "bbbbbb", Date.valueOf("1988-08-06"), "sami.ibrahim@esprit.tn", 90200141, "MOALI", "Ali147")));
         //sp2.supprimer(new Eleve(4455, 29,"ffhhh222", "bbbbbb", Date.valueOf("1988-08-06"), "sami.ibrahim@esprit.tn", 90200141, "MOALI", "Ali147"));
         //System.out.println(sp2.afficher("Eleve"));
         
          
    }
    }