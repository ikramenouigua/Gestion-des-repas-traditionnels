package jee;

import java.util.ArrayList;

public class GroupEtudiant {
	
	
	    private ArrayList<Etudiant> listeEleves = new ArrayList<Etudiant>();

	    public GroupEtudiant() {
	    }


	    public int nombre() {

	        return listeEleves.size();
	    }

	    public ArrayList<Etudiant> getListe() {
	        return listeEleves;
	    }

	    public void ajouterEtudiant(Etudiant etudiant)  {
	        listeEleves.add(etudiant);
	    }

	    public Etudiant chercher(String nom) {
	        for (Etudiant eleve : listeEleves)
				try {
					if (eleve.getNom().equals(nom)) return eleve;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        return null;
	    }

	    public void lister() {
	        System.out.println("Liste  : ");
	        for (Etudiant eleve : listeEleves) {
	            System.out.println(eleve);
	        }
	    }

	
	

	
	    public static void main(String[] args) {
	        Etudiant std;
	        GroupEtudiant group = new GroupEtudiant();

	        std = new Etudiant("mohamed");
	        std.ajouterNote(19);
	        std.ajouterNote(15);
	        group.ajouterEtudiant(std);
	        std = new Etudiant("salma");
	        std.ajouterNote(12);
	        std.ajouterNote(20);
	        group.ajouterEtudiant(std);
	        group.lister();																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
	        std = group.chercher("salma");
	        if (std != null)
	            System.out.println("Voila  : " +  group.chercher("salma"));
	        else System.out.println("std n'est pas dans la liste");
	    }
	   
}
