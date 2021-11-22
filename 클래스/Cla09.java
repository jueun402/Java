class Book09 {
	
	String title;  
	String author; 
	int price; 

	void pBook(){
		System.out.println(title + "," + author+","+price);
	}
	
	Book09(String t, String a, int p){ title = t; author = a; price = p;}	
	Book09(String t, String a ){this(t,a,40000);}
	Book09(String t ){this(t,"Jane",40000);}
	Book09(){this("OOP");}


}
public class Cla09 {

	public static void main(String[] args) {
		
		// 여러개의 생성자 
		Book09 b1 = new Book09();
		Book09 b2 = new Book09("Java");
		Book09 b3 = new Book09("Java","Tom");
		Book09 b4 = new Book09("Java","Tom",3000);
		
		b1.pBook();
		b2.pBook();
		b3.pBook();
		b4.pBook();
		
		
	}

}
