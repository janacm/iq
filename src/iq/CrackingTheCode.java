package iq;

public class CrackingTheCode {
	public static void main (String [] args){
		String s = "jannnpaj";
//		System.out.println(allCharsUnique(s));
//		System.out.println(reverseString(s));
		System.out.println(isPalindrome((s)));
	}
	
	/*
	 * Is palindrome
	 * opt1 - reverse the string and see if equal
	 * opt2 - just have pointers at both ends 
	 * a b b c, i = 0, j =3
	 * a b b c, i = 1, j =2
	 * 
	 */
	public static boolean isPalindrome(String s){
		boolean isPalindrome = true;
		int i =0;
		int j =s.length() -1;
		
		while (i < j ){
			if (s.charAt(i) != s.charAt(j)){
				return isPalindrome = false;
			}
			i++;
			j--;
		}
		return isPalindrome;
		
	}
	/*
	 * Reverse in place. 
	 * 1 Pointers start traversing from at both ends.
	 * 2 Swap vars (store in a temp var)
	 * 3 stop when i>= j 
	 * a b c d  i=0, j=3
	 * d b c a  i=1, j=2 
	 * d c b a  i=2, j=1 STOP 
	 */
	public static String reverseString(String s){
		String reversed = "";
		int j=s.length()-1;
		int i=0;
		char [] asChars = s.toCharArray();
		char temp; 
		while (i < j){
			temp = asChars[i];
			asChars[i] = asChars[j];
			asChars[j] = temp;
			i++;
			j--;
		}
		reversed = String.copyValueOf(asChars);
		
		return reversed;
	}

	/*
	 * Option 1:
	 * compare each letter with each letter until match is found: n^2 
	 * 
	 * opt 2:
	 * convert to codepoints, 1 2 1 3 3 4
	 */
	public static boolean allCharsUnique(String s){
		boolean isUnique = true;;
		
		for (int i =0; i<s.length(); i++){
			for (int j=1; j<s.length()-1; j++){
				if (s.charAt(i) == (s.charAt(j))){
					isUnique = false;
					break;
				}
			}
		}
		return isUnique;
	}
}
