/**
 * HelloWorld.java
 *
 * Opis:
 * Program, ki prikazuje uporabo razreda Miza
 *
 * @author Miha Juhart
 * @version Vaja 28
 */
 
 // Uvozimo paket za delo z V/I napravami
import java.io.*;

import java.util.*;

/**
 * Javni razred za prikaz delovanja jave
 */
 
public class HelloWorld {

	// Deklariramo lastnost za vnos iz konzole
	private static BufferedReader in;
	
	private static ArrayList<Miza> mize;
	
	/** Javno statična metoda, ki se izvede ob zagonu programa
	* @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
	* @return Metoda ne vrača nič (ker je tipa void)
	*/
	public static void main(String[] args)  {
	
		in = new BufferedReader(new InputStreamReader(System.in));
		
		mize = new ArrayList<Miza>();
		
		while (true) {
		
			try {
				System.out.println("Mizo kakšnega tipa naj ustvarim?");
				String namen = in.readLine();
				// Če je vnos prazen
				if (namen.equals("")) {
					// Zapustimo zanko while
					break;
				} else {
					System.out.println("Ali je miza zložljiva?");
					String zl = in.readLine();
					boolean zlozljiva = Boolean.parseBoolean(zl);	
					Miza miza = new Miza(namen, zlozljiva);
					mize.add(miza);
				}
			}
			catch (Exception e) {
				System.out.println("Prišlo je do napake pri vnosu: " + e);
			}
			
		}
		
		//Ustvarimo objekt tipa Miza
		Miza jedilna = new Miza("Jedilna", true);
		Miza racunalniska = new Miza("Računalniška", false);
		mize.add(jedilna);
		mize.add(racunalniska);
		
		for (int c=0; c< mize.size(); c++) {
			System.out.println("Miza številka " + c + " v seznamu je " + mize.get(c) + ".");
		}
		
		// Jedilno mizo zložimo
		try {
			boolean zlozena = jedilna.zlozi();
			System.out.println("Jedilna miza je zlozena: " + zlozena);
		}
		catch (Exception e) {
			System.out.println("Prišlo je do napake pri zlaganju mize: " + e);
		}
		
		// Jedilno mizo sestavimo
		jedilna.postavi();
		
		// Dodamo material računalniški mizi
		String material = "";
		try {
			System.out.println("Kakšen material dodam računalniški mizi?");
			material = in.readLine();	
		}
		catch (Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
		racunalniska.dodajMaterial(material);
		String materiali = racunalniska.dodajMaterial("Kovina");
		System.out.println("Računalniška miza je iz materialov: " + materiali);
		
		// Ustvarimo jedilno in računalniško mizo
		int steviloLjudi = 0;
		try {
			System.out.println("Koliko ljudi sprejme jedilna miza?");
			String stevilo = in.readLine();		
			steviloLjudi = Integer.parseInt(stevilo);
		}
		catch (Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
		JedilnaMiza jedilnaMiza = new JedilnaMiza(steviloLjudi);
		
		boolean zlozljiva = false;
		try {
			System.out.println("Ali je računalniška miza zložljiva?");
			String zl = in.readLine();		
			zlozljiva = Boolean.parseBoolean(zl);	
		}
		catch (Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
		RacunalniskaMiza racunalniskaMiza = new RacunalniskaMiza(zlozljiva);
		
		// Preverimo ali lahko posedemo 5 ljudi
		int steviloLjudiPosedi = 0;
		try {
			System.out.println("Koliko ljudi želiš posesti za jedilno mizo?");
			String stevilo = in.readLine();		
			steviloLjudiPosedi = Integer.parseInt(stevilo);
		}
		catch (Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
		try{
			boolean smoPosedli = jedilnaMiza.posedi(steviloLjudiPosedi);
			System.out.println("Ljudi smo posedli za jedilno mizo: " + smoPosedli);
		}
		catch (Exception e) {
			System.out.println("Prišlo je do napake pri sedežnem redu: " + e);
		}
		
		// Dvignemo računalniško mizo
		boolean jeDvignjena = racunalniskaMiza.dvigniMizo();
		System.out.println("Računalniška miza je dvignjena: " + jeDvignjena);
		
		RacunalniskaMiza kotnaMiza = new RacunalniskaMiza(false, true);

	}
}
