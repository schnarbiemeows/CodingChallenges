package classes;

/**
 * wow even worse!
 * speed = 18.69
 * memory = 18.55%
 */
public class Solution2 {

    public String removeVowels(String s) {
        return s.replaceAll("a","")
                .replaceAll("e","")
                .replaceAll("i","")
                .replaceAll("o","")
                .replaceAll("u","");
    }
}
