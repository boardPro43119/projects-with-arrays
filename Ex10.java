import java.util.Arrays;

public class Ex10 {
	public static void switchThem(int[] array1, int[] array2){
		int minLength = Math.min(array1.length, array2.length);
		int currentArray1Element = 0;
		int currentArray2Element = 0;

		for(int i=0; i<minLength; i++){
			currentArray1Element = array1[i];
			currentArray2Element = array2[i];

			array1[i] = currentArray2Element;
			array2[i] = currentArray1Element;
		}
	}

	public static void main(String[] args){
		int[] array1 = {1, 2, 3, 4, 5, 6, 7};
		int[] array2 = {5, 4, 3, 2, 1};

		System.out.println("Before switch: ");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		switchThem(array1, array2);

		System.out.println("After switch: ");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}
}