public class MeanandDeviation{
	public static void main(String[] args){
		int inputs = 0;

		double sum = 0;
		double varianceSum = 0;
		double mean = 0;
		double sd = 0;

		if(args.length>50)
			inputs = 50;
		else
			inputs = args.length;

		for(int i=0; i<inputs; i++){
			sum+=Double.parseDouble(args[i]);
		}

		mean = sum/inputs;

		for(int i=0; i<inputs; i++){
			varianceSum+=Math.pow((Double.parseDouble(args[i])-mean), 2);
		}

		sd = Math.sqrt(varianceSum/inputs);

		System.out.println("Mean = " + mean);
		System.out.println("Standard deviation = " + sd);
	}
}