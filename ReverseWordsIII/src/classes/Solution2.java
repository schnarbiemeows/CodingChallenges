package classes;

/*
 * arg, even worse!, only beat 11.96%
 */
public class Solution2 {

	public String reverseWords(String s) {
		if(s==null) return null;
		String[] words = s.split(" ");
        String answer = "";
        for(String word : words) {
        	char[] chars = word.toCharArray();
        	for(int i=0;i<chars.length/2;i++) {
        		char temp = chars[i];
        		chars[i]=chars[chars.length-1-i];
        		chars[chars.length-1-i]=temp;
        	}
        	String item = "";
        	for(int k=0;k<chars.length;k++) {
        		item+=chars[k];
        	}
        	answer+=item+" ";
        }
        return answer.substring(0,answer.length()-1);
    }
}
