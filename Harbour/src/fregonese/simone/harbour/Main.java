package fregonese.simone.harbour;

public class Main {
	
	public static void main(String[] args){
		
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
		g.setInvaders(new Invasore[]{a,s});
		
		System.out.println(p.getDimensione());
		g.attacco();
		System.out.println(p.getDimensione());
		
		
	}

}
