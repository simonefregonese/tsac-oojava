package fregonese.simone.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fregonese.simone.videoteca.Bluray;
import fregonese.simone.videoteca.Cassetta;
import fregonese.simone.videoteca.Dvd;

public class NoleggioTest {

	@Test
	public void test() {
		
		Cassetta c = new Cassetta();
		c.setAnno(1999);
		c.setAttori("Fox, Jimmy");
		c.setRegista("Spielberg");
		c.setTitolo("Il mostro");
		
		assertEquals(9,c.costo(4));
		
		Dvd d = new Dvd();
		//assertEquals(12,d.costo(4));
		System.out.println(d.costo(4));
		Bluray b = new Bluray();
		//assertEquals(,b.costo(4));
		
	}

}
