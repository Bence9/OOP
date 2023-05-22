package homework.tax;

public interface Taxable {
	final int taxPercent=27;
	
	public void setTax(double taxPercent);
	public double getTax();
	public double getTaxedValue();
}
