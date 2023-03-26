package classes;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {

    String[] list;
    int ptr=1;

    public OrderedStream(int n) {
        list = new String[n+1];
    }

    public List<String> insert(int idKey, String value) {
        list[idKey]=value;
        List<String> values = new ArrayList();
        while(ptr<list.length&&list[ptr]!=null) {
            values.add(list[ptr++]);
        }
        return values;
    }
}
