package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * 6:14 - 6:42  = 28 minutes
 */
public class Solution {

    public int romanToInt(String s) {
            Map<String, Integer> strToNum = new HashMap();
            strToNum.put("I", 1);
            strToNum.put("V", 5);
            strToNum.put("L", 50);
            strToNum.put("X", 10);
            strToNum.put("M", 1000);
            strToNum.put("C", 100);
            strToNum.put("D", 500);
            if (s == null || s.isEmpty()) return 0;
            int sum = 0;
            char[] characters = s.toCharArray();
            boolean skip = false;
            for (int i = 0; i < characters.length; i++) {
                int j = i + 1;
                if (!skip) {
                    if (j < characters.length) {
                        String current = String.valueOf(characters[i]);
                        String next = String.valueOf(characters[j]);
                        switch (current) {
                            case "I":
                                if (next.contains("V")) {
                                    sum += 4;
                                    skip = true;
                                } else if (next.contains("X")) {
                                    sum += 9;
                                    skip = true;
                                } else {
                                    sum += 1;
                                    skip = false;
                                }
                                break;
                            case "X":
                                if (next.contains("L")) {
                                    sum += 40;
                                    skip = true;
                                } else if (next.contains("C")) {
                                    sum += 90;
                                    skip = true;
                                } else {
                                    sum += 10;
                                    skip = false;
                                }
                                break;
                            case "C":
                                if (next.contains("D")) {
                                    sum += 400;
                                    skip = true;
                                } else if (next.contains("M")) {
                                    sum += 900;
                                    skip = true;
                                } else {
                                    sum += 100;
                                    skip = false;
                                }
                                break;
                            case "V":
                                sum += 5;
                                skip = false;
                                break;
                            case "L":
                                sum += 50;
                                skip = false;
                                break;
                            case "D":
                                sum += 500;
                                skip = false;
                                break;
                            case "M":
                                sum += 1000;
                                skip = false;
                                break;
                        }
                    } else {
                        sum += strToNum.get(String.valueOf(characters[i]));
                    }
                } else {
                    skip = false;
                }
            }
            return sum;
        }
}
