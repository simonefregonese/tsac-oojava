package fregonese.simone.commercialista;

public class LibProfessionista {
	
	String nome;
	String cognome;
	String cf;
	int piva;
	int nFatture;
	
	double parcella(LibProfessionista lib){
		
		if(lib.nFatture < 100)
			return 500;
		else
			return 500 + lib.nFatture;
		
	}

}
