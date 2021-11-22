class Ani18{
	String name;
	
	Ani18(){System.out.println("--Ani18() 실행--");}
	Ani18(String name){ this.name = name;
	System.out.println("--Ani18(name) 실행--");}
}

class Dog18 extends Ani18{
	Dog18(){super(); System.out.println("--Dog18()실행--");}

	Dog18(String name){//super(name);
	System.out.println("--Dog18(name)실행--");}
}


public class Cla18 {

	public static void main(String[] args) {

		Dog18 d1 = new Dog18();
		Dog18 d2 = new Dog18("해 피");

		System.out.println(d2.name); //  해 피 
	}

}
