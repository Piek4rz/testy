package io;

import java.util.HashMap;

import java.util.Map;
import java.util.ArrayList;

import io.Zaplata.Platnosc;
import io.bilet_package.Bilet;
import io.bilet_package.Wlasciciel;

public class Aplikacja {

	private Map<Integer, Bilet> bilety = new HashMap<Integer, Bilet>();

//	public String szukajBilet()                                         { return bilety.toString(); }
	public ArrayList<Bilet> szukajBiletZFiltrami(Filtry filtry) {
		ArrayList<Bilet> wynik = new ArrayList<Bilet>();
		for (int id : bilety.keySet()) {
			Bilet bilet = bilety.get(id);
			if(filtry.PoCenie&&(bilet.getCena()<filtry.cenaMin || bilet.getCena()>filtry.cenaMax))
				continue;
			if(filtry.PoDacie&&(bilet.getLot().getData() != filtry.data))
				continue;
			if(filtry.poRegionie && bilet.getLot().getMiejsceWylotu()!=filtry.region)
				continue;
			if(filtry.poKlasie && bilet.getKlasa() != filtry.klasa)
				continue;
			wynik.add(bilet);
		}
		return wynik;
	}
//	public boolean czyMoznaZwrocic(int bilet)                           {
//		if(bilety.get(bilet).lot.data_wylotu > now()+600);
//
//	}
//	public Platnosc kupBilet(Bilet bilet, Wlasciciel wlasciciel)        {
//		bilet.kup(wlasciciel);
//		return
//	}
//	public ArrayList<Bilet> getBilety()                                { return bilety; }
//	public void zwrocBilet(Bilet bilet)                                   { bilet.wlasciciel = null; }
//	public void zarezerwujBilet(int idBiletu, Wlasciciel wlasciciel){}
//	public void wyslijBilet(Bilet bilet){}
//	public void poprawnoscPlatnosci(Platnosc Platnosc){}
//	public void main(){
//
//	}

	public String szukajBilet(){
		return null;
	}
	public void dodajBilet(Bilet b){
		bilety.put(b.id_biletu, b);
	}
	public boolean czyMoznaZwrocic(int bilet)                           {
		return true;
	}
	public Platnosc kupBilet(Bilet bilet, Wlasciciel wlasciciel)        {
		bilet.kup(wlasciciel);
		return null;
	}
	public int ileBiletow(){
		return bilety.size();
	}
	public void zwrocBilet(Bilet bilet){}
	public void zarezerwujBilet(int idBiletu, Wlasciciel wlasciciel) {

	}
	public void wyslijBilet(Bilet bilet){}
	public void poprawnoscPlatnosci(Platnosc Platnosc){}
	public static void main(String[] args) {
		 System.out.println("Hello world!");
    }
}