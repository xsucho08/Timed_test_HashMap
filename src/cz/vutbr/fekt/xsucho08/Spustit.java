package cz.vutbr.fekt.xsucho08;

public class Spustit {
	
	public static void main(String[] args) {
		Stat Cesko = new Stat();
		Mesto praha = new Mesto("Praha", 567782, 76764.5);
		Cesko.setSidlo(praha);
		
		Mesto brno = new Mesto("Brno", 5782, 764.5);
		Kraj moravsky = new Kraj("Moravsky", brno , 1022);
		Mesto drnovice = new Mesto("Drnovice", 52, 1.5);
		Kraj slezky = new Kraj("Slezsky", drnovice , 11);
		Mesto a1 = new Mesto("Olomouc", 5232, 321.5);
		Mesto a2 = new Mesto("Prerov", 98752, 14);
		Mesto a3 = new Mesto("Hostynky", 5322, 2875);
		moravsky.addMesto(a1);
		moravsky.addMesto(a2);
		slezky.addMesto(a3);
		Cesko.addKraj(moravsky);
		Cesko.addKraj(slezky);
		
		
		System.out.println(Cesko.getKraj("Slezsky"));
		//System.out.println(Cesko);
		
	}
}
