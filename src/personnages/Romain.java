package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public int getForce() {
		return force;
	}


	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "La force doit etre ositive avant de recevoir un coup";
		int forceAvantCoup = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force < forceAvantCoup : "La force du Romain doit diminuer après avoir reçu le coup";
		
	}
	public static void main(String[] args) {
		Romain asterix = new Romain("Romain", 6);
		asterix.prendreParole();
		asterix.parler("Hi, im Romain");
		asterix.recevoirCoup(1);
	}
}


