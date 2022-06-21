package cz.vutbr.fekt.xsucho08;

import java.util.HashMap;


public class Stat {
	private Mesto sidlo;
	private HashMap<String, Kraj> kraje = new HashMap<>();
	
	
	
	public Mesto getSidlo() {
		return sidlo;
	}
	public void setSidlo(Mesto sidlo) {
		this.sidlo = sidlo;
	}
	
	
	public void addKraj(Kraj kraj) {
		kraje.put(kraj.getNazev(), kraj);
	}
	
	public Kraj getKraj(String nazevK) {
		return kraje.get(nazevK);
	}


	@Override
	public String toString() {
		return "Sidlo statu=" + sidlo + ", kraje=" + kraje + "\n";
	}
	
	
	
	
	

}
