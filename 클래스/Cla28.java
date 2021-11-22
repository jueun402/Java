interface iAni28 {
	// full name
	public abstract void Cry();  //<--- public abstract 은닉
}

class Dog28 implements iAni28 {
	@Override
	public void Cry() {System.out.println("멍 멍");} }

class Cat28 implements iAni28 {
	@Override
	public void Cry() {System.out.println("야 옹");} }

class Duck28 implements iAni28 {
	@Override
	public void Cry() {System.out.println("꽥 꽥");} }

public class Cla28 {

	public static void main(String[] args) {

//		Dog28 d1 = new Dog28(); d1.Cry();
//		iAni28 d2 = new Dog28(); d2.Cry();
		
		iAni28[] Anis = {new Dog28(), new Cat28(), new Duck28()};
		
		for(iAni28 ani : Anis) {ani.Cry();}	
	}
}
