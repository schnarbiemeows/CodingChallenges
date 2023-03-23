package classes;

/**
 * beat 100% speed
 * speed = 100%
 * memory = 10.88%
 * why so low on memory?
 */
public class Solution4 {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            switch(s.charAt(i)) {
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;
                default:
                    sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
