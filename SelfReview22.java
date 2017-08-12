public class SelfReview22 {
	public static String travelTime(double avgSpeed, int ... legs){
		double total = 0;
		for(int leg : legs){
			total+=(leg/avgSpeed);
		}

		int hours = (int)Math.floor(total);
		double minutes = 60*(total-hours);

		return hours + " hours, " + minutes + " minutes";
	}

	public static void main(String[] args){
		System.out.println(travelTime(50, 1777));
	}
}