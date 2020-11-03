package de.hs_lu.o2s.tutorium.tut6;

public class Disko extends Haus {

	private double eintrittspreis = 12.50; //Der Preis ist, falls nicht anders angegeben 12.50
	private int tanzflaeche;
	private int altersbeschraenkung = 18; //Mindestalter ist, falls nicht anders im Konstruktor angegebn 18


	public Disko() {
		
	}
	
	public Disko(double eintrittspreis1) {
		this.eintrittspreis = this.eintrittspreiskorrekt(eintrittspreis1);
	}
	
	public Disko(double eintrittspreis, int tanzflaeche) {
		this(eintrittspreis);
		this.tanzflaeche = tanzflaeche;
	}
	
	public Disko(double eintrittspreis, int tanzflaeche, int altersbeschraenkung) {
		this(eintrittspreis,tanzflaeche);
		this.altersbeschraenkung = altersbeschraenkung;
		this.alterbeschraenkungkorrekt(this.altersbeschraenkung);
	}

	public Disko(String strasse) {
		super(strasse);
	}

	public Disko(String strasse, int etagen) {
		super(strasse, etagen);
	}

	public Disko(String strasse, int etagen, int einwohner) {
		super(strasse, etagen, einwohner);
	}
	
	public String toString() {
		String s = super.toString();
		s += " Die Disko ist f�r Personen ab einem Alter von " + this.getAltersbeschraenkung() + " Jahren zugelassen. "
				+ "Der Eintrittspreis betr�gt " + this.getEintrittspreis() + " und besitzt eine Tanzfl�che von "
				+ this.getTanzflaeche() + " qm�.";
		return s;
	}

	public double getEintrittspreis() {
		return eintrittspreis;
	}

	public void setEintrittspreis(double eintrittspreis1) {
		this.eintrittspreis = this.eintrittspreiskorrekt(eintrittspreis1);
	}

	public int getTanzflaeche() {
		return tanzflaeche;
	}

	public void setTanzflaeche(int tanzflaeche) {
		this.tanzflaeche = tanzflaeche;
	}

	public int getAltersbeschraenkung() {
		return altersbeschraenkung;
	}

	public void setAltersbeschraenkung(int altersbeschraenkung) {
		this.altersbeschraenkung = altersbeschraenkung;
	}
	
	
	private void alterbeschraenkungkorrekt(int alterbeschraenkung) {
		if (alterbeschraenkung < 18) {
			this.altersbeschraenkung = 18;
		}
	}
	
	private double eintrittspreiskorrekt(double eintrittspreis) {
		if (eintrittspreis == 0) {
			return 12.50;
		}
		else return eintrittspreis;
	}



	

	



}
