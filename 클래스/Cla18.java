class Ani18{
	String name;
	
	Ani18(){System.out.println("--Ani18() ����--");}
	Ani18(String name){ this.name = name;
	System.out.println("--Ani18(name) ����--");}
}

class Dog18 extends Ani18{
	Dog18(){super(); System.out.println("--Dog18()����--");}

	Dog18(String name){//super(name);
	System.out.println("--Dog18(name)����--");}
}


public class Cla18 {

	public static void main(String[] args) {

		Dog18 d1 = new Dog18();
		Dog18 d2 = new Dog18("�� ��");

		System.out.println(d2.name); //  �� �� 
	}

}
