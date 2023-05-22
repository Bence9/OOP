import java.time.LocalDate;

public class CreditCard extends Card {
	
	private int hitelkeret;

	public int getHitelkeret() {
		return hitelkeret;
	}


	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}


	public CreditCard(String name, LocalDate ervenyesseg, int egyenleg, Card.Bank bank) {
		super(name, ervenyesseg, egyenleg, bank);
		setHitelkeret(100000);
	}


	public CreditCard(String name, LocalDate ervenyesseg, int egyenleg, Card.Bank bank, int hitelkeret) {
		super(name, ervenyesseg, egyenleg, bank);
		this.hitelkeret = hitelkeret;
	}
	
	@Override
	public boolean PenzFelvet(int osszeg) {
		LocalDate date = LocalDate.now() ;
		if(date.isBefore(getErvenyesseg())){
			return false;
		}
		else {
			if(getEgyenleg()-osszeg<0) {
				int valtozo = getEgyenleg()+getHitelkeret();
				if(valtozo-osszeg<0) {
					return false;
				} else {
					osszeg -= getEgyenleg();
					setEgyenleg(getEgyenleg()-getEgyenleg());
					setHitelkeret(getHitelkeret()-osszeg);
					return true;
				}
			}
			
			else {
				setEgyenleg(getEgyenleg()-osszeg);
				return true;
			}
		}
		
	}


	@Override
	public String toString() {
		return "CreditCard [hitelkeret=" + hitelkeret + "]";
	}

}
