package ro.ase.csie.cts.g1088.dp.composite;

public class CarcterNPC extends UnitateAbstractaJoc {
	
	String tip;
	int putere;
	
	

	public CarcterNPC(String tip, int putere) {
		super();
		this.tip = tip;
		this.putere = putere;
	}

	@Override
	public void seDeplaseaza(int x, int y) {
      System.out.println(String.format("%s se deplaseaza", tip) );		
	}

	@Override
	public void atacaJucator(int puncte) {
	      System.out.println(String.format("%s ataca jcatorul", tip) );		
		
	}

	@Override
	public void seRetrag() {
	      System.out.println(String.format("%s se retrage", tip) );		
		
	}
	
	
	//solutia1  cand nu sunt implementate in nivelul abstract

//	@Override
//	public void adaugaCaracter(UnitateAbstractaJoc unitate) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public void stergeCaracter(UnitateAbstractaJoc unitate) {
//		throw new UnsupportedOperationException();
//		
//	}
//
//	@Override
//	public UnitateAbstractaJoc getCaracter(int index) {
//		throw new UnsupportedOperationException();
//
//	}

}
