package classes;

/*
 * start time = 
 * end time = 
 * total time =  
 * speed = 70.99 %
 * memory = 32.59 %
 * notes:
 * trying to see if char array is faster
 * NO, it is not, AND uses a lot more memory
 */
public class Solution2 {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        String lcletters = "abcdefghijklmnopqrstuvwxyz";
        String ucletters = lcletters.toUpperCase();
        String numbers = "1234567890";
        String weird = "!@#$%^&*()-+";
        boolean hasupper = false;
        boolean haslower = false;
        boolean hasdigit = false;
        boolean haswierd = false;
        char[] chars = password.toCharArray();
        for(int i=0;i<password.length();i++) {
            if(i>0&&chars[i]==chars[i-1]) {
                return false;
            }
            if(numbers.indexOf(chars[i])>-1) {
                hasdigit=true;
            } else if(lcletters.indexOf(chars[i])>-1) {
                haslower=true;
            } else if(ucletters.indexOf(chars[i])>-1) {
                hasupper=true;
            } else if(weird.indexOf(chars[i])>-1) {
                haswierd=true;
            }
        }
        return hasdigit&&haslower&&hasupper&&haswierd;
    }
}
