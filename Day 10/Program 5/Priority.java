import java.util.*;

class PriorityQueueDemo {
    public static void main(String[] args) {

        // 1. Create a new priority queue and add colors
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Blue");
        pq1.add("Yellow");
        System.out.println("PriorityQueue 1: " + pq1);

        // 2. Iterate through all elements
        System.out.println("\nIterating over PriorityQueue:");
        for (String color : pq1) {
            System.out.println(color);
        }

        // 3. Add all elements of pq1 to another priority queue
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Black");
        pq2.addAll(pq1);
        System.out.println("\nPriorityQueue 2 after adding all from pq1: " + pq2);

        // 4. Insert a given element into a priority queue
        pq1.add("White");
        System.out.println("\nPriorityQueue 1 after adding 'White': " + pq1);

        // 5. Remove all elements from pq1
        pq1.clear();
        System.out.println("\nPriorityQueue 1 after clearing: " + pq1);

        // 6. Count number of elements in pq2
        System.out.println("\nNumber of elements in pq2: " + pq2.size());

        // 7. Compare two priority queues
        System.out.println("\nComparing pq2 and pq1:");
        for (String element : pq2) {
            System.out.println(element + " -> " + (pq1.contains(element) ? "Yes" : "No"));
        }

        // 8. Retrieve (peek) the first element of pq2
        System.out.println("\nFirst element in pq2 (peek): " + pq2.peek());

        // 9. Retrieve and remove the first element
        System.out.println("Removed first element (poll): " + pq2.poll());
        System.out.println("PriorityQueue 2 after poll: " + pq2);

        // 10. Convert pq2 to an array
        Object[] array = pq2.toArray();
        System.out.println("\nPriorityQueue 2 as array:");
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
