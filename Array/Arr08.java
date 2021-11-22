
public class Arr08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] iArr1 = {{10, 20, 30, 40}, 
						{50, 60}, 
						{70, 80, 90}};
		
		System.out.println(iArr1[0][3]);
		System.out.println(iArr1[1][0]);
		System.out.println(iArr1[2][2]);
		
		System.out.println(iArr1.length);
		System.out.println(iArr1[0].length);
		System.out.println(iArr1[1].length);
		System.out.println(iArr1[2].length);
		
		// iArr1 을 행렬 구조에 맞춰서 출력 
		for(int i = 0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++) {
				System.out.print(iArr1[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
