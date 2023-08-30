//import java.util.function.Function;
//public class HashableInteger implements Hashable{
//    private Integer i;
//    public HashableInteger(Integer i) { this.i = i; }
//
//    public int key() {
//        return i * i;
//    }
//
//    public String toString(){
//        return i.toString();
//    }
//    public static void main(String[] args) {
//        int tableSize = 100;
//        // your implementation of the h1 function described above
//        Function<Integer, Integer> h1 = new Function<>(){
//            public Integer apply(Integer i) {
//                return i % tableSize;
//            }
//        };
//        Function<Integer, Integer> h2 = new Function<>(){
//            public Integer apply(Integer i) {
//                return i % 2 + 1;
//            }
//        };
//        // your implementation of the h2 function described above
//        DoubleHashTable<HashableInteger> t = new DoubleHashTable<>(tableSize, h1, h2);
//        t.insert(new HashableInteger(25));
//        System.out.println(t.find(new HashableInteger(25)));
//        t.insert(new HashableInteger(3));
//        System.out.println(t.find(new HashableInteger(3)));
//        t.insert(new HashableInteger(5));
//        System.out.println(t.find(new HashableInteger(5)));
//        t.insert(new HashableInteger(1));
//        System.out.println(t.find(new HashableInteger(1)));
//        t.insert(new HashableInteger(10));
//        System.out.println(t.find(new HashableInteger(10)));
//        t.delete(new HashableInteger(1));
//        t.insert(new HashableInteger(0));
//        System.out.println(t.find(new HashableInteger(0)));
//        t.insert(new HashableInteger(32));
//        System.out.println(t.find(new HashableInteger(32)));
//        t.insert(new HashableInteger(5));
//        System.out.println(t.find(new HashableInteger(5)));
//        t.insert(new HashableInteger(92));
//        System.out.println(t.find(new HashableInteger(92)));
//        t.insert(new HashableInteger(4));
//        System.out.println(t.find(new HashableInteger(4)));
//        t.insert(new HashableInteger(1));
//        System.out.println(t.find(new HashableInteger(1)));
//        t.insert(new HashableInteger(7));
//        System.out.println(t.find(new HashableInteger(7)));
//        t.insert(new HashableInteger(17));
//        System.out.println(t.find(new HashableInteger(17)));
//        t.insert(new HashableInteger(17));
//        System.out.println(t.find(new HashableInteger(17)));
//        t.insert(new HashableInteger(33));
//        System.out.println(t.find(new HashableInteger(33)));
//        t.insert(new HashableInteger(11));
//        System.out.println(t.find(new HashableInteger(11)));
//        t.insert(new HashableInteger(12));
//        System.out.println(t.find(new HashableInteger(12)));
//        t.insert(new HashableInteger(21));
//        System.out.println(t.find(new HashableInteger(21)));
//        t.insert(new HashableInteger(28));
//        System.out.println(t.find(new HashableInteger(28)));
//        t.insert(new HashableInteger(23));
//        System.out.println(t.find(new HashableInteger(23)));
//        t.insert(new HashableInteger(29));
//        System.out.println(t.find(new HashableInteger(29)));
//        t.insert(new HashableInteger(9));
//        System.out.println(t.find(new HashableInteger(9)));
//        t.insert(new HashableInteger(19));
//        System.out.println(t.find(new HashableInteger(19)));
//        t.insert(new HashableInteger(20));
//        System.out.println(t.find(new HashableInteger(20)));
//        t.insert(new HashableInteger(30));
//        System.out.println(t.find(new HashableInteger(30)));
//        t.delete(new HashableInteger(20));
//        t.delete(new HashableInteger(30));
//        t.insert(new HashableInteger(30));
//        System.out.println(t.find(new HashableInteger(30)));
//        t.insert(new HashableInteger(20));
//        System.out.println(t.find(new HashableInteger(20)));
//        System.out.println(t.find(new HashableInteger(77)));
//        System.out.println(t.find(new HashableInteger(92)));
//        System.out.println(t.toString());
//
//
//    }
//}
