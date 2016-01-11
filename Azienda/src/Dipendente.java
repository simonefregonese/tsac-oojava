
public class Dipendente extends Contratto{

	String nome;
	String cognome;
	int anzianità;
	double stipendioEffettivo = stipendio + (0.05*anzianità);
	

}
