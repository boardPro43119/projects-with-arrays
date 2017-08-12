import java.util.Arrays;

public class Ex6{

	public static void main(String[] args){
		final int INITIAL = 36;

		int[] nums = new int[10];

		for(int i=0; i<nums.length; i++){
			nums[i] = INITIAL;
		}

		System.out.println(Arrays.toString(nums));
	}

}