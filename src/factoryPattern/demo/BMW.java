package factoryPattern.demo;

//Konkreter Erzeuger
public class BMW extends AbstrakterHersteller{

	//Implementiert abstrakten Methode
	@Override
	protected void erzeugeFahrzeuge() {
		fahrzeuge.add(new I8(231)); // Erzeugung des konkreten Objekts
		
	}

}
