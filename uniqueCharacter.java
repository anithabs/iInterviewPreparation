package StringOperation;

public class uniqueCharacter {
	static boolean uniqueCharacter(String str) {
		if(str.length() > 128) return false;
		boolean[] char_set = new boolean[128];
		
		for(int i=0 ; i< str.length();i++){
			int val = str.charAt(i);
			if(char_set[val]== true){
				return false;
			}
			char_set[val] = true;
		}
		return true;		
	}
	public static void main(String args[]){
		String str = "abclkASDKGRJI456789";
		boolean result;
		result = uniqueCharacter(str);
		System.out.println(result);
	}

}
