package io.bilet_package;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import io.Dane;

public class LotTest {
	@Test
	void getData(){
		Lot lot = new Lot(Dane.l1);
		assertNotNull(lot);
		assertEquals("12.02.2023", lot.getData());
	}
}
