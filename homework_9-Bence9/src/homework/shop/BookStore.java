package homework.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import homework.bookhierachy.Book;
import homework.tax.Taxable;

public class BookStore {
	ArrayList<Book> stock = new ArrayList<Book>();
	ArrayList<Taxable> staff = new ArrayList<Taxable>();
	
	
	public void addToStock(Book book) {
		stock.add(book);
	}
	
	public void addToStaff(Employee employee) {
		staff.add(employee);
	}
	
	public ArrayList<Book> getStock() {
		return stock;
	}
	
	public ArrayList<Taxable> getStaff() {
		return staff;
	}
	
	public int listStock() {
		for (int a=0; a < stock.size();a++) {
			System.out.println(stock.get(a));
		}
		return stock.size();
	}
	
	public int listStaff() {
		for (int b=0; b < staff.size();b++) {
			System.out.println(staff.get(b));
		}
		return staff.size();
	}
	
	public int sumVAT() {
		double afa = 0;
		
		for (int i=0; i < stock.size(); i++) {
			stock.get(i).setTax(5);
			afa += stock.get(i).getTax();
		}
		
		return (int)afa;
	}
	
	public int sumIncomTax() {
		double sum = 0;
				
		for (int d=0; d < staff.size();d++) {
			sum += staff.get(d).getTax();
		}
		
		return (int)sum;
	}
	
	public void sortByTitle() {
		
		Comparator<Book> comparator = new Comparator<Book>() {
			
			@Override
			public int compare(Book book1, Book book2) {
				return book1.getTitle().compareTo(book2.getTitle());
			};
			
		};
		Collections.sort(stock, comparator);
	}
	
	public void reverseSortByPrice() {
		
		Comparator<Book> comparator = new Comparator<Book>() {
			
			@Override
			public int compare(Book book1, Book book2) {
				return book2.getPrice() - book1.getPrice();
			};
			
		};
		Collections.sort(stock, comparator);
	}
}
