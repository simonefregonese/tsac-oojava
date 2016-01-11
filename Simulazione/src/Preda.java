import java.util.Random;

public class Preda {
	
	int passi = 0;
	Random random = new Random();
	
	int randomInt(int min,int max){
		int n = max - min + 1;
		int i = random.nextInt() % n;
		int randomNum =  min + i;
		return randomNum;
	}
	
	

}
