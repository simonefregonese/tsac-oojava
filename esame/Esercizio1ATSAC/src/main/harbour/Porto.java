package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Porto {

	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;

	public double getDimensioneSqMetersNonDistrutta() {
		if(dimensioneSqMetersNonDistrutta > 0)
		return dimensioneSqMetersNonDistrutta;
		else
			return 0;
	}

	public void setDimensioneSqMetersNonDistrutta(int dimensioneSqMetersNonDistrutta) {
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMetersNonDistrutta;
	}

	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}

	public void setDimensioneSqMeters(double dimensioneSqMeters) {
		this.dimensioneSqMeters = dimensioneSqMeters;
		dimensioneSqMetersNonDistrutta = dimensioneSqMeters;
	}
	
	
	public void addMetriQuadriDistrutti(double dimensione) {
		//dimensioneSqMetersNonDistrutta = 
			//	(int) Math.max(dimensioneSqMetersNonDistrutta - dimensione, 0);
		dimensioneSqMetersNonDistrutta -= dimensione; 
	}
	
	
}
