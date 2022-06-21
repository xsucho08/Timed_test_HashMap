package cz.vutbr.fekt.xsucho08;

import java.util.HashMap;


public class Kraj {
	private String nazev;
	private Mesto sidlo;
	private int rok;
	private HashMap<String, Mesto> mesta = new HashMap<>();
	
	
	
	public Kraj(String nazev, Mesto sidlo, int rok) {
		this.nazev = nazev;
		this.sidlo = sidlo;
		this.rok = rok;
		addMesto(sidlo);
	}
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public Mesto getSidlo() {
		return sidlo;
	}
	public void setSidlo(Mesto sidlo) {
		this.sidlo = sidlo;
	}
	public int getRok() {
		return rok;
	}
	public void setRok(int rok) {
		this.rok = rok;
	}
	
	
	public void addMesto(Mesto mestecko) {
		mesta.put(mestecko.getNazev(), mestecko);
	}

	public Mesto getMesto(String nazevM) {
		return mesta.get(nazevM);
	}

	@Override
	public String toString() {
		return "Kraj " + nazev + ", sidlo=" + sidlo + ", rok=" + rok + " mesta=" + mesta + "\n";
	}
	
	
}
