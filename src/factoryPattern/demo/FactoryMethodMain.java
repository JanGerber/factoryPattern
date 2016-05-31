package factoryPattern.demo;

import java.util.Iterator;

//Testen der Implementation
public class FactoryMethodMain {

	public static void main(String[] args) {
		
		//Hersteller instanziieren
		AbstrakterHersteller vw = new Volkswagen();
		AbstrakterHersteller bmw = new BMW();
		
		//Ausgabe der Fahrzeuge der einzelenen Hersteller
		for (AbstraktesFahrzeug fahrzeug : vw.getFahrzeuge()) {
			System.out.println(fahrzeug.getHersteller() + " " 
					+ fahrzeug.getModell() + " "
					+fahrzeug.getKw() + " KW"
					);
		}
		for (AbstraktesFahrzeug fahrzeug : bmw.getFahrzeuge()) {
			System.out.println(fahrzeug.getHersteller() + " " 
					+ fahrzeug.getModell() + " "
					+fahrzeug.getKw() + " KW"
					);
		}

	}

}
