package homework.shop;

import homework.tax.Taxable;

public class Employee implements Taxable {

	private String name;
	private int salary;
	private int SZJA = 15;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", SZJA=" +  salary * SZJA + "]";
	}


	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getSZJA() {
		return SZJA;
	}

	@Override
	public void setTax(double percent) {
		this.SZJA = (int)percent;

	}

	@Override
	public double getTax() {
		
		return salary * SZJA / 100;
	}

	@Override
	public double getTaxedValue() {
		
		return salary - salary * SZJA / 100;
	}

}