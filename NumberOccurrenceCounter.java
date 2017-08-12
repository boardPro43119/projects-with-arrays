import java.util.Arrays;

public class NumberOccurrenceCounter{
	public static void main(String[] args){
		int[] numOccurrences = new int[51];

		for(int i=0; i<args.length; i++){
			int currentNum = Integer.parseInt(args[i]);
			if(currentNum>=0 && currentNum<=50){
				numOccurrences[currentNum]++;
			}
		}

		for(int i=0; i<51; i++){
			if(numOccurrences[i]>0){
				System.out.println(i + ": " + numOccurrences[i]);
			}
		}
	}
}