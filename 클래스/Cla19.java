/**************************
[final �ʵ�� ���] # ȥ���� p. 281

final => ���εǴ�

final ���� => ��� 
final �޼ҵ� => �������̵� �Ұ� 
final Ŭ���� => ��� �Ұ� 
***************************/

class A19{

	final int a1 = 2021; // �ڵ�� ���� �ޱ� 
	final int a2;  	// �����ڸ� ���� ���� �ޱ� 
	
	A19(int a2){this.a2 = a2;}
	
	static final int b1 = 7777; // Java������ ���� 
	
	
	// final �޼ҵ� => �������̵� �Ұ� 
	final void Hi() { System.out.println("�ȳ�^^");}
	void Bye() { System.out.println("�߰� TT");}
}

class B19 extends A19{
	B19(int a2){super(a2);	}
	
//	void Hi() { System.out.println("�ȳ�^^");}
	void Bye() { System.out.println("�߰����� TT");}
}

class C19 extends B19{
	C19(int a2){super(a2);	}
	
//	void Hi() { System.out.println("�ȳ�^^");}
	void Bye() { System.out.println("�߰����� TT");}
}

public class Cla19 {

	public static void main(String[] args) {

		A19 aa1 = new A19(1000); 
//		aa1.a1 = 4000; aa1.a2 = 5000; // error
		A19 aa2 = new A19(3000);
	}
}
