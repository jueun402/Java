class Ani16{
	String name = "�̸�";
	void cry() {
		System.out.println("����");
	}
	Ani16(){
		System.out.println("--Ani16()����--");
	}
}

class Dog16 extends Ani16{
	//String name = "�̸�";
	Dog16(){
		super();
		System.out.println("--Dog16()����--");
	}
}

class Cat16 extends Ani16{
	//String name = "�̸�";
	Cat16(){
		super();
		System.out.println("--Cat16()����--");
	}
}

public class Cla16 {

	public static void main(String[] args) {
	
		Dog16 d1 = new Dog16(); 
		d1.name = "�� ��";
		Cat16 c1 = new Cat16();
		c1.name = "�� ġ";

	}

}
