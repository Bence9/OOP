import java.time.LocalDate;


public class Card {
	public enum Bank{
		OTP, KH, ERSTE, CIB
	}
	
	private String name;
	private LocalDate ervenyesseg;
	private int egyenleg;
	private Bank Bank;
	
	public Card(String name, LocalDate ervenyesseg, int egyenleg, Card.Bank bank) {
		super();
		this.name = name;
		this.ervenyesseg = ervenyesseg;
		this.egyenleg = egyenleg;
		Bank = bank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getErvenyesseg() {
		return ervenyesseg;
	}

	public void setErvenyesseg(LocalDate ervenyesseg) {
		this.ervenyesseg = ervenyesseg;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}

	public Bank getBank() {
		return Bank;
	}

	public void setBank(Bank bank) {
		Bank = bank;
	}
	
	public boolean PenzFelvet(int osszeg) {
		LocalDate date = LocalDate.now() ;
		if(getEgyenleg()-osszeg<0) {
			return false;
		}
		else {
			if(date.isBefore(getErvenyesseg())){
				return false;
			}
			else {
				setEgyenleg(getEgyenleg()-osszeg);
				return true;
			}
			
		}
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", ervenyesseg=" + ervenyesseg + ", egyenleg=" + egyenleg + ", Bank=" + Bank
				+ "]";
	}
	
	
}
