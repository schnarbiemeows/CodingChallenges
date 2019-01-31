package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 937
 * Ha, forgot to sort the strings
 * Oh, wow, first submission, beat 94.81% of submissions
 */
public class Solution {

	public String[] reorderLogFiles(String[] logs) {
		if(null==logs||logs.length==0) return logs;
        List<String> numlist = new ArrayList<>();
        for(int i=0;i<logs.length;i++) {
        	char[] words = logs[i].toCharArray();
        	for(int j=0;j<words.length;j++) {
        		if(words[j]==32) {
        			if(words[j+1]>47&&words[j+1]<58) {
        				numlist.add(logs[i]);
        				break;
        			}
        		}
        	}
        }
        String[] stringstring = new String[logs.length-numlist.size()];
        int counter = 0;
        for(int i=0;i<logs.length;i++) {
        	char[] words = logs[i].toCharArray();
        	for(int j=0;j<words.length;j++) {
        		if(words[j]==32) {
        			if(words[j+1]>57) {
        				stringstring[counter]=logs[i].substring(j+1)+" "+logs[i].substring(0,j);
        				counter++;
        				break;
        			}
        		}
        	}
        }
        Arrays.sort(stringstring);
        String[] finalList = new String[logs.length];
        counter = 0;
        for(int i=0;i<stringstring.length;i++) {
        	int index = stringstring[i].lastIndexOf(" ");
        	finalList[counter++] = stringstring[i].substring(index+1)+" "+stringstring[i].substring(0,index);
        }
        for(String item : numlist) {
        	finalList[counter++] = item;
        }
        return finalList;
    }
}
