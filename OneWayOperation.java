package StringOperation;

public class OneWayOperation {

	static boolean oneEditCheck(String str1, String str2) {
		if(str1.length()==str2.length())
			return oneEditUpdate(str1, str2);
		else if (str1.length()-1 ==str2.length())
			return oneEditInsert(str1,str2);
		else if (str1.length() ==str2.length()-1)
			return oneEditInsert(str2, str1);
		return false;
		
	}
	
	private static boolean oneEditInsert(String str1, String str2) {
		int index1 = 0,index2=0;
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		while(index1<str1.length() && index2 < str2.length()){
			if(char1[index1]!= char2[index2]){
				if(index1!=index2){
					return false;
				}
				index1++;
			}else {
				index1++;
				index2++;
			}	
		}
		return true;
	}

	private static boolean oneEditUpdate(String str1, String str2) {
		boolean boolCheck = false;
		char[] cstr1 = str1.toCharArray();
		char[] cstr2 = str2.toCharArray();
		for(int i=0; i< str1.length();i++){
			if(cstr1[i] != cstr2[i]){
				if(boolCheck){
					return false;
				}
				boolCheck=true;
			}
		}
		return true;
	}

	public static void main(String args[]){
		
		String str1 = "abcd";
		String str2 = "bcd";
		if(oneEditCheck(str1, str2)){
			System.out.println("It's an one edit operation");
		}else{
			System.out.println("It is not an one edit operation");
		}
	}
}
