class author32{ 
	String name = "홍길동";
	String school = "대졸";
	String gender = "남";
	int age = 30;
}

class Book32{
	String title = "자바";
	int price = 34000;
	author32 author = new author32();	
}

public class Cla32 {

	public static void main(String[] args) {

		Book32 b1 = new Book32();
		System.out.println(b1.title);
		
		System.out.println(b1.author.name);
		System.out.println(b1.author.school);
		System.out.println(b1.author.gender);
		System.out.println(b1.author.age);
		
		System.out.println(b1.price);
	}
}
