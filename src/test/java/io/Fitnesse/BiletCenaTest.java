package io.Fitnesse;

import fit.ColumnFixture;
import io.Dane;
import io.bilet_package.Bilet;
import io.bilet_package.Lot;

public class BiletCenaTest extends ColumnFixture {
	int cena;

	public boolean BiletCena(){
		return (new Bilet(0, new Lot(Dane.miasta[0], Dane.miasta[1], Dane.daty[0]), 27, 1)).getCena()==cena;
	}
	
}
