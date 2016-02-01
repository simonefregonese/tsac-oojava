package fregonese.simone.harbour;

public class Sottomarino extends Invasore{
	
	private int nArmamenti;
	private double stazza;
	
	public void setPotenza(){
		super.setPotenza(this.getnArmamenti() * this.getStazza());
	}

	public int getnArmamenti() {
		return nArmamenti;
	}

	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}

	public double getStazza() {
		return stazza;
	}

	public void setStazza(double stazza) {
		this.stazza = stazza;
	}
	

}
