package io.bilet_package;

public class Wlasciciel {

	public String imie;
	public String nazwisko;
	public String adres;
	public boolean plec;


	public Wlasciciel(String imie, String nazwisko, String adres, boolean plec) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.plec = plec;
	}

	public Wlasciciel(Wlasciciel w){
		imie = w.imie;
		nazwisko = w.nazwisko;
		adres = w.adres;
		plec = w.plec;
	}

	public String wypisz(){
		return imie + " " + nazwisko + " " + adres + " " + String.valueOf(plec);
	}

}