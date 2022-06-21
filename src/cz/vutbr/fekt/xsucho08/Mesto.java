package cz.vutbr.fekt.xsucho08;

public class Mesto {
	
	private String nazev;
	private int pocetObyvatel;
	private double rozlohaM;

	
	public Mesto(String nazev, int pocetObyvatel, double rozlohaM) {
		
		this.nazev = nazev;
		this.pocetObyvatel = pocetObyvatel;
		this.rozlohaM = rozlohaM;
	}
	
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public int getPocetObyvatel() {
		return pocetObyvatel;
	}
	public void setPocetObyvatel(int pocetObyvatel) {
		this.pocetObyvatel = pocetObyvatel;
	}
	public double getRozlohaM() {
		return rozlohaM;
	}
	public void setRozlohaM(double rozlohaM) {
		this.rozlohaM = rozlohaM;
	}


	@Override
	public String toString() {
		return "Mesto " + nazev + ", pocet obyvatel=" + pocetObyvatel + ", rozloha=" + rozlohaM + " m^2. \n";
	}
	
	
	

}
