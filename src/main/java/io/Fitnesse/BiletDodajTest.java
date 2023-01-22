package io.Fitnesse;

import java.util.IllegalFormatCodePointException;

import fit.ColumnFixture;
import io.bilet_package.Bilet;
import io.bilet_package.Lot;

public class BiletDodajTest extends ColumnFixture {
	String[] dane;

	public boolean dodajBilet() {
		int s1 = liczbaBiletów();
		try {
			SetUp.aplikacja.dodajBilet(new Bilet(Integer.parseInt(dane[0]), new Lot(dane[1], dane[2], dane[3]), Integer.parseInt(dane[4]), Integer.parseInt(dane[5])));
			int s2 = liczbaBiletów();
			return s1!=s2;
		} catch (IllegalFormatCodePointException e) {
			// TODO: xd?
		}
		return false;
	}

	public int liczbaBiletów(){
		return SetUp.aplikacja.ileBiletow();
	}
}
