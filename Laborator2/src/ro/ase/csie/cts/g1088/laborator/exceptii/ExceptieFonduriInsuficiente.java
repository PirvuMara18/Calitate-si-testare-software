package ro.ase.csie.cts.g1088.laborator.exceptii;

public class ExceptieFonduriInsuficiente extends Exception {
	
	
	public ExceptieFonduriInsuficiente(String mesaj) {
		super(mesaj);
	}
	
//daca scriu un constructor ala default dispare
	
	public ExceptieFonduriInsuficiente() {
		
	}

}
