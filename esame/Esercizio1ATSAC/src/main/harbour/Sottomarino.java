package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Sottomarino extends Invasore{
	
	private int stazza;
	private int nArmamenti;
	
	
	public int getStazza() {
		return stazza;
	}
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	public int getnArmamenti() {
		return nArmamenti;
	}
	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}
	
	@Override
	public int potenzaFuoco(){
		return Math.round((nArmamenti * stazza) / 4f);
	}
	
}
