package StringOperation;

public class palindrome {
	
	static boolean palindromeMethod1(String str){
		int start = 0;
		int end = str.length()-1;
		char[]  cstr = str.toCharArray();
		if(start< end){
			for(int i=0; i<= str.length()/2;i++){
				if(cstr[start]!=cstr[end]){
					return false;
				}
				start++;
				end--;
			}
		}
		return true;
	}
	static boolean palindromeMethod2(String str){
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	static boolean palindromeRecursive(String str){
		int length = str.length();
		if(length<2){
			return true;
		}
		if(str.charAt(0)!=str.charAt(length-1)){
			return false;
		}else {
			palindromeRecursive(str.substring(1, length-1));
		}
		return true;	
	}
	
	
	public static void main(String args[]){
		String palString =  "atasata";
		if(palindromeMethod1(palString)){
			System.out.println("Method1 : Given string is palindrome");
		} else {
			System.out.println("Method1 :Given string is not palindrome");
		}
		if(palindromeMethod2(palString)){
			System.out.println("Method2 : Given string is palindrome");
		} else {
			System.out.println("Method2 :Given string is not palindrome");
		}
		if(palindromeRecursive(palString)){
			System.out.println("MethodRecursive : Given string is palindrome");
		} else {
			System.out.println("MethodRecursive :Given string is not palindrome");
		}
	}

}
