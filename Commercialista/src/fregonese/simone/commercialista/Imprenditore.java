package fregonese.simone.commercialista;

public class Imprenditore {
	
	String nome;
	String cognome;
	String cf;
	int piva;
	String ragioneSociale;
	int nFatture;

	double fattura(Imprenditore imp){
		return 50 + imp.nFatture * 0.5;
	}
}
