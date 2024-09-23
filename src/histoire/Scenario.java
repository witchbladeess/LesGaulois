package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;


public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		panoramix.parler(" Je vais aller pr�parer une petite potion..");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.parler("Bonjour");
		minus.parler("� UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		
		

//		asterix.parler("Bonjour � tous");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);
		
	}

}
