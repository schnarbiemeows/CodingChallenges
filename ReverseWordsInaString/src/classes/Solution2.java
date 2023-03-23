package classes;

/*
 * start time = 10:06
 * end time =
 * total time =  minutes
 * speed =  %
 * memory =  %
 * notes:
 * make a List<String>
 */
public class Solution2 {
    public String reverseWords(String s) {
        String reversedString = new StringBuilder(s.trim()).reverse().toString();   // reverses the order
        if(reversedString.length()==0) return "";
        if(reversedString.indexOf(" ")==-1) {
            return new StringBuilder(reversedString).reverse().toString();
        }
        // go through the reversedString from space to space and replace
        char[] chars = reversedString.toCharArray();
        int j = 0;
        for(int i=0;i<chars.length;i++) {
            if(chars[i]==' ') {
                reverse(chars,i-1,j);
                j=i+1;
            }
        }
        reverse(chars,chars.length-1,j);
        return String.valueOf(chars);
    }

    private void reverse(char[] chars, int i, int j) {
        while(j<i) {
            char temp =chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i--;
            j++;
        }
    }
}
