package io.Fitnesse;

import fit.Fixture;
import io.Aplikacja;
import io.bilet_package.Bilet;
import io.bilet_package.Lot;

public class SetUp extends Fixture {
	public static Aplikacja aplikacja;
	public static Bilet bilet;
	public SetUp(){
		aplikacja= new Aplikacja();
		bilet = new Bilet(0, new Lot("Warszawa", "Wrocław", "23.01.2023"), 27, 1);
	}
}
