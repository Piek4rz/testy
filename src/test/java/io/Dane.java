package io;

import io.bilet_package.Bilet;
import io.bilet_package.Lot;
import io.bilet_package.Wlasciciel;

public class Dane {
	public static final Lot l1 = new Lot("Warszawa", "Poznan", "12.02.2023");
	public static final Lot l2 = new Lot("Wroclaw", "Łódź", "10.02.2023");
	public static final Bilet b = new Bilet(0, l1, 15, 1);
	public static final Bilet b2 = new Bilet(1, l2, 3, 1);
	public static final Wlasciciel w = new Wlasciciel("Adam", "Kowalski", "Wroclaw", true);
	public static final Wlasciciel w2 = new Wlasciciel("Karol", "Adamski", "Wroclaw", true);

	public static final String[] imiona = {"Bartek", "Anna", "Wojtek", "Kamil", "Zosia", "Antek", "Karolina", "Michał", "Emilia"};
	public static final String[] nazwiska = {"Kowalski", "Adamnski",  "BALKIEWICZ", "CECUŁA", "CWOJDZIŃSKI", "CWYL", "DREWCZYŃSKI", "FILEWICZ", "GĄSIOROWSKI"};
	public static final String[] daty = {"12.02.2022","10.02.2023", "15.12.2022", "22.01.2023"};
	public static final String[] miasta = {"Warszawa", "Poznan", "Łódź", "Kalisz" , "Gdynia",  "Lublin", "Grodzisk Mazowiecki", "Kraków"};
}
