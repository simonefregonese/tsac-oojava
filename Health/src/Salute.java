
public class Salute extends Persona{
	
	public static double bmr(Persona person){
		double result = 0;
		
		if(person.sesso == "f"){
			result = 655 + (9.6 * person.peso) + (1.8 * person.altezza) - (4.7 * person.eta);				
		}
		else if(person.sesso == "m"){
			result = 655 + (13.8 * person.peso) + (1.8 * person.altezza) - (4.7 * person.eta);
		}
		
		switch(person.attivita){
		case "sedentario": result += result * 0.2;
			break;
		case "moderatamente attivo": result += result * 0.3;
			break;
		case "attivo": result += result * 0.4;
			break;
		case "molto attivo": result += result * 0.5;
			break;
		default: return 0;	
		}
		
		return result;
	}
	
	
	public static String imc(Persona p){
		double res = 0;
		String condizione = "";
		//double alt2 = p.altezza/100;	
		res = p.peso / (p.altezza/100 * p.altezza/100);
		if(res < 18.5)
			condizione = "Sei sottopeso!";
		else if(res >= 18.5 && res < 25)
			condizione = "Sei nella norma :D";
		else if(res >= 25 && res < 30)
			condizione = "Sei sovrappeso!";
		else if(res >= 30)
			condizione = "Sei obeso!";
		return condizione;
	}
	
	public static void main(String[] args){
		
		Persona carlo = new Persona();
		
		carlo.altezza = 175;
		carlo.peso = 70;
		carlo.attivita = "attivo";
		carlo.sesso = "m";
		carlo.eta = 25;
		
		System.out.println(bmr(carlo));
		System.out.println(imc(carlo));
		
	}
}
