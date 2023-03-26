package classes;

/*
 * start time = 2:55
 * end time = 3:09
 * total time = 14 minutes
 * speed = 52.78 %
 * memory = 20.47 %
 * notes:
 * pfft, stupid problem, solution in OrderedStream
 * you have to watch the little video in the description to really understand what it is asking for
 * this solution below beat 100% but is essentially the same as mine!
 */
public class Solution {
    /*
    class OrderedStream {

    private String[] values;
    private int ptr;

    public OrderedStream(int n) {
        values = new String[n];
        ptr = 0;
    }

    public List<String> insert(int id, String value) {
        values[id - 1] = value;
        List<String> result = new ArrayList();
        while (ptr < values.length && values[ptr] != null) {
            result.add(values[ptr++]);
        }
        return result;
    }
}
     */
}
