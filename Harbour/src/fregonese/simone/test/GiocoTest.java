package fregonese.simone.test;

import org.junit.Test;

import fregonese.simone.harbour.Aereo;
import fregonese.simone.harbour.Gioco;
import fregonese.simone.harbour.Invasore;
import fregonese.simone.harbour.Porto;
import fregonese.simone.harbour.Sottomarino;

public class GiocoTest {
	@Test
	public void test() {
	
		Porto p = new Porto();
		p.setNome("Porto1");
		p.setnImbarcazioni(4);
		p.setDimensione(100);
		
		Sottomarino s = new Sottomarino();
		s.setnArmamenti(15);
		s.setStazza(10);
		
		Aereo a = new Aereo();
		a.setArmAlpha(10);
		a.setArmBeta(12);
		
		Gioco g = new Gioco();
		g.setPorto(p);
		g.setInvaders(new Invasore());
		
		g.attacco();
		System.out.println(p.getDimensione());
		
	
	}	

}
