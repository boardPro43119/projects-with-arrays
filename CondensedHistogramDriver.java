import java.util.Arrays;

public class CondensedHistogramDriver{
	public static void main(String[] args){
		// Array to keep track of how many numbers
		// in each range of 10 from 1-100 are entered
		int[] rangeFrequencies = new int[10];

		// Iterate over arguments, configure array
		for(int i=0; i<args.length; i++){
			int currentNum = Integer.parseInt(args[i]);
			if(currentNum>=1 && currentNum<=100){
				rangeFrequencies[(currentNum-1)/10]++;
			}
		}

		// Print histogram
		for(int i=0; i<10; i++){
			printLabel(i);
			printAsterisks(rangeFrequencies[i]);
			System.out.println();
		}

	}

	public static void printLabel(int i){
		int spaces;

		int lowBound = (10*i)+1;
		int highBound = (10*i)+10;

		// Determine how many spaces need to be printed before the column separator
		// Make each row in left column 7 characters long
		if(i==0){
			spaces = 3; // i=1 --> range 1-10 (4 normal characters + 3 spaces = 7 characters)
		}
		else if(i==9){
			spaces = 1; // i=10 --> range 91-100 (6 normal characters + 1 space = 7 characters)
		}
		else {
			spaces = 2; // all other i-values: range boundaries are 2-digit numbers (5 normal characters + 2 spaces = 7 characters)
		}

		// Add spaces
		System.out.print(lowBound + "-" + highBound);
		for(int j=0; j<spaces; j++){
			System.out.print(" ");
		}

		System.out.print("|"); // Add column separator
	}

	public static void printAsterisks(int occurrences){

		// Print asterisks
		for(int j=0; j<occurrences/5; j++){
			System.out.print("*");
		}

	}
}