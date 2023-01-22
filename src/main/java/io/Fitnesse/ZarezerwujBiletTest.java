package io.Fitnesse;

import java.util.IllegalFormatCodePointException;

import fit.ColumnFixture;
import io.bilet_package.Wlasciciel;

public class ZarezerwujBiletTest extends ColumnFixture{
	String[] dane;

	public boolean zarezerwowano(){
		try {
			return SetUp.bilet.zarezerwuj(new Wlasciciel(dane[0], dane[1], dane[2], Boolean.parseBoolean(dane[3])));
		} catch (IllegalFormatCodePointException e) {
			// TODO: handle exception
		}
		return false;
	}


	public String getWlasciciel(){
		if(SetUp.bilet.getWlasciciel()==null)
			return "none";
		return SetUp.bilet.getWlasciciel().wypisz();
	}
}
