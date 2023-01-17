package io;

import org.junit.jupiter.api.Test;

import io.bilet_package.Bilet;

import static org.junit.jupiter.api.Assertions.*;

class AplikacjaTest {

    @Test
    void szukajBilet() {
			Aplikacja a = new Aplikacja();
			Bilet b = new Bilet(Dane.b);
			a.dodajBilet(b);
			assertNotNull(a.szukajBilet());
    }

    @Test
    void szukajBiletZFiltrami() {
			Aplikacja a = new Aplikacja();
			Bilet b1 = new Bilet(Dane.b);
			Bilet b2 = new Bilet(Dane.b2);
			a.dodajBilet(b1);
			a.dodajBilet(b2);
			Filtry f = new Filtry();
			f.setPoCenie(true);
			f.setCenaMin(10);
			f.setCenaMax(20);
			assertEquals(1, a.szukajBiletZFiltrami(f).size());
			Filtry f2 = new Filtry();
			f2.setPoKlasie(true);
			f2.setKlasa(1);
			assertEquals(2, a.szukajBiletZFiltrami(f2).size());
    }

    @Test
    void czyMoznaZwrocic() {
    }

    @Test
    void kupBilet() {
    }

    @Test
    void getBilety() {
    }

    @Test
    void zwrocBilet() {
    }

    @Test
    void zarezerwujBilet() {
    }

    @Test
    void wyslijBilet() {
    }

    @Test
    void poprawnoscPlatnosci() {
    }

    @Test
    void dodajBilet(){
			Bilet b = Dane.b;
			Bilet b2 = Dane.b2;

			Aplikacja a = new Aplikacja();
			a.dodajBilet(b);
			assertEquals(1, a.ileBiletow());
			a.dodajBilet(b2);
			assertEquals(2, a.ileBiletow());
			a.dodajBilet(b);
			assertEquals(2, a.ileBiletow());
    }
}