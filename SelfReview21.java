public class SelfReview21 {
	public static int distance(int ... legs){
		int total = 0;
		for(int leg : legs){
			total+=leg;
		}

		return total;
	}

	public static void main(String[] args){
		System.out.println(distance(223, 67, 23, 139));
	}
}