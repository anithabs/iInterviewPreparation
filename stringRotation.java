package StringOperation;

public class stringRotation {
	
	 static boolean stringRotationCheck(String str1, String str2) {
		 
		if(str1.length() ==str2.length() && str1.length() >0){
			String str = str1 +str1;
			return isSubstring(str, str2);
		}
		return false; 
	}
	 
	 public static boolean isSubstring(String str, String target )
	 {   
	     if (target.length() == 0){
	         return false;
	     } if (str.equals(target)){
	         return true;

	     } else   {  
	         int i = str.indexOf(target); 
	         if(i != -1) {
	        	 return true;
	         } else {
	        	 return false;
	         }
	         
	     }
	 }
	public static void main(String args[]) {
		String str1 = "mango";
		String str2 = "goman";
		if(stringRotationCheck(str1, str2)){
			System.out.println("Provided strings have been rotated");
		} else {
			System.out.println("Provided strings are not rotated");
		}
	}

	

}
