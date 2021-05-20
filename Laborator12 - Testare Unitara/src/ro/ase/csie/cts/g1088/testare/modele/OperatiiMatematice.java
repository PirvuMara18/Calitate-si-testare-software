package ro.ase.csie.cts.g1088.testare.modele;

import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieimpartireLaZero;

public class OperatiiMatematice {
	
	public static int suma(int a, int b) {
		return a + b;
	}
	
	public static double impartire(int a, int b) throws ExceptieimpartireLaZero {
		if(b == 0) {
			throw new ExceptieimpartireLaZero();
		}
		return a/b;
	}
	
	

}
