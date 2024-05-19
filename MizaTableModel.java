/**
 * MizaTableModel.java
 *
 * Opis:
 * Razred za prikaz delovanja tabel v GUI
 *
 */
 
 import javax.swing.table.*;
 
/**
 * Javni razred za prikaz dela z razredi in objekti
 * @author Miha Juhart
 * @version Vaja 35
 */ 
public class MizaTableModel extends DefaultTableModel {
	public MizaTableModel() {
	
		super();
		
		addColumn("Namen");
		addColumn("Je zložljiva");
		
		// Dodamo testno vrstico v tabelo
		Object[] vrstica = new Object[] {"Jedilna", "true"};
		
		addRow(vrstica);
		
	}
	
	/** Javna metoda, ki doda steklenico v tabelo
	*/
	public void addMiza(Miza m) {
	
		Object[] vrstica = new Object[] {m.getNamen(), m.getJeZlozljiva()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
	
}
