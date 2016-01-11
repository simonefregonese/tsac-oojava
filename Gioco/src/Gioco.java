
public class Gioco{
	
	static int dannoGiocatore(Giocatore gioc , Alieno alien){
		if(vivo(gioc)){
		gioc.salute -= alien.danno;
		return gioc.salute;
		}
		else 
			return 0;		
	}
	
	static boolean vivo(Giocatore gioc){
		if(gioc.salute > 0)
			return true;
		else
			return false;
	}
	
	public static void main(String []args){
	
		Giocatore player1 = new Giocatore();
		
		player1.nome = "Player1";
		player1.salute = 100;
		
		Alieno piccolo = new Alieno();
		
		piccolo.nome = "Piccolo";
		piccolo.danno = 30;
		
		dannoGiocatore(player1,piccolo);
		System.out.println("Salute: " + player1.salute);
		
	}

}
