class Book07 {
	String title;  
	String author; 
	int price; 

	void pBook(){
		System.out.println(title + "," + author+","+price);
	}
	Book07(String title, String author, int price){
		// 자기주소는 this 
		// 부모의 주소는 super
		
		this.title = title; this.author = author; this.price = price;
	}
}
public class Cla07 {

	public static void main(String[] args) {
		Book07 b1 = new Book07("Java","Jane",30000);
		b1.pBook();
		
		Book07 b2 = new Book07("OOP","Tom",30000);
		b2.pBook();

	}

}
