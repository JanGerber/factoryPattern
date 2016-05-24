package factoryPattern.demo;

import java.util.ArrayList;
import java.util.List;
import factoryPattern.demo.AbstraktesFahrzeug;

//Erzeuger
public abstract class AbstrakterHersteller {
	protected List<AbstraktesFahrzeug> fahrzeuge = new ArrayList<AbstraktesFahrzeug>();
	
	//Methode delegiert Instanziierung an Unterklasse
	public AbstrakterHersteller(){
		this.erzeugeFahrzeuge();
	}
	
	
	
	public List<AbstraktesFahrzeug> getFahrzeuge() {
		return fahrzeuge;
	}


	
	protected abstract void erzeugeFahrzeuge();
	
}
