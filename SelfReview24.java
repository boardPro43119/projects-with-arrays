public class SelfReview24 {
	public static void main(String[] args){
		int[][] scores = {
							{87, 84, 93, 86},
							{78, 94, 80},
							{75, 98, 88}
						};
		int highScore = 0;
		int lowScore = 100;


		for(int[] student : scores){
			for(int score : student){
				System.out.print(score + " ");
				if(score>highScore){
					highScore = score;
				}
				if(score<lowScore){
					lowScore = score;
				}
			}
		}

		System.out.println("High score: " + highScore);
		System.out.println("Low score: " + lowScore);
		System.out.println("Range: " + (highScore-lowScore));
	}
}