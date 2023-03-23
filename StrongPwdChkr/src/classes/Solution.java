package classes;

/*
 * start time = 7:42
 * end time = 7:54
 * total time =  12 minutes
 * speed = 97.44 %
 * memory = 97.61 %
 * notes:
 * just standard stuff. some of these string methods seem to be optimized, and are the best
 * solution to certain problems
 */
public class Solution {
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
        for(int i=0;i<password.length();i++) {
            if(i>0&&password.charAt(i)==password.charAt(i-1)) {
                return false;
            }
            if(numbers.indexOf(password.charAt(i))>-1) {
                hasdigit=true;
            } else if(lcletters.indexOf(password.charAt(i))>-1) {
                haslower=true;
            } else if(ucletters.indexOf(password.charAt(i))>-1) {
                hasupper=true;
            } else if(weird.indexOf(password.charAt(i))>-1) {
                haswierd=true;
            }
        }
        return hasdigit&&haslower&&hasupper&&haswierd;
    }
}
