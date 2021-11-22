
public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//		java Arr05 100 200 300 400 
		//		출력 예) 합계 => 1000
		int ans = 0;
		for (int i =0; i<args.length; i++) {
			ans += Integer.parseInt(args[i]);
		}
		System.out.println(ans);
		
		System.out.println("==실행 완료==");
		
		
	}

}
