package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {
	
	private Porto porto;
	
	public Gioco(Porto p){
		this.porto = p;
		
	}

	public void attacco(Invasore[] invasori) {
		int sommaInvasori = 0;
		for(Invasore inv: invasori){
			sommaInvasori += inv.potenzaFuoco(); 
			
		}
		porto.addMetriQuadriDistrutti(sommaInvasori * 2.5);
	}

	public boolean portoDistrutto() {
		return porto.getDimensioneSqMetersNonDistrutta() <= 0; 
	}

}
