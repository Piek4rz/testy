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
}
