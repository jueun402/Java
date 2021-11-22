/*
 * page 352.
 */

class Ani24{void Cry() {System.out.println("으 앙");}}

class Dog24 extends Ani24 {void Cry() {System.out.println("멍 멍");}} // 오버라이딩 : 부모가 정해놓은 함수의 이름 동일하게 지정해야함 

class Cat24 extends Ani24 {void Cry() {System.out.println("야 옹");}} // 오버라이딩

class Duck24 extends Ani24 {void Cry() {System.out.println("꽥 꽥");}} // 오버라이딩

public class Cla24 {

	public static void main(String[] args) {
		
		// 1. Cry를 출력하는 방법 
		// 		조건1) 동일한 부모한테 상속받는다
		// 		조건2) 동일한 이름의 함수가 있다.
		Ani24[] Anis = {new Dog24(), new Cat24(), new Duck24()};
		for(Ani24 Ani : Anis) {Ani.Cry();}
		
		Ani24 ani1 = new Ani24();
		Dog24 dog1 = new Dog24();
		// 변환 가능성 확인
		// dog24를 ani1으로 바꿔 쓸 수 있나 물어보는 것 
		//				Instance 공간 <-- Stack 시선으로 바라봐도 되나 
		System.out.println(ani1 instanceof Dog24); //false 
		System.out.println(dog1 instanceof Ani24);  // true
		
		// 2. Cry를 출력하는 방법 
//		Dog24 Dog = new Dog24(); Dog.Cry();
//		Cat24 Cat = new Cat24(); Cat.Cry();
//		Duck24 Duck = new Duck24(); Duck.Cry();
		
		// 3. Cry를 출력하는 방법 
//		Ani24 dog = new Dog24(); dog.Cry();
//		Ani24 cat = new Cat24(); cat.Cry();
//		Ani24 duck = new Duck24(); duck.Cry();
		
		////////////////////////////////////////////////////////
		
		// 수치형 데이터 but size가 다름 
		short a1 = 10; int a2 = 20; short a3 = 30; int a4 = 40;
		
		// 배열화 시킬 때 큰 size로 해야함(short x int형으로 o)
		int[] iArr  = new int[4];
		
		iArr[0] = a1; iArr[1] = a2; iArr[2] = a3; iArr[3] = a4;
		
		for(int i : iArr) {System.out.println(i);}
	}

}
