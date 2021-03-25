package ro.ase.csie.cts.g1088.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Caracter3D implements Cloneable {
	String fisierModel3D;
	String culoare;
	int inaltime;
	
	ArrayList<Integer> puncteGrafic = null;

	public Caracter3D(String fisierModel3D) {
		System.out.println("Se incarca modelul 3D din fisierul" + fisierModel3D);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		this.fisierModel3D = fisierModel3D;
		
		
		Random random = new Random();
		puncteGrafic = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			puncteGrafic.add(random.nextInt(1000));
		}
		
	}
	
	
//facem un constructorul default din public in privat pt a evita constructorul costisitor cu param
	private Caracter3D() {
		
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Puncte caracter 3D: ");
		for(int punct: puncteGrafic) {
			sb.append(punct + "|");
		}
		
		return sb.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//clone face shallow copy, iti returneaza this si nu asta vrem
		//return super.clone();
		
		//noi vrem sa evitam constructorul costisitor si aici tocmai asta facem
		// asta era problema initiala
		
		//Caracter3D copie = Caractter3D(this.fisierModel3D);
		
		Caracter3D copie = new Caracter3D();
		copie.culoare= this.culoare;
		copie.fisierModel3D = this.fisierModel3D;
		copie.inaltime = this.inaltime;
		copie.puncteGrafic = (ArrayList<Integer>) this.puncteGrafic.clone();
		return copie;
	}
	
	
	
	
	
	
	
	

}
