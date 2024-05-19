/**
 * Lesnina.java
 *
 * Opis:
 * Program za prikaz delovanja GUI
 *
 * @author Miha Juhart
 * @version Vaja 35
 */
 
 // Uvozimo paket za delo z V/I napravami
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Javni razred za prikaz delovanja jave
 */
 
public class Lesnina extends JFrame implements ActionListener {

	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField namenVnos;
	private JTextField zlozljivaVnos;
	private JTable tabela;
	private MizaTableModel modelTabele;

	/** Javno statična metoda, ki se izvede ob zagonu programa
	* @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
	* @return Metoda ne vrača nič (ker je tipa void)
	*/
	public static void main(String[] args)  {
	
		// Izpišemo pozdrav v konzolo
		System.out.println("Zagnjam GUI...");
		
		Lesnina m = new Lesnina();
	
	}
	
	/** Javni konstruktor
	*/
	public Lesnina() {
		
		super("Lesnina - trgovina z mizami");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(800, 600);
		
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj steklenico");
		namenVnos = new JTextField(32);
		zlozljivaVnos = new JTextField(8);
		modelTabele = new MizaTableModel();
		tabela = new JTable(modelTabele);
		
		povrsina.add(new JLabel("Namen:"));
		povrsina.add(namenVnos);
		povrsina.add(new JLabel("Je zložljiva:"));
		povrsina.add(zlozljivaVnos);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
		
		dodajJButton.addActionListener(this);
		
		add(povrsina);
		
		setVisible(true);
	}
	
	
	/** Metoda, ki izvaja aktivnosti glede na dogodke
	* @param e Dogodek, ki je sprožil, klical metodo
	*/
	public void actionPerformed(ActionEvent e) {
	
		System.out.println("Dodajam mizo ...");
		
		System.out.println("Namen: " + namenVnos.getText());
		System.out.println("Je zlžljiva: " + zlozljivaVnos.getText());
		
		modelTabele.addMiza(new Miza(namenVnos.getText(), Boolean.parseBoolean(zlozljivaVnos.getText())));
	}
}
