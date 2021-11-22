
public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] iArr1 = {10, 20, 30, 40,};
		
//		시작점 = int i = 0
//		끝점 = i < iArr1.length
//		스텝 = i++ 
//		처리 = 출력 
		
		int ans = 0;
		
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println(iArr1[i]);
			ans +=iArr1[i];
		}
		
		System.out.println(ans);
	}
	

}
