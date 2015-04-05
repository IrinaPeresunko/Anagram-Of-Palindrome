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
	public static void main(String[] args) {
		String input = "Doc, note: I dissent. A fast never prevents a fatness. I diet on cod.";
		int N=input.length();
		boolean isAnagramOfPalindrome=true;
		for(int i=0,j=N-1;i<N/2 && j>N/2;i++,j--){
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
		
		if(isAnagramOfPalindrome==true){
			System.out.println("String is an anagram of a palindrome.");
		}
		else{
			System.out.println("String is not an anagram of a palindrome.");
		}

	}
	
}