public class Ex9 {
	public static double sumArray(double[] array){
		double sum = 0;

		for(int i=0; i<array.length; i++){
			sum+=array[i];
		}

		return sum;
	}

	public static void main(String[] args){
		double[] nums = {2.64, 6, 3.643, -6.3, 37.33};

		System.out.println(sumArray(nums));
	}
} // 43.313