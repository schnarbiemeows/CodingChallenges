package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * passed, had a little problem with the formatting of the output, because I didn't look closely
 * at the problem's output(lines 43-44), but otherwise, works, no comparison tho
 */
public class Solution {

	public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> domains = new HashMap<String,Integer>();
        for(int i=0;i<cpdomains.length;i++) {
        	Integer count = new Integer(cpdomains[i].split(" ")[0]);
        	String domain = cpdomains[i].split(" ")[1];
        	if(null!=domains.get(domain)) {
        		int current = domains.get(domain);
        		current+=count.intValue();
        		domains.put(domain,current);
        	} else {
        		domains.put(domain,count);
        	}
        	while(domain.indexOf(".")!=-1) {
        		domain = domain.substring(domain.indexOf(".")+1);
        		if(null!=domains.get(domain)) {
	        		int current = domains.get(domain);
	        		current+=count.intValue();
	        		domains.put(domain,current);
	        	} else {
	        		domains.put(domain,count);
	        	}
        	}
        }
        List<String> answer = new ArrayList<String>();
        Set keys = domains.keySet();
        Iterator<String> keyIter = keys.iterator();
        while(keyIter.hasNext()) {
        	String key = keyIter.next();
        	answer.add(key + " " + domains.get(key).toString());
        }
        return answer;
    }
}
