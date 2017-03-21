package StringOperation;
/*Permutation is the arrangement of a given set of numbers or things in a certain order.
 * There can be two types of permutation based on if repetition of elements or numbers 
 *  are allowed or not. The formula for permutation of choosing and 
 * arranging non-repeating r elements from a set of n elements can be given as
 */
public class permutation {

	static boolean checkPermutation(String str1, String str2){
		if(str1.length()!= str2.length()){
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
	static String sort(String str){
		char[] stringChar = str.toCharArray();
		java.util.Arrays.sort(stringChar);
		return new String(stringChar);
	}
	
	static void printPermutation(String str1){
		int f = 0;
		int l = str1.length();
		 permuatation(str1, f, l);
	}
	
	static void permuatation(String str, int first, int last){
		if (first == last)
			System.out.println(str);
		else
		{
			for(int i=first; i<last; i++){
				str = swap(str, first,i);
				permuatation(str, first+1, last);
				str = swap(str, first,i);
				
			}
		}
		
	}
	private static String swap(String str, int first, int i) {
		char temp;
		char[] charString = str.toCharArray();
		temp = charString[first];
		charString[first] = charString[i];
		charString[i]= charString[first];
		return String.valueOf(charString);
	}
	public static void main(String args[]){
		String str1 = "abcd";
		String str2 = "dcba";
		//check permutation of two string
		boolean checkPermatation;
		checkPermatation = checkPermutation(str1, str2);
		System.out.println(checkPermatation);
		
		// print permutation of an string
		System.out.println("Permutations of string 1");
		printPermutation(str1);
		System.out.println("Permutations of string 2");
		printPermutation(str2);
	
	}
}