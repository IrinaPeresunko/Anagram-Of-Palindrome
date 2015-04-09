package anagram;

public class Anagram {

	public static boolean isAnagram(String text){
		int count=0;
		
		for(int i=0; i<text.length();i++){
			char ch = text.charAt(i);
			if(ch+ Integer.MIN_VALUE-'A'<='z'+Integer.MIN_VALUE-'A'){
				count^=1<<ch;
			}
		}
		return Integer.bitCount(count%(1<<'z')&~1)<=1;
	}
	public static void main(String[] args) {
		String[] input = new String[5];
		
		input[0] = "Doc, note: I dissent. A fast never prevents a fatness. I diet on cod.";
		input[1] = "kayak";
		input[2] = "Rats live on no evil star";
		input[3] = "A man, a plan, a canal, Panama";
		input[4]= "test";
		
		for(int i=0;i<input.length;i++){
			if(isAnagram(input[i])){
				System.out.println(input[i] + " - is an anagram of a palindrome.");
			}
			else{
				System.out.println(input[i] + " - is not an anagram of a palindrome.");
			}
			
			System.out.println("_________________________________");
		}
	}
}
