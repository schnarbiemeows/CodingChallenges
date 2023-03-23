package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * start time = 3:35
 * end time = 3:38
 * total time = 3 minutes
 * speed = 93.55 %
 * memory = 37.82 %
 * notes:
 *
 */
public class Solution {
    public String interpret(String command) {
        /*Map<String,String> mapper = new HashMap();
        mapper.put("G","G");
        mapper.put("()","o");
        mapper.put("(al)","al");*/
        return command.replace("()","o").replace("(al)","al");
    }
}
