package Card;

import java.time.LocalDate;

public class CreditCard extends Card {
	private int hitelkeret;
	
	public CreditCard(String nev, LocalDate ervenyesseg, Bank bank, int egyenleg) {
		super(nev, ervenyesseg, bank, egyenleg);
		this.hitelkeret=100000;
	}

	public CreditCard(String nev, LocalDate ervenyesseg, Bank bank, int egyenleg, int hitelkeret) {
		super(nev, ervenyesseg, bank, egyenleg);
		this.hitelkeret = hitelkeret;
	}

	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}

	@Override
	public String toString() {
		return "CreditCard [hitelkeret=" + hitelkeret + ", toString()=" + super.toString() + "]";
	}
	
	public boolean Penzfelvet(int osszeg) {
		LocalDate date = LocalDate.now();
		if(date.isBefore(getErvenyesseg())) {
			return false;
		}
		
		int valtozo = getEgyenleg() + hitelkeret;
		
		if( valtozo < osszeg ) {
			return false;
		}
		else if(getEgyenleg() > osszeg) {
			setEgyenleg(getEgyenleg()-osszeg);
			return true;
		}
		else {
			int szam = getEgyenleg()-osszeg;
			setHitelkeret(getHitelkeret() - szam);
			return true;
		}
	}
	
}
