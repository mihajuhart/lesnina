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
public class RacunalniskaMiza extends Miza implements KotnaMiza {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo dodatne lastnosti, ki so znacilne le za računalniške mize
	private boolean jeDvizna;
	private boolean jeDvignjena;
	private boolean jeKotna;
	
	/** Javni konstruktor za ustvarjanje novega tipa/razreda RacunalniskaMiza
	* @param d Ali je miza dvižna
	* @return Nov objekt tipa računalniška miza
	*/
	public RacunalniskaMiza(boolean d) {

		this(d, false);
		
	}
	
	
	/** Javni konstruktor za ustvarjanje novega tipa/razreda RacunalniskaMiza
	* @param d Ali je miza dvižna
	* @param k Ali je miza kotna
	* @return Nov objekt tipa računalniška miza
	*/
	public RacunalniskaMiza(boolean d, boolean k) {

		// Pokličemo konstruktor nadrazreda
		super("Računalniška", false);
		
		// Inicializiramo še dodatne lastosti
		jeDvizna = d;
		jeDvignjena = false;
		jeKotna = k;
		
		// Izpišemo podatke
		System.out.println("Računalniška miza je dvižna " + d);
		
	}


	/** Javna metoda, ki dvigne mizo
	* @return Vrne true če je miza dvignjena, false če se mize ne da dvigniti
	*/
	public boolean dvigniMizo()  {
	
		// Če je miza sploh dvižna
		if (jeDvizna) {
			// Če je že dvignjena potem je ni treba dvigniti
			if (jeDvignjena) {
				System.out.println("Miza je že dvignjena.");
				return true;
			}
			// Če ni dvignjena jo dvignemo
			else {
				// Zložimo mizo
				System.out.println("Dvigujem mizo.");
				jeDvignjena = true;
				System.out.println("Miza je dvignjena.");
				return true;
			}
		}
		// Če miza ni dvižna je ne moremo dvigniti
		else {
			System.out.println("Ne morem dvigniti mize ker ni dvižna.");
			return false;
		}
	}
	
	/** Javna metoda ki vrne ali je miza kotna
	* @return true če je miza kotna, false če ni
	*/
	public boolean getJeMizaKotna() {
		return jeKotna;
	}
	
}
