package fregonese.simone.harbour;

public class Gioco {	
		
		Porto porto;
		Invasore[] invaders;
		
		public boolean isDestroyed(){
			if(porto.getDimensione() <= 0)
				return true;
			else
				return false;
		
		}
		
		public Porto getPorto() {
			return porto;
		}

		public void setPorto(Porto porto) {
			this.porto = porto;
		}

		public Invasore[] getInvaders() {
			return invaders;
		}

		public void setInvaders(Invasore[] invaders) {
			this.invaders = invaders;
		}

		public void attacco(){
			for(int i = 0; i < invaders.length; i++){
				porto.setDimensione(porto.getDimensione() - invaders[i].getPotenza() * 1.5);
			}
			
		}
	

}
