package io.Suits;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import io.AplikacjaTest;
import io.bilet_package.BiletTest;
import io.bilet_package.LotTest;
import io.bilet_package.Categories.KupIRezerwujCategory;

@RunWith(Categories.class)
@IncludeCategory(KupIRezerwujCategory.class)
@Suite.SuiteClasses({
	BiletTest.class,
	LotTest.class,
	AplikacjaTest.class
})
public class KupIRezerwujSuit {
	
}
