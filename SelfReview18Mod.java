public class SelfReview18Mod{

	public static void main(String[] args){
		int sum = 0;

		for(String str : args){
			sum+=str.length();
		}

		System.out.println(sum);
	}

}