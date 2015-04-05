package anagramOfPalindrome;

public class AnagramOfPalindrome {

	public static boolean testingForEquality(char firstLetter, char secondLetter) {
		if(firstLetter==secondLetter){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean checkingForPunctuationAndSpaces(char test){
		if(test==' ' || test==',' || test=='.' || test=='!' || test=='?' || test==':' || test==';'){
			return true;
		}
		else{
			return false;		
		}
	}
	public static boolean checkingForAnagramOfPalindrome(String input){
		int N=input.length();
		boolean isAnagramOfPalindrome=true;
		
		for(int i=0,j=N-1;i<N/2 && j>N/2-1;i++,j--){
			if(checkingForPunctuationAndSpaces(input.toLowerCase().charAt(i))){
				while(checkingForPunctuationAndSpaces(input.toLowerCase().charAt(i)) && i<N/2){
					i++;
				}
			}
			if(checkingForPunctuationAndSpaces(input.toLowerCase().charAt(j))){
				while(checkingForPunctuationAndSpaces(input.toLowerCase().charAt(j)) && j>N/2){
					j--;
				}
			}
			if(!testingForEquality(input.toLowerCase().charAt(i),input.toLowerCase().charAt(j))){
				isAnagramOfPalindrome=false;
				break;
			}
		}
		return isAnagramOfPalindrome;
	}
	public static void main(String[] args) {
		String[] input = new String[5];
		
		input[0] = "Doc, note: I dissent. A fast never prevents a fatness. I diet on cod.";
		input[1] = "kayak";
		input[2] = "Rats live on no evil star";
		input[3] = "A man, a plan, a canal, Panama";
		input[4]= "test";
		
		for(int i=0;i<input.length;i++){
			if(checkingForAnagramOfPalindrome(input[i])){
				System.out.println(input[i] + " - is an anagram of a palindrome.");
			}
			else{
				System.out.println(input[i] + " - is not an anagram of a palindrome.");
			}
			
			System.out.println("_________________________________");
		}
	}
	
}