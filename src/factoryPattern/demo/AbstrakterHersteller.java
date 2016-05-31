package factoryPattern.demo;

import java.util.ArrayList;
import java.util.List;
import factoryPattern.demo.AbstraktesFahrzeug;

// Erzeuger(Creator)
// von dieser Klasse wird das konkrete Fahrzeug abgeleitet
public abstract class AbstrakterHersteller {
	protected List<AbstraktesFahrzeug> fahrzeuge = new ArrayList<AbstraktesFahrzeug>();
	
	//Dieser Konstruktor delegiert die Instanzierung des konkreten Objekts an die Unterklasse die diese implementiert
	public AbstrakterHersteller(){
		this.erzeugeFahrzeuge();
	}
	
	
	
	public List<AbstraktesFahrzeug> getFahrzeuge() {
		return fahrzeuge;
	}


	//Diese Methode muss von der Unterklasse(konkretes Fahrzeug) überschrieben und implementiert werden. 
	//Bei dieser Mehtode handelt es sich um Herzstück der Factory Pattern
	protected abstract void erzeugeFahrzeuge();
	
}
