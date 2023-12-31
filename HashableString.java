import java.util.function.Function;

public class HashableString implements Hashable {
    private String s;
    public HashableString(String s) { this.s = s; }

    @Override
    public int key() {
        int h = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            h = 31 * h + aChar;
        }
        return h;
    }

    public String toString(){
        return s;
    }


}

