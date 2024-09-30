package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
	}

	public Gaulois trouverHabitant(int index) {
		return villageois[index];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef" + chef.getNom() + "vivent les légendaires gaulois :");
		for(Gaulois gaulois : villageois) {
			if(gaulois != null) {
				System.out.println(" - " + gaulois.getNom());
			}
		}
		
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		// 2e erreur car 30 est hors de tableau: Index 30 out of bounds for length 30
		// Gaulois gaulois = village.trouverHabitant(30);
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(Abraracourcix);

		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(Asterix);
		// 2e on va obtenir asterix: Gaulois [nom=Asterix, force=8, effetPotion=1]
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		
		Gaulois Obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois();
	}
}
