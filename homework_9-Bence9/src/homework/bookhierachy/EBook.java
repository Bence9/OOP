package homework.bookhierachy;

public class EBook extends Book {
	private String url;

	public EBook(String author, String title, int pages, int price, String style, String url) {
		super(author, title, pages, price, style);
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "EBook [url=" + url + "]";
	}



	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}