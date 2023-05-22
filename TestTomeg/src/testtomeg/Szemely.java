package testtomeg;

public class Szemely {
	private String nev;
	private int suly;
	private double magassag;
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public int getSuly() {
		return suly;
	}
	public void setSuly(int suly) {
		this.suly = suly;
	}
	public double getMagassag() {
		return magassag;
	}
	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}
	
	public double tti(int suly,double magassag) {
		return suly/(magassag*magassag);
	}
	
	public String alkat() {
		double ertek = tti(suly,magassag);
		if(ertek<18.5) {
			return "sovany";
		}
		else if(ertek>25) {
			return "kover";
		}
		else {
			return "normal";
		}
		
	}
	
	public String osszefuzes() {
		return "Név:" + getNev() +
				"Suly:" + getSuly() + 
				"Magassag:" + getMagassag() + 
				"testtömegindex:" + alkat();
	}
	
}
