import java.util.Arrays;

public class Arr16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] original = {{1,2},{3,4}}; //2차원 
		
		// 얕은 복사 
		
		int[][] clone01 = Arrays.copyOf(original, original.length);
		

		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.deepToString(original));
		
		System.out.println(Arrays.toString(clone01));
		System.out.println(Arrays.deepToString(clone01));
		
		// stack에서 주소 비교 
		System.out.println(original==clone01); 
	
		// 1차 배열에서의 내용(주소)비교 - 하위 연결 주소에 대한 비교  
 		System.out.println(Arrays.equals(original,clone01)); // 1차원 주소들에 대한 비교
 		
		// 2차 배열에서의 내용(값)비교
 		System.out.println(Arrays.deepEquals(original, clone01)); // 1, 2, 3 4 값에 대한 비교 
		
		// 깊은 복사 
		
		int[][] clone02 = new int[2][]; // Arrays.copyOf(original, original.length);

 		clone02[0] = Arrays.copyOf(original[0], original.length);
 		clone02[1] = Arrays.copyOf(original[1], original.length);
 		
 		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.deepToString(original));
		
		System.out.println(Arrays.toString(clone01));
		System.out.println(Arrays.deepToString(clone01));
 		
		System.out.println(Arrays.toString(clone02));
		System.out.println(Arrays.deepToString(clone02));
		
		
		// stack에서 주소 비교 // 값 형 (값비교), 참조형(주소 비교)
		System.out.println(original==clone01); //값형 
			
		// 1차 배열에서의 내용(주소)비교 - 하위 연결 주소에 대한 비교  // 참조형 비교 --> 2차원 array 중 1차에서의 내용 비교 (2차에 대한 주소 비교)
		System.out.println(Arrays.equals(original,clone02)); // 1차원 주소들에 대한 비교 //참조 
			 		
		// 2차 배열에서의 내용(값)비교// 참조형 -> 2차원 Array 중 2차에서의 내용(2차 안에 있는 값 비교)
		System.out.println(Arrays.deepEquals(original, clone02)); // 1, 2, 3 4 값에 대한 비교 
		
	}

}
