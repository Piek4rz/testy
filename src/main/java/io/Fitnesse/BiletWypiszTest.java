package io.Fitnesse;

import java.util.IllegalFormatCodePointException;

import fit.ColumnFixture;
import io.bilet_package.Bilet;
import io.bilet_package.Lot;

public class BiletWypiszTest extends ColumnFixture {
	String[] dane;

	public String wypisz(){
		try {
			return (new Bilet(Integer.parseUnsignedInt(dane[0]), new Lot(dane[1], dane[2], dane[3]), Integer.parseInt(dane[4]), Integer.parseInt(dane[5]))).wypisz();
		} catch (IllegalFormatCodePointException e) {
			// TODO: handle exception
		}
		return "error";
	}
}
