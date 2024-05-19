/**
 * Miza.java
 *
 * Opis:
 * Delo z mizo
 *
 * @author Miha Juhart
 * @version Vaja 27
 */
 
 
/**
 * Javni razred za prikaz dela z razredi in objekti
 */ 
public class Miza {
	
	// Deklariramo zasebne lastnosti mize
	private String namen;
	private boolean jeZlozljiva;
	private boolean jeZlozena;
	private String materiali;
	
	/** Javni konstruktor za ustvarjanje novega tipa/razreda Miza
	* @param n Namen mize
	* @param z Ali je miza zložljiva
	* @return Nov objekt tipa miza
	*/
	public Miza(String n, boolean z)  {
		
		// Inicializiramo lastnosti
		namen = n;
		jeZlozljiva = z;
		jeZlozena = false;
		materiali = "";
		
		//Izpišemo podatke
		System.out.println("Ustvarjam objekt tipa Miza, namen " + n + ". Miza je zložljiva: " + z);
}

	/** Javna metoda, ki zloži mizo
	* @return Vrne true če je miza zložena
	* @throws Vrže izjemo, če miza ni zložljiva
	*/
	public boolean zlozi() throws Exception {
		
		// Če je miza sploh zložljiva
		if (jeZlozljiva) {
			// Če je že zložena potem je ni treba zložiti
			if (jeZlozena) {
				System.out.println("Miza je že zložena.");
				return true;
			}
			// Če ni zložena jo zložimo
			else {
				// Zložimo mizo
				System.out.println("Zlagam mizo.");
				jeZlozena = true;
				System.out.println("Miza je zložena.");
				return true;
			}
		}
		// Če miza ni zložljiva je ne moremo zložiti
		else {
			throw new Exception("Ne morem zložiti mize ker ni zložljiva.");
		}
	}

	/** Javna metoda, ki postavi mizo
	*/
	public void postavi()  {
		
		// Če je miza sploh zložljiva
		if (jeZlozljiva) {
			// Če je zložena potem jo postavimo
			if (jeZlozena) {
				// Postavimo mizo
				System.out.println("Postavljam mizo.");
				jeZlozena = false;
				System.out.println("Miza je postavljena.");
			}
			// Če ni zložena potem nam ni treba postaviti
			else {
				System.out.println("Miza je že postavljena.");
			}
		}
		// Če miza ni zložljiva nam je ni treba postaviti
		else {
			System.out.println("Ne morem postaviti mize ker ni zložljiva.");
		}
	}
	
	/** Javna metoda, ki doda material
	* @return Vrne materiale iz katerih je miza sestavljena
	*/
	public String dodajMaterial(String material)  {
	
		System.out.println("Materiali pred dodajanjem " + materiali);
		// Dodamo material med materiale
		materiali = materiali + material;
		System.out.println("Materiali po dodajanju " + materiali);
				
		// Na koncu vrnemo materiale
		return materiali;
	}
		
	/** Javna metoda ki vrne namen mize
	* @return Namen mize
	*/
	public String getNamen() {
		return namen;
	}
		
	/** Javna metoda ki vrne ali je miza zložljiva
	* @return true če je miza zložljiva, false če ni
	*/
	public boolean getJeZlozljiva() {
		return jeZlozljiva;
	}
}
