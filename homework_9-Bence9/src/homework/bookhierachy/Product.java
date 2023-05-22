package homework.bookhierachy;

//import homework.product.Product;
import homework.tax.Taxable;

public abstract class Product implements Taxable {
	private String name;
	private int price;
	private int afakulcs;
	private String currency = "Ft";
	
	public Product(String name, int price, int afakulcs) {
		super();
		this.name = name;
		if(price<0) {
			this.price =0;
		}else {
			this.price = price;
		}
		if(afakulcs < 0) {
			this.afakulcs = afakulcs;
		}else {
			this.afakulcs = taxPercent;
		}
		
	}

	public int getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(int taxPercent) {
		this.afakulcs = taxPercent;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		if (this.currency.equalsIgnoreCase("Euro") && currency.equalsIgnoreCase("Ft")) {
			this.currency = currency;
			this.price=this.price*300;
		}
		else if (this.currency.equalsIgnoreCase("Ft") && currency.equalsIgnoreCase("Euro")) {
			this.currency = currency;
			this.price=this.price/300;
		}
		else {
			this.currency="Ft";
		}
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		if(price<0) {
			this.price=0;
		}else {
			this.price = price;
		}
		
	}
	
	public void decreasePrice(float percentage) {
		if (percentage > 0) {
			price -= Math.round(price * (float) percentage / 100);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>=0) {
			this.price = price;
		}
		
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ",getTaxedValue:"+ getTaxedValue() + "]";
	}
	
	public void increasePrice(int percentage) {
		if (percentage > 0) {
			price += Math.round(price*(float)percentage/100);
		}	
	}

	@Override
	public void setTax(double percent) {
		if (percent <= 0) {
			this.afakulcs = taxPercent;
		}
		else {
			this.afakulcs = (int)Math.round(percent);
		}
		
	}

	@Override
	public double getTax() {
		return Math.round(getPrice() * this.afakulcs/100 ) ;
	}

	@Override
	public double getTaxedValue() {
		return this.price + getTax();
	}
	
	public static void changeCurrency(Product[] products, String targetCurrency) {
		for(int i=0;i<products.length;i++) {
			products[i].setCurrency(targetCurrency);
		}
	}
	
	public static int comparePrice(Product p1, Product p2) {
		if(p1.getPrice() > p2.getPrice()) {
			return 1;
		}
		else if(p1.getPrice() == p2.getPrice()){
			return 0;
		}
		else {
			return 2;
		}
	}
	
	public abstract int getUnitPrice();
	
}
