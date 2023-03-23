package main;

import java.util.HashMap;
import java.util.Map;

/**
 * 3:49 - 3:57
 * 3:59
 * we need to count the #
 * could be no non-repreating
 */
public class Main {

    public static void main(String[] args) {
        String in = "asdfghsdfga";
        System.out.println("in the word : " + in + " , the first char = " + findFirst(in));
        in = null;
        System.out.println("in the word : " + in + " , the first char = " + findFirst(in));
        in = "x";
        System.out.println("in the word : " + in + " , the first char = " + findFirst(in));
        in = "xxxxx";
        System.out.println("in the word : " + in + " , the first char = " + findFirst(in));
        in = "aabbcdeefgghhhi";
        System.out.println("in the word : " + in + " , the first char = " + findFirst(in));
    }

    public static String findFirst(String in) {
        if(in==null)  return "no non-repeatable characters";
        if(in.length()==1) return in;
        Map<Character, Integer> done = new HashMap();
        char[] chars = in.toLowerCase().toCharArray();
        for(int i=0; i<chars.length;i++) {
            if(done.get(chars[i])==null) {
                done.put(chars[i],1);
            } else {
                done.put(chars[i],done.get(chars[i])+1);
            }
        }
        for(int i=0; i<chars.length;i++) {
            if(done.get(chars[i])==1) return chars[i]+"";
        }
        return "no non-repeatable characters";
    }
}
