
public class Card {

	public Card(String seme, int valore) {
		this.seme=seme;
		this.valore=Integer.toString(valore);
	}
	
	public Card(String seme, String valore) {
		this.seme=seme;
		this.valore=valore;
	}
	
	
	public String getSeme() {
		return seme;
	}
	public void setSeme(String seme) {
		this.seme = seme;
	}
	public String getValore() {
		return valore;
	}
	
	public void setValore(int valore) {
		this.valore = Integer.toString(valore);
	}
	
	public void setValore(String valore) {
		this.valore = valore;
	}


	@Override
	public String toString() {
		return seme + " " + valore;
	}



	private String seme;
	private String valore;
}
