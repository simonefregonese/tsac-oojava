package fregonese.simone.videoteca;

public class Bluray extends Film{
	
	public int costo(int giorni){
	
		if(giorni == 1)
			return 1;
		else
			return (int) (1 + giorni * 0.01);
	}
	

		
}
