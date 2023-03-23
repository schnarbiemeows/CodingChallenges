package classes;

/**
 * this is the wrong solution because of the input constraint:
 * 1 <= a.length, b.length <= 10^4
 */
public class WrongSolution {
    public String addBinary(String a, String b) {
        int aval = Integer.parseInt(a,2);
        int bval = Integer.parseInt(b,2);
        int cval = aval + bval;
        return Integer.toBinaryString(cval);
    }
}
