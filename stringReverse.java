package StringOperation;

import javax.swing.plaf.synth.SynthStyleFactory;

public class stringReverse {

	public static void main(String args[]) {
		
		String input = "I want to acheieve";
		/* 1. Use string and reverse*/
		/*String result = "";
		for (int i=input.length()-1 ; i>=0;i--) {
			result = result + input.charAt(i);	
		}
		System.out.println(result);*/
		
		/* use character reverse */
		char[] in = input.toCharArray();
		int end = in.length-1;
		int start =0;
		char temp;
		while(end>start){
			temp = in[start];
			in[start] = in[end];
			in[end]=temp;
			end--;
			start++;
		}
		System.out.println(new String(in));
	}



}
