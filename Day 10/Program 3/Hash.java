import java.util.*;

class HashDemo{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // a. Append elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        System.out.println("a) " + set);

        // b. Iterate
        System.out.println("b)");
        for (String s : set) System.out.println(s);

        // c. Size
        System.out.println("c) Size: " + set.size());

        // d. Empty the set
        set.clear();
        System.out.println("d) After clear: " + set);

        // e. Check empty
        System.out.println("e) Is empty? " + set.isEmpty());

        // Refill for next tasks
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        
        // f. Clone
        HashSet<String> cloneSet = new HashSet<>(set);
 
        System.out.println("f) Cloned: " + cloneSet);

        // g. Convert to array
        String[] arr = set.toArray(new String[0]);
        System.out.println("g) Array: " + Arrays.toString(arr));

        // h. Convert to TreeSet
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("h) TreeSet: " + treeSet);

        // i. Convert to ArrayList
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println("i) ArrayList: " + list);

        // j. Compare two sets
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Banana");
        anotherSet.add("Mango");
        anotherSet.add("Apple");
        System.out.println("j) Are equal? " + set.equals(anotherSet));
    }
}
