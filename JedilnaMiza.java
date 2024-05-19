/**
 * Miza.java
 *
 * Opis:
 * Delo z mizo
 *
 * @author Miha Juhart
 * @version Vaja 28
 */
 
 
/**
 * Javni razred, ki razširja razred Miza
 */ 
public class JedilnaMiza extends Miza {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo dodatne lastnosti, ki so znacilne le za jedilne mize
	private int steviloSedezev;
	
	/** Javni konstruktor za ustvarjanje novega tipa/razreda JedilnaMiza
	* @param s Število sedežev
	* @param k Kapaciteta v mililitrih
	* @return Nov objekt tipa jedilna miza
	*/
	public JedilnaMiza(int s) {

		// Pokličemo konstruktor nadrazreda
		super("Jedilna", true);
		
		// Inicializiramo še dodatne lastosti
		steviloSedezev = s;
		
		// Izpišemo podatke
		System.out.println("Jedilna miza sprejme " + s + " ljudi.");
		
	}

	/** Javna metoda, ki posede ljudi za mizo
	* @param ljudi Število ljudi, ki jih želimo posesti za mizo
	* @return Vrne true če so bili ljudje uspešno posedeni
	* @throws Vrže izjemo, če miza ne sprejme toliko ljudi
	*/
	public boolean posedi(int ljudi) throws Exception {
	
		// Če je število ljudi manjše ali enako številu sedežev ki jih miza ponuja, potem laho ljudi posedemo za mizo
		if (ljudi <= steviloSedezev) {
			System.out.println("Ljudi smo posedli za mizo.");
			return true;
		}
		// Sicer ljudi ne moremo posesti za miso
		else {
			throw new Exception("Miza ne sprejme toliko ljudi.");
		}
	}
	
}
