package factoryPattern.demo;

// Konkreter Erzeuger
public class Volkswagen extends AbstrakterHersteller {
	
	//Implementiert abstrakten Methode
	@Override
	protected void erzeugeFahrzeuge() {
		fahrzeuge.add(new Passat(147)); // Erzeugung der konkreten Objekten
		fahrzeuge.add(new Golf(157));
		
	}
	
}
