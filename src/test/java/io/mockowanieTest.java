package io;
import org.junit.Test;

import io.bilet_package.Bilet;
import io.bilet_package.Lot;
import io.bilet_package.Wlasciciel;
import mockit.Mocked;
import mockit.Verifications;

public class mockowanieTest {
	@Mocked public Bilet bilet = new Bilet(0, new Lot(Dane.miasta[0], Dane.miasta[1], Dane.daty[0]), 27, 1);
	
	@Test
	public void test1(){
		// Aplikacja aplikacja = new Aplikacja();
		// aplikacja.dodajBilet(new Bilet(0, new Lot(Dane.miasta[0], Dane.miasta[1], Dane.daty[0]), 27, 1));
		Wlasciciel wlasciciel = new Wlasciciel(Dane.imiona[0],Dane.nazwiska[0], "", false);
		bilet.zarezerwuj(wlasciciel);
		bilet.zarezerwuj(wlasciciel);
		bilet.zarezerwuj(wlasciciel);
		bilet.zarezerwuj(wlasciciel);
		new Verifications() {
			{ bilet.zarezerwuj(wlasciciel); times=4;}};
	}

}
