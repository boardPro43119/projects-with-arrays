public class Histogram {
	int[] values;
	int[] rangeFrequencies;

	public Histogram(int[] intValues){
		values = intValues;
		rangeFrequencies = new int[10];
	}

	public Histogram(String[] strValues){
		values = new int[strValues.length];
		for(int i=0; i<strValues.length; i++){
			values[i] = Integer.parseInt(strValues[i]);
		}
		rangeFrequencies = new int[10];
	}

	public void print(int instancesPerAsterisk){
		readValues();
		for(int i=0; i<10; i++){
			printLabel(i);
			printAsterisks(rangeFrequencies[i]/instancesPerAsterisk);
			System.out.println();
		}
	}

	public void print(){
		print(1);
	}

	private void readValues(){
		for(int i=0; i<values.length; i++){
			int currentNum = values[i];
			if(currentNum>=1 && currentNum<=100){
				rangeFrequencies[(currentNum-1)/10]++;
			}
		}
	}

	private void printLabel(int i){
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

	private void printAsterisks(int asterisks){

		// Print asterisks
		for(int j=0; j<asterisks; j++){
			System.out.print("*");
		}
	}
}