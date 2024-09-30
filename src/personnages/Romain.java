package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipiments;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipiments = new Equipement[Equipement.values().length];
		assert force > 0;
		
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public int getForce() {
		return force;
	}
	
	public void sEquiper(Equipement Equip) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est d�j� bien prot�g� !! :))");
			break;
		case 1:
			if (Equip == equipiments[0]){
				System.out.println("Le soldat " + nom + " poss�de d�j� un " + Equip.nom + "!");					
			} 
			break;
		default:
			System.out.println("Le soldat " + nom + " s'equipe avec un " + Equip.toString());
			equipiments[Equip.ordinal()] = Equip;
			nbEquipement++;
			break;			
			
		}
	}
	


	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "La force doit etre ositive avant de recevoir un coup";
		int forceAvantCoup = force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert force < forceAvantCoup : "La force du Romain doit diminuer apr�s avoir re�u le coup";
		
	}
	public static void main(String[] args) {
		Romain romain = new Romain("Romain", 6);
		romain.prendreParole();
		romain.parler("Hi, im Romain");
		romain.recevoirCoup(1);
		
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.BOUCLIER);
		romain.recevoirCoup(1);
	}
}


