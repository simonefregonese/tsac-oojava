package main;

public class Calcolo {
	
	TemperatureSensorListener list;
	double tmp = 0;
	
	public double maxTemperature(double v){
		
		if(v > tmp)
			tmp = v;		
		
		return Math.max(v,tmp);
		
	}

	public double avgTemperature(){
		
		return 0;
	}
	

}
