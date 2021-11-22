
class Calc05{
	
	// 오버로딩 
	static int sum(int a,int b) {
		return a+b;
	}
	static int sum(int a,int b, int c) {
		return a+b+c;
	}
	static int sum(int a,int b,int c, int d) {
		return a+b+c+d;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static String sum(String a,String b) {
		return a+b;
	}
}


public class Cla05 {

	public static void main(String[] args) {

		System.out.println(Calc05.sum(20,10)); //30
		System.out.println(Calc05.sub(20,10)); //10
		System.out.println(Calc05.sum(20,10,5)); //35
		System.out.println(Calc05.sum(20,10,5,3)); //38
		System.out.println(Calc05.sum("대한","민국")); //대한민국


		
	}

}
