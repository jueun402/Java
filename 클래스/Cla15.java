class Book15{

	private String title;
	private String author;
	private int price;
	
	void pBook() {
		System.out.println(title+","+author+","+price);
	}
	
	void setTitle(String title) {this.title = title;}
	String getTitle() {return this.title;}
	
	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}	

	public int getPrice() {return price;}	
	public void setPrice(int price) {this.price = price;}
	
	public void setBook(String title, String author, int price) {
		this.title =title;
		this.author = author;
		this.price = price;
	}
	public void getBook() {
		System.out.println(this.title+","+ this.author+","+ this.price);
	}
	
}

public class Cla15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book15 b1 = new Book15();
		
		b1.setBook("OOP","TOM",33000);
		b1.getBook();
		
		b1.setTitle("ÀÚ¹Ù");
		System.out.println(b1.getTitle());
		b1.setAuthor("È«±æµ¿");
		b1.setPrice(30000);
		System.out.println();
	}

}
