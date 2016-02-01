package fregonese.simone.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fregonese.simone.harbour.Porto;

public class PortoTest {

	@Test
	public void test() {
		Porto p = new Porto();
		p.setNome("Porto1");
		p.setDimensione(300);
		p.setnImbarcazioni(5);
		
		//assertEquals(300, p.getDimensione());
	}

}
