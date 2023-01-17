package io;

import org.junit.jupiter.api.Test;

import io.bilet_package.Bilet;

import static org.junit.jupiter.api.Assertions.*;

class AplikacjaTest {

    @Test
    void szukajBilet() {
    }

    @Test
    void szukajBiletZFiltrami() {
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