package day21;

public class Book {
	private int id;
	private String title;
	private Double price;
	private int copies;
	
	
	
    public Book() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", copies=" + copies + "]";
	}
	public Book(int id, String title, Double price, int copies) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.copies = copies;
	}
	
	
	


}
