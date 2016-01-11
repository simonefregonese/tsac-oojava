
public class CambioMonete {
	
	public static int cambio(int n){
		int b500 = 0;
		int b200 = 0;
		int b100 = 0,b50 = 0,b20 = 0,b10 = 0,b5 = 0,b2 = 0,b1 = 0;
		if(n/500 == (int)n){
			b500++;
			return cambio(n/500);
			}
		else if(n/200 == (int)n){
			b200++;
			return cambio(n/200);
			}
		else if(n/100 == (int)n){
			b100++;
			return cambio(n/100);
			}
		else if(n/50 == (int)n){
			b50++;
			return cambio(n/50);
			}
		else if(n/20 == (int)n){
			b20++;
			return cambio(n/20);
			}
		else if(n/10 == (int)n){
			b10++;
			return cambio(n/10);
			}
		else if(n/5 == (int)n){
			b5++;
			return cambio(n/5);
			}
		else if(n/2 == (int)n){
			b2++;
			return cambio(n/2);
			}
		else if(n/1 == (int)n){
			b1++;
			return cambio(n-1);
			}
		return b500;
	}

	public static void main(String[] args){
		
		System.out.println(cambio(1500));
		
	}
}
