package fregonese.simone.videoteca;

public class Film {

	private String titolo;
	private String regista;
	private int anno;
	private String attori;
	
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public String getAttori() {
		return attori;
	}
	public void setAttori(String attori) {
		this.attori = attori;
	}
	
	
	public int costo(int giorni){
		return 0;
	}
}
