package ro.ase.csie.cts.g1088.dp.composite;

public abstract class UnitateAbstractaJoc implements InterfataNPC {
	
	//interfata nodurilor frunza este mostenita
	//definim interfata specifica nodurilor copil
	
	//solutia 2. implementam metodele care inainte erau abstracte
	public  void adaugaCaracter(UnitateAbstractaJoc unitate) {
		throw new UnsupportedOperationException();
	}
	
	public  void stergeCaracter(UnitateAbstractaJoc unitate) {
		throw new UnsupportedOperationException();
	}
	public  UnitateAbstractaJoc getCaracter(int index){
		throw new UnsupportedOperationException();
	}
	

}
