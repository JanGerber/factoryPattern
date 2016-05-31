package factoryPattern.demo;

//Konkretes Produkt (Concrete Product)
//diese Klasse wird von der Factory Methode instanziiert
public class Golf extends AbstraktesFahrzeug {

	public Golf(int kw) {
		super("Volkswagen", "Golf", kw);
	}
	
}
