import java.util.Arrays;

public class Arr13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] oldIntArray = {1,2,3}; 

		// int[] newIntArray = oldIntArray;
		
		int[] newIntArray = new int[5]; 
		
		// System.out.println(newIntArray[2]);
		
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int j : newIntArray) {
			System.out.print(j+" ");
		}

		int[] iArr1 = {10, 20, 30};
		int[] iArr2 = Arrays.copyOf(iArr1, iArr1.length);
		System.out.println(iArr1 == iArr2); // == 주소비교 / false, 주소가 다르다 : 값만 이전한 경우임.
		System.out.println(iArr1.equals(iArr2)); // false : 내용은 같지만 서로 다른 개체로 있음 
		// equals와 ==는 같음 
		
		
		System.out.println(iArr1[1] + "," + iArr2[1]);
		
		int[] iArr3 = new int[5];
		System.arraycopy(iArr1,0, iArr3, 0, iArr1.length); // 값 형 array 복사 
		
		
		for(int j : iArr3) {
			System.out.print(j+" ");
		}
		
		
		
		
		
		
		
	}

}
