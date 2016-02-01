package fregonese.simone.videoteca;

public class Cassetta extends Film{
	
	public int costo(int giorni){
		if(giorni == 1)
			return 1;
		else
			return 1 + 2 * giorni;
	}

}
