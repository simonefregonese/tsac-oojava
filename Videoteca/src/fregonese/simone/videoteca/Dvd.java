package fregonese.simone.videoteca;

public class Dvd extends Film{
	
	public int costo(int giorni){
		if(giorni <= 2)
			return (int) 1.5;
		else 
			return (int) (1.5 + 2 * giorni);
	}

}
