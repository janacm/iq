package dataStructures;

import java.util.List;

public class JTrie {
	char c;
	boolean word; // is true if the a road map to the char is a valid word
	JTrie[] children;

	public JTrie() {
		this.c = 0; //character
		this.children = new JTrie[26];
		this.word = false;
	}

	public void add(String s) {
		// base case
		if (s.isEmpty()) {

			// we must be at a word if we get to the end of a path
			this.word = true;
			return;
		}

		char letter = s.charAt(0);

		// 'a' has value of 97. b=98, so 98-97 = 1 (2nd pos in array)
		int index = letter - 'a';

		if (this.children[index] == null) {
			this.children[index] = new JTrie();
			this.children[index].c = letter;
		}

		// substrings recursively until we have an empty list
		this.children[index].add(s.substring(1));

	}
	
	public boolean isWord(String s){
		if (s.isEmpty()){
			return this.word;
		}
		
		int index = s.charAt(0) -'a';
		
		if (this.children[index] == null){
			return false;
		}
		
		return this.children[index].isWord(s.substring(1));
	}
	
	/*
	 * Returns a list of all words in this trie
	 */
//	public List<String> words(){
	public String words(){
		String words;
		return words = null;
	}
	
	
	


}
