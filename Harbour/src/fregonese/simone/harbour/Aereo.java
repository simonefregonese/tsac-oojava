package fregonese.simone.harbour;

public class Aereo extends Invasore{
	
	private int armAlpha;
	private int armBeta;
	
	public void setPotenza(){
		super.setPotenza(this.getArmAlpha() * 10 + this.getArmBeta() * 25);
	}

	public int getArmAlpha() {
		return armAlpha;
	}

	public void setArmAlpha(int armAlpha) {
		this.armAlpha = armAlpha;
	}

	public int getArmBeta() {
		return armBeta;
	}

	public void setArmBeta(int armBeta) {
		this.armBeta = armBeta;
	}

}
