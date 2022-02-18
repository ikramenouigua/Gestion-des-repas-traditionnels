package jee;
import java.util.ArrayList;
import java.util.Scanner;

public class Etudiant {	
	    private String nom;
	    private ArrayList<Integer> listeNotes=new ArrayList<Integer>();
	    private int moyenne ;

	    public Etudiant(String nom) {
	        this.nom = nom;
	        
	      
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public ArrayList<Integer> getListeNotes() {
	        return listeNotes;
	    }

	    public void setListeNotes(ArrayList<Integer> listeNotes) {
	        this.listeNotes = listeNotes;
	    }

	    public int getMoyenne() {
	        return moyenne;
	    }

	    public void setMoyenne(int moyenne) {
	        this.moyenne = moyenne;
	    }
      
	    public void ajouterNote(int note){

	        this.listeNotes.add(note);


	    }

		@Override
		public String toString() {
			return "Etudiant [nom=" + nom + ", listeNotes=" + listeNotes + ", moyenne=" + moyenne + "]";
		}
     
	  

	}

