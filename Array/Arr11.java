
public class Arr11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] sArr1 = {{"사과","배","포도"},
							{"파인애플"},
							{"감","바나나"}};
		
		// sArr1을 행렬 구조 그대로 출력 
		for(int i = 0; i < sArr1.length; i++) {
			for(int j = 0; j < sArr1[i].length;j++) {
				System.out.print(sArr1[i][j]+" ");
			}
		}
		
		// sArr1과 똑같은 sArr2를 제작 
		

		String[][] sArr2 = new String[3][];
		sArr2[0] = new String[] {"사과","배","포도"};
		sArr2[1] = new String[] {"파인애플"};
		sArr2[2] = new String[] {"감","바나나"};

		for(int i = 0; i < sArr2.length; i++) {
			for(int j = 0; j < sArr2[i].length;j++) {
				System.out.print(sArr2[i][j]+" ");
			}
		}
	}

}
