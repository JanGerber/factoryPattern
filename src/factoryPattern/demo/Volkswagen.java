package factoryPattern.demo;

//Konkreter Erzeuger(ConcreateCreator)
//instanziiert die konkrete Klasse bzw. in userem Fall das konkrete Produkt
public class Volkswagen extends AbstrakterHersteller {
	
	//Implementiert abstrakten Methode
	@Override
	protected void erzeugeFahrzeuge() {
		fahrzeuge.add(new Passat(147)); // Erzeugung der konkreten Objekten
		fahrzeuge.add(new Golf(157));
		
	}
	
}
