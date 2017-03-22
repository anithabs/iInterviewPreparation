package StringOperation;

public class stringCompression {
	private static void compressStringMethod1(String str) { // complexity  is O(n^2)
		char[] cstr = str.toCharArray();
		String res ="";
		int count=0, j;
		int len = str.length()-1;
		for(int i = 0; i< len;i++){
			count++;
			if(i+1 > len || cstr[i] != cstr[i+1]){
				res += String.valueOf(cstr[i]) + count;
				count =0;
			}
		}
		System.out.println(res);	
	}
	
	static void CompressStringMethod2(String str){
		char[] cstr = str.toCharArray();
		StringBuilder compressedString = new StringBuilder();
		int count = 0;
		for(int i = 0;i < str.length()-1;i++){
			count++;
			if((i+1 > str.length()-1) || (cstr[i] != cstr[i+1])){
				compressedString.append(String.valueOf(cstr[i]));
				compressedString.append(count);
				count = 0;
			}
		}
		System.out.println(compressedString);
	}
	public static void main(String args[]){
		String str = "abbrrrrttyyyppp";
		compressStringMethod1(str);
		CompressStringMethod2(str);
	}

	
}
