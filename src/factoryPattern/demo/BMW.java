package factoryPattern.demo;

//Konkreter Erzeuger(ConcreateCreator)
//instanziiert die konkrete Klasse bzw. in userem Fall das konkrete Produkt
public class BMW extends AbstrakterHersteller{

	//Implementiert abstrakten Methode aus der Oberklasse
	@Override
	protected void erzeugeFahrzeuge() {
		fahrzeuge.add(new I8(231)); // Erzeugung des konkreten Objekts
		
	}

}
