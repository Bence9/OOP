package Card;

import java.time.LocalDate;

public class Card {
	private String nev;
	private LocalDate ervenyesseg;
	private Bank bank;
	private int egyenleg;
	
	public Card(String nev, LocalDate ervenyesseg, Bank bank, int egyenleg) {
		super();
		this.nev = nev;
		this.ervenyesseg = ervenyesseg;
		this.bank = bank;
		this.egyenleg = egyenleg;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}

	public String getNev() {
		return nev;
	}

	public LocalDate getErvenyesseg() {
		return ervenyesseg;
	}

	public Bank getBank() {
		return bank;
	}
	
	public boolean Penzfelvet(int osszeg) {
		LocalDate date = LocalDate.now();
		if(getEgyenleg()<osszeg) {
			return false;
		}
		else if(date.isBefore(getErvenyesseg())) {
			return false;
		}
		else {
			setEgyenleg(getEgyenleg()-osszeg);
			return true;
		}
	}

	@Override
	public String toString() {
		return "Card [nev=" + nev + ", ervenyesseg=" + ervenyesseg + ", bank=" + bank + ", egyenleg=" + egyenleg + "]";
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public void setErvenyesseg(LocalDate ervenyesseg) {
		this.ervenyesseg = ervenyesseg;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
}
