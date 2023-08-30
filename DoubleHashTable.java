import java.security.KeyPair;
import java.util.function.Function;
public class DoubleHashTable<V extends Hashable> implements OpenAddressTable<V>{

    private int tableSize;
    private Function<Integer,Integer> h1;
    private Function<Integer,Integer> h2;
    private int n;
    private Object[] table;
    private boolean[] deletedIndex;


    public int getTableSize() {
        return tableSize;
    }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
    }

    public Function<Integer, Integer> getH1() {
        return h1;
    }

    public void setH1(Function<Integer, Integer> h1) {
        this.h1 = h1;
    }

    public Function<Integer, Integer> getH2() {
        return h2;
    }

    public void setH2(Function<Integer, Integer> h2) {
        this.h2 = h2;
    }


    public DoubleHashTable(int tableSize, Function<Integer,Integer> h1, Function<Integer,Integer> h2){
        this.tableSize = tableSize;
        this.h1 = h1;
        this.h2 = h2;
        table = new Object[tableSize];
        deletedIndex = new boolean[tableSize];
    }



    public boolean isEmpty() {
        return n == 0;
    }

    public void insert(V value) throws java.lang.NullPointerException{
        if (value == null)
            throw new java.lang.NullPointerException();
        if (find(value) != -1)
            return;
        int index = h1.apply(value.key()) % tableSize;
        int probeStep = 0;
        int attemptIndex = index;

        while (table[attemptIndex] != null){
            attemptIndex = hash(value.key(), ++probeStep);
            if (attemptIndex == index)
                break;
        }
        if (table[attemptIndex] != null && attemptIndex == index)
            System.out.println("ERROR. Infinite loop in the hash table.");
        else{
            if (deletedIndex[attemptIndex])
                deletedIndex[attemptIndex] = false;
            n++;
            table[attemptIndex] = value;
        }
    }

    public V delete(V value) throws java.lang.NullPointerException{
        if (value == null)
            throw new java.lang.NullPointerException();
        int index = find(value);
        if (index == -1)
            return null;
        table[index] = null;
        deletedIndex[index] = true;
        n--;
        return value;
    }

    public int find(V value) {
        int probeStep = 0;
        int firstIndex = hash(value.key(), probeStep);
        while (true){
            int index = hash(value.key(), probeStep);
            if (deletedIndex[index]) {
                probeStep++;
                continue;
            }

            if (table[index] == null)
                return -1;
            if (((V)table[index]).key() == (value.key()))
                return index;
            if (probeStep++ > 0 && index == firstIndex)
                break;
        }
        return -1;
    }

    public int hash(int key, int probenumber) {
        return (h1.apply(key) + probenumber * h2.apply(key)) % tableSize;

    }
    public String toString(){
        String result = "";
        for (int i=0; i < table.length; i++){
            if (table[i] != null)
                result = result + i + " -> [" + ((V)table[i]).key() + ", " + ((V)table[i]) + "]; ";
            else
                result = result + i + " -> null; ";

        }
        return result;
    }
    public static void main(String[] args) {
        int tableSize = 10;
        // your implementation of the h1 function described above
        Function<Integer, Integer> h1 = new Function<>(){
            public Integer apply(Integer i) {
                while (i > 9){
                    i /= 10;
                }
                return i % tableSize;
            }
        };
        Function<Integer, Integer> h2 = new Function<>(){
            public Integer apply(Integer i) {
                return i % 10 % tableSize;
            }
        };
        // your implementation of the h2 function described above
        DoubleHashTable<HashableString> t = new DoubleHashTable<>(tableSize, h1, h2);
        t.insert(new HashableString("apple"));
        t.insert(new HashableString("oran"));
        t.insert(new HashableString("bana"));
        System.out.println(t.toString());

    }

}
