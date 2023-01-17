package io.bilet_package;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Bilet {

	public int id_biletu;
	private Lot lot;
	private Wlasciciel wlascicel;
	private int cena;
	private int klasa;
	public Bilet(Bilet b) {
		id_biletu = b.id_biletu;
		lot = b.lot;
		cena = b.cena;
		klasa = b.klasa;
	}
	public Bilet(int id, Lot lot, int cena, int klasa) {
		this.id_biletu = id;
		this.lot = lot;
		this.cena = cena;
		this.klasa = klasa;
		wlascicel = null;
	}

	public String wypisz() {
		return lot.wypisz() + " " + String.valueOf(cena)  + " " + String.valueOf(klasa);
	}

	public int getCena() {
		return cena;
	}

	public Wlasciciel getWlasciciel() {
		return wlascicel;
	}

	public int kup(Wlasciciel wlasciciel) {
		if(this.wlascicel == wlasciciel){
			System.out.println("Kupiono");
			return cena;
		}
		return -1;
	}

	public boolean zarezerwuj(Wlasciciel wlascicel) {
		if (this.wlascicel == null){
			this.wlascicel = wlascicel;
			return true;
		} else if(this.wlascicel==wlascicel)
			return true;
		return false;
	}

	public int getKlasa() {
		return klasa;
	}

	public Lot getLot() {
		return lot;
	}
}