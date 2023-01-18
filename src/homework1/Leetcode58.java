package homework1;

public class Leetcode58 {

	public static void main(String[] args) {
		System.out.println("Test Case 1: " + lengthOfLastWord("Hello World"));
		System.out.println("Test Case 2: " + lengthOfLastWord("   fly me   to   the moon  "));
		System.out.println("Test Case 3: " + lengthOfLastWord("luffy is still joyboy"));
	}
	
	public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        
        return words[words.length-1].length();
    }
}
