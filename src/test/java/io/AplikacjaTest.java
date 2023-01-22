package io;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import io.bilet_package.Bilet;
import io.bilet_package.Wlasciciel;
import io.bilet_package.Categories.KupIRezerwujCategory;


public class AplikacjaTest {

    @Test
    public void szukajBilet() {
			Aplikacja a = new Aplikacja();
			Bilet b = new Bilet(Dane.b);
			a.dodajBilet(b);
			assertNotNull(a.szukajBilet());
    }

    @Test
    public void szukajBiletZFiltrami() {
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
    public void czyMoznaZwrocic() {
			Aplikacja a = new Aplikacja();
			Bilet b1 = new Bilet(Dane.b);
			Bilet b2 = new Bilet(Dane.b2);
			Wlasciciel w = new Wlasciciel(Dane.w);
			a.dodajBilet(b1);
			a.dodajBilet(b2);
			Filtry f = new Filtry();
			for(Bilet b : a.szukajBiletZFiltrami(f)){
				assertTrue(b.zarezerwuj(w));
			}
    }

    @Test
		@Category(KupIRezerwujCategory.class)
    public void kupBilet() {
			Aplikacja a = new Aplikacja();
			Bilet b1 = new Bilet(Dane.b);
			Bilet b2 = new Bilet(Dane.b2);
			Wlasciciel w = new Wlasciciel(Dane.w);
			a.dodajBilet(b1);
			a.dodajBilet(b2);
			Filtry f = new Filtry();
			for(Bilet b : a.szukajBiletZFiltrami(f)){
				assertTrue(b.zarezerwuj(w));
			}
			for(Bilet b : a.szukajBiletZFiltrami(f)){
				assertNotEquals(-1,  b.kup(w));
			}
    }

    @Test
    public void dodajBilet(){
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