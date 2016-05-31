package factoryPattern.demo;

//Konkretes Produkt (Concrete Product)
//diese Klasse wird von der Factory Methode instanziiert
public class Passat extends AbstraktesFahrzeug {

	public Passat(int kw) {
		super("Volkswagen", "Passat", kw);
	}
	
}
