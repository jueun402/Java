class Ani17{
	String a = "Ani-a";
	void cry() {System.out.println("�� ��");}
	void shout() {System.out.println("�� �� �� ");}
}

class Dog17 extends Ani17{
	String a = "Dog-a";
	
	void pDog(){System.out.println(this.a);
			System.out.println(super.a);}

	// Method Override 
	void cry() {System.out.println("�� �� ");
				//super.cry();
	}
	
	@Override
	void shout() {System.out.println("�� �� �� ");}

}

public class Cla17 {

	public static void main(String[] args) {
		Dog17 d1 = new Dog17();
		//System.out.println(d1.a);

		// �θ��� �ν��Ͻ��� ������� ����. => ���е� ���·� ��������
//		d1.pDog();
		// �ڹٿ����� �������� �ڱ�� �켱������ ����. 
		d1.cry();
		d1.shout();
		

	}

}
