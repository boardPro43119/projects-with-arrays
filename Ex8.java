import java.util.Arrays;

public class Ex8 {
	public static void main(String[] args){
		boolean[] flags = new boolean[10];
		boolean nextElement = true;

		for(int i=0; i<flags.length; i++){
			flags[i] = nextElement;
			nextElement^= true;
		}

		System.out.println(Arrays.toString(flags));
	}
}