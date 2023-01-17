package io.bilet_package;

import org.junit.jupiter.api.Test;

import io.Dane;

import org.junit.Assert;
class BiletTest {
	
	@Test
	void getWlasciciel() {
		Bilet b = new Bilet(Dane.b);
		Wlasciciel w = new Wlasciciel(Dane.w);
		Assert.assertEquals(null, b.getWlasciciel());
		b.zarezerwuj(w);
		Assert.assertEquals(w, b.getWlasciciel());
	}
	
	@Test
	void kup() {
		Bilet b = new Bilet(Dane.b);
		Wlasciciel w = new Wlasciciel(Dane.w);
		Assert.assertEquals(-1, b.kup(w));
		b.zarezerwuj(w);
		Assert.assertEquals(15, b.kup(w));
		}
		
    @Test
    void zarezerwuj() {
			Bilet b = new Bilet(Dane.b);
			Wlasciciel w = new Wlasciciel(Dane.w);
			Wlasciciel w2 = new Wlasciciel(Dane.w2);
			b.zarezerwuj(w);
			Assert.assertTrue(b.zarezerwuj(w));
			Assert.assertFalse(b.zarezerwuj(w2));
    }

		@Test
		void getKlasa(){
			Bilet b = new Bilet(Dane.b);
			Assert.assertEquals(1, b.getKlasa());
		}

		@Test
		void getLot(){
			Bilet b = new Bilet(Dane.b);
			Lot l = Dane.l1;
			Assert.assertEquals(l, b.getLot());
			Lot l2 = new Lot(Dane.l2);
			Assert.assertNotEquals(l2, b.getLot());
		}
}