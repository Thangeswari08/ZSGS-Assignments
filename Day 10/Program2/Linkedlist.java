import java.util.LinkedList;
import java.util.ListIterator;

class Simple {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // a. Append elements
        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        System.out.println("a) " + list);

        // b. Iterate through all elements
        System.out.println("b)");
        for (String s : list) System.out.println(s);

        // c. Iterate from specified position (index 1)
        System.out.println("c)");
        for (int i = 1; i < list.size(); i++) System.out.println(list.get(i));

        // d. Reverse order
        System.out.println("d)");
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) System.out.println(it.previous());

        // e. Insert at specified position
        list.add(1, "Orange");
        System.out.println("e) " + list);

        // f. Insert first & last
        list.addFirst("Banana");
        list.addLast("Pineapple");
        System.out.println("f) " + list);

        // g. Insert at front
        list.addFirst("Papaya");
        System.out.println("g) " + list);

        // h. Insert at end
        list.addLast("Watermelon");
        System.out.println("h) " + list);

        // i. Insert multiple at specific index
        LinkedList<String> extra = new LinkedList<>();
        extra.add("Strawberry");
        extra.add("Blueberry");
        list.addAll(3, extra);
        System.out.println("i) " + list);

        // j. First & last occurrence
        list.add("Mango"); // duplicate
        System.out.println("j) First 'Mango': " + list.indexOf("Mango"));
        System.out.println("j) Last 'Mango': " + list.lastIndexOf("Mango"));
    }
}
