package factoryPattern.demo;

//Produkt
public abstract class AbstraktesFahrzeug {
	private String hersteller;
	private String modell;
	private int kw;
	
	public String getHersteller() {
		return hersteller;
	}
	public String getModell() {
		return modell;
	}
	public int getKw() {
		return kw;
	}

	public AbstraktesFahrzeug(String hersteller, String modell, int kw) {
		this.hersteller = hersteller;
		this.modell = modell;
		this.kw = kw;
	}
	
	
		
}
