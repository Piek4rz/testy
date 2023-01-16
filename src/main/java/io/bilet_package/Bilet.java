package io.bilet_package;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Bilet {

	public int id_biletu;
	private Lot lot;
	private Wlasciciel wlascicel;
	private int cena;
	private int klasa;

	public String wypisz() {
		return "id_biletu() + ";
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
}