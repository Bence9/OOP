package hanglemez;

public class Hanglemez {
	private String eloado;
	private String cim;
	private int hossz;
	
	public Hanglemez(String eloado, String cim, int hossz) {
		//super();
		this.eloado = eloado;
		this.cim = cim;
		this.hossz = hossz;
	}

	@Override
	public String toString() {
		return "Hanglemez [eloado=" + eloado + ", cim=" + cim + ", hossz=" + hossz + "]";
	}

	public int HosszOsszehasonlito(Hanglemez masik) {
		if(hossz > masik.hossz) {
			return 1;
		} 
		else if(hossz < masik.hossz) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public boolean Eload(Hanglemez masik) {
		return eloado == masik.eloado;
	}

	public String getEloado() {
		return eloado;
	}

	public void setEloado(String eloado) {
		this.eloado = eloado;
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public int getHossz() {
		return hossz;
	}

	public void setHossz(int hossz) {
		this.hossz = hossz;
	}
	
}
