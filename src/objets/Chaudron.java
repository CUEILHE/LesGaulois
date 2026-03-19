package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Boolean resterPotion() {
		if (quantitePotion>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void remplirChaudron(int quantite,int forcePotion) {
		this.quantitePotion=quantite;
		this.forcePotion = forcePotion;
	}
	public int prendreLouche() {
		if (this.quantitePotion==0) {
			return 0;
		}
		else {
			this.quantitePotion=-1;
			return this.forcePotion;
		}
		
	}
}
