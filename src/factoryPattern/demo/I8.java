package factoryPattern.demo;

//Konkretes Produkt (Concrete Product)
//diese Klasse wird von der Factory Methode instanziiert
public class I8 extends AbstraktesFahrzeug{

	public I8(int kw) {
		super("BMW", "I8", kw);
	}
	

}
