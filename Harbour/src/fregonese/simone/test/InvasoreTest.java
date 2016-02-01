package fregonese.simone.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fregonese.simone.harbour.Invasore;

public class InvasoreTest {

	@Test
	public void test() {
		
		Invasore i = new Invasore();
		i.setCodice("a1");
		i.setModello("invader");
		i.setPotenza(20);
	}

}
