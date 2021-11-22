
class Wallet{
	static int money = 0;
	int mIO(int i, int o) {
		money = money+i -o;
		return money;
	}
}

public class Cla04 {

	public static void main(String[] args) {
		
		Wallet m1 = new Wallet();
		Wallet w1 = new Wallet();
		
		System.out.println(m1.mIO(10000, 6000));
		System.out.println(w1.mIO(15000, 3000));
	}

}
