package personnages;

import java.lang.reflect.Method;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
	return "Le Gaulois " + nom + " : ";
	}
	
	public String toString() {
		return  nom ;
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astrérix",8);
		System.out.println(asterix.getNom());
	}
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain+" avec " +force*effetPotion+" de force ") ;
		int forceCoup=force;
		if (this.effetPotion>1) {
			forceCoup =forceCoup *this.effetPotion;
		}
		forceCoup =forceCoup/ 3 ;
		romain.recevoirCoup(forceCoup);
		if (this.effetPotion>1) {
			this.effetPotion=-1;
		}
	}
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
	}
	
}
