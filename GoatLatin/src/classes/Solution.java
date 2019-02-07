package classes;

/*
 * Woot, coded almost without a flaw on text, and first submission, no errors, beat 98.04%!
 */
public class Solution {
	public String toGoatLatin(String S) {
	       String[] words = S.split(" ");
	       String newSentence = "";
	       for(int i=0;i<words.length;i++) {
	       		char[] word = words[i].toCharArray();
	       		char[] newword = new char[word.length+3+i];
	       		switch(word[0]) {
	       			case('a'): vowel(word,newword);
	       						break;
	       			case('e'): vowel(word,newword);
	       						break;
	       			case('i'): vowel(word,newword);
	       						break;
	       			case('o'): vowel(word,newword);
	       						break;
	       			case('u'): vowel(word,newword);
	       						break;
	       			case('A'): vowel(word,newword);
	       						break;
	       			case('E'): vowel(word,newword);
	       						break;
	       			case('I'): vowel(word,newword);
	       						break;
	       			case('O'): vowel(word,newword);
	       						break;
	       			case('U'): vowel(word,newword);
	       						break;
	       			default: consonant(word,newword);
	       						break;
	       		}
	       		newSentence+=String.valueOf(newword)+" ";
	       } 
	       return newSentence.substring(0,newSentence.length()-1);
	 	}
	       public void vowel(char[] word, char[] newword) {
	       		for(int i=0;i<word.length;i++) {
	       			newword[i]=word[i];
	       		}
	       		newword[word.length]='m';
	       		newword[word.length+1]='a';
	       		for(int j=word.length+2;j<newword.length;j++) {
	       			newword[j]='a';
	       		}
	       }
	       public void consonant(char[] word, char[] newword) {
	       		for(int i=1;i<word.length;i++) {
	       			newword[i-1]=word[i];
	       		}
	       		newword[word.length-1]=word[0];
	       		newword[word.length]='m';
	       		newword[word.length+1]='a';
	       		for(int j=word.length+2;j<newword.length;j++) {
	       			newword[j]='a';
	       		}
	       }
}
