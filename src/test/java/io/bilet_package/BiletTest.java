package io.bilet_package;
import io.Dane;
import io.bilet_package.Categories.EntityTest;
import io.bilet_package.Categories.KupIRezerwujCategory;
import io.bilet_package.Categories.ParametrisedTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@Category(EntityTest.class)
@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BiletTest {
	@Parameter
		public int numer1;
		@Parameters
		public static List<Object> data() {
			ArrayList<Object> list = new ArrayList<Object>();
			int min = Dane.daty.length;
			if(Dane.imiona.length<min)
			min = Dane.imiona.length;
			if(Dane.nazwiska.length<min)
				min = Dane.nazwiska.length;
			for(int i=0; i<min; i++)
			list.add(i);
			return list;
		}

	@Test
	@Category(KupIRezerwujCategory.class)
	public void kup() {
		Bilet b = new Bilet(Dane.b);
		Wlasciciel w = new Wlasciciel(Dane.w);
		Assert.assertEquals(-1, b.kup(w));
		b.zarezerwuj(w);
		Assert.assertEquals(15, b.kup(w));
	}
	
	@Test
	public void getWlasciciel() {
		Bilet b = new Bilet(Dane.b);
		Wlasciciel w = new Wlasciciel(Dane.w);
		Assert.assertEquals(null, b.getWlasciciel());
		b.zarezerwuj(w);
		Assert.assertEquals(w, b.getWlasciciel());
	}

	@Test
	public void zarezerwujAleNieSparametryzowany(){
		Bilet b = new Bilet(Dane.b);
		Wlasciciel w = new Wlasciciel(Dane.w);
		Wlasciciel w2 = new Wlasciciel(Dane.w);
		assertFalse(w==w2);
		assertTrue( b.zarezerwuj(w));
		assertTrue( b.zarezerwuj(w));
		assertTrue( b.zarezerwuj(w2));
	}

		@Test
		@Category({KupIRezerwujCategory.class, ParametrisedTests.class})
    public void zarezerwuj() {
			ArrayList<Bilet> bilety = new ArrayList<>();
			for(int i=0; i<(Dane.miasta.length<Dane.daty.length?Dane.miasta.length:Dane.daty.length); i++)
				bilety.add(new Bilet(i, new Lot(Dane.miasta[i], Dane.miasta[(i+1)%Dane.miasta.length], Dane.daty[i]), i, i));
			ArrayList<Wlasciciel> wlasciciele = new ArrayList<>();
			int min = bilety.size();
			if(Dane.imiona.length<min)
				min = Dane.imiona.length;
			if(Dane.nazwiska.length<min)
				min = Dane.nazwiska.length;
			for(int i=0; i<min; i++){
				Wlasciciel w = new Wlasciciel(Dane.imiona[i], Dane.nazwiska[i], " ", (i%2==0));
				wlasciciele.add(w);
				bilety.get(i).zarezerwuj(w);
			}
			for(int i=0; i<bilety.size(); i++)
				if(numer1==i){
					assertTrue(bilety.get(i).zarezerwuj(wlasciciele.get(numer1)));
				}else{
					assertFalse(bilety.get(i).zarezerwuj(wlasciciele.get(numer1)));
				}
    }

		@Test
		public void getKlasa(){
			Bilet b = new Bilet(Dane.b);
			Assert.assertEquals(1, b.getKlasa());
		}

		@Test
		public void getLot(){
			Bilet b = new Bilet(Dane.b);
			Lot l = Dane.l1;
			Assert.assertEquals(l, b.getLot());
			Lot l2 = new Lot(Dane.l2);
			Assert.assertNotEquals(l2, b.getLot());
		}
}