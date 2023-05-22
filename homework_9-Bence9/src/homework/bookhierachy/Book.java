package homework.bookhierachy;

public class Book extends homework.bookhierachy.Product {
	
	private String author;
	private String title;
	private int yearOfPublication;
	private int price;
	private int pages;
	private String style;
	static int number = 0;
	
	public String toString() {
		return author + ": " + title + ", " + yearOfPublication + ". Price: " + price + " Ft" + ".Pages:" + pages + ".Style:" + style + ".Unitprice:" + getUnitPrice();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		if (yearOfPublication >= 1950 && yearOfPublication <= 2021)
			this.yearOfPublication = yearOfPublication;
		else 
			this.yearOfPublication = 2021;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 1000 )
			this.price = price;
		else
			this.price = 1000;
	}

	public Book(String author, String title, int price, int pages,String style) {
		super(title, price);
		this.style=style;
		this.author = author;
		this.title = title;
		if(price<0) {
			this.price=0;
		} else {
			this.price = price;
		}
		if(pages<0) {
			this.pages=0;
		}else {
			this.pages = pages;
		}
		number++;
		java.time.LocalDate currentDate = java.time.LocalDate.now();
		this.yearOfPublication = currentDate.getYear();
	}

	public Book(String author, String title,String style) {
		super(title,2500);
		this.style=style;
		this.author = author;
		this.title = title;
		this.price=2500;
		java.time.LocalDate currentDate = java.time.LocalDate.now();
		this.yearOfPublication = currentDate.getYear();
		this.pages=100;
	}
	
	public static int comparePublicationDate(Book first,Book second) {
		if(first.yearOfPublication>second.yearOfPublication) {
			return 1;
		}
		else if(first.yearOfPublication==second.yearOfPublication) {
			return 0;
		}
		else {
			return 2;
		}
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if(pages<0) {
			this.pages=100;
		} else {
		this.pages = pages;
		}
		
	}
	
	public static Book getLonger(Book elso,Book masodik) {
		if(elso.getPages()>masodik.getPages() ) {
			return elso;
		}else if(elso.getPages()==masodik.getPages()){
			return elso;
		} else {
			return masodik;
		}
	}
	
	public boolean hasEvenPages() {
		if(this.pages%2==0) {
			return true;
		} else {
			return false;
		}	
	}
	
	public static void listBookArray(Book[] books) {
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i]);
		}
	}
	
	public static Book getLongestEvenPagesBook(Book[] tomb) {
		Book maxBook = new Book(null, null, 0, 0, null);
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i].getPages() % 2 == 0 && tomb[i].getPages() > maxBook.getPages()) {
				maxBook = tomb[i];
			}
		}
		if (maxBook.getPages() != 0) {
			return maxBook;
		} else {
			return null;
		}
	}

	public static Book getLongestBook(Book[] tomb) {
		Book max=new Book(null,null,0,0,null);
		for(int i=0;i<tomb.length;i++) {
			if(tomb[i].getPages()> max.getPages()) {
				max = tomb[i];
			}
		}
		return max;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	@Override
	public void decreasePrice(float percentage) {
		
		if (style.equalsIgnoreCase("children")) {
			if (percentage > 0) {
				price -= Math.round(price * (float) (percentage+7) / 100);
			}
		} else if (style.equalsIgnoreCase("guide")) {
			if (percentage > 0) {
				price -= Math.round(price * (float) (percentage+5) / 100);
			}
		} else {
			if (percentage > 0) {
				price -= Math.round(price * (float) percentage / 100);
			}
		}                
	}
	
	public static int countStyles(Book[] books) {

		String[] tomb = new String[books.length];
		int db = 0;
		boolean ertek = false;
		for (int i = 0; i < books.length; i++) {
			for (int j = 0; j < books.length; j++) {
				if (books[i].style.equalsIgnoreCase(tomb[j])) {
					ertek = true;
				}
			}
			if (ertek == false) {
				db++;
				tomb[db-1] = books[i].style;
			}
			ertek = false;
		}
		return db;
	}
	
	public static void discountBooks(Book[] books, String style) {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getStyle().equalsIgnoreCase(style)) {
				books[i].decreasePrice(10);
			}
		}
	}
	
	public static int listBooksWithStyle(Book[] books, String style) {
		int db=0;
		for(int i=0;i<books.length;i++) {
			if(books[i].getStyle().equalsIgnoreCase(style)) {
				System.out.println(books[i]);
				db++;
			}
		}
		return db;
	}
	
	public static int avgPrice(Book[] books, String style) {
		int db=0;
		int atlag=0;
		for(int i=0;i<books.length;i++) {
			if(books[i].getStyle().equalsIgnoreCase(style)) {
				atlag=atlag+books[i].getPrice();
				db++;
			}
		}
		if(db==0) {
			return 0;
		}
		else {
			atlag=atlag/db;
			return atlag;
		}
		
	}

	@Override
	public int getUnitPrice() {
		return (int) Math.round((getTaxedValue() / getPages()));
	}
	
	public static String[] selectAuthors(Book[] books, int unitPrice) {
		String[] select = new String[books.length];
		int Number = 0;
		int ok2 = 0;
		for (int j = 0; j < books.length; j++) {
			if (books[j].getUnitPrice() > unitPrice) {
				for (int k = 0; k < books.length; k++) {
					if (books[j].author.equalsIgnoreCase(select[k])) {
						ok2 = 1;
					}
				}
				if (ok2 == 0) {
					select[Number] = books[j].author;
					Number++;
				}
				ok2 = 0;
			}
		}
		int size = 0;
		for (int i = 0; i < books.length; i++) {
			if (select[i] != null) {
				size++;
			}
		}
		
		String[] selectedAuthors = new String[size];
		for (int i = 0; i < size; i++) {
			selectedAuthors[i] = select[i];
		}
		return selectedAuthors;
	}
	
	public static int sumGrossPrice(Book[] books) {
		int sum = 0;
		for (int i=0;i<books.length;i++) {
			sum += books[i].getTaxedValue();
		}
		return sum+50;
	}
	
	public enum BookStyle {
		CHILDREN, GUIDE, CRIME, COOK, OTHER

	}

	protected void finalize() {
		number--;
	}

	public int compareTo(Book o) {
		return this.getTitle().compareTo(o.getTitle());
	}

	public static int getNumber() {
		return number;
	}
	
}
