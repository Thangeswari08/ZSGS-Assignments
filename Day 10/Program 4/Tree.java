import java.util.*;;
class TreeDemo {
    public static void main(String[] args) {

        // a. Create TreeSet and add colours
        TreeSet<String> colours = new TreeSet<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        System.out.println("TreeSet of colours: " + colours);

        // b. Iterate through all elements
        System.out.println("\nIterating through TreeSet:");
        for (String colour : colours) {
            System.out.println(colour);
        }

        // c. Add all elements of one TreeSet to another
        TreeSet<String> moreColours = new TreeSet<>();
        moreColours.add("Black");
        moreColours.addAll(colours);
        System.out.println("\nNew TreeSet after adding all: " + moreColours);

        // d. Reverse order view
        System.out.println("\nReverse order view: " + moreColours.descendingSet());

        // e. Get first and last element
        System.out.println("\nFirst element: " + moreColours.first());
        System.out.println("Last element: " + moreColours.last());

        // f. Clone TreeSet
        TreeSet<String> clonedSet = new TreeSet<>(moreColours);
        System.out.println("\nCloned TreeSet: " + clonedSet);

        // g. Get number of elements
        System.out.println("\nNumber of elements: " + moreColours.size());

        // h. Compare two TreeSets
        TreeSet<String> compareSet = new TreeSet<>();
        compareSet.add("Red");
        compareSet.add("Pink");
        System.out.println("\nComparing TreeSets:");
        for (String element : moreColours) {
            System.out.println(element + " -> " + (compareSet.contains(element) ? "Yes" : "No"));
        }

        // ---- Number TreeSet operations ----
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11));

        // i. Numbers less than 7
        System.out.println("\nNumbers less than 7: " + numbers.headSet(7));

        // j. Element >= given (ceiling)
        System.out.println("Element >= 6: " + numbers.ceiling(6));

        // k. Element <= given (floor)
        System.out.println("Element <= 6: " + numbers.floor(6));

        // l. Strictly greater than given (higher)
        System.out.println("Element > 6: " + numbers.higher(6));

        // m. Strictly less than given (lower)
        System.out.println("Element < 6: " + numbers.lower(6));

        // n. Retrieve & remove first element
        System.out.println("\nRemoved first element: " + numbers.pollFirst());
        System.out.println("After removing first: " + numbers);

        // o. Retrieve & remove last element
        System.out.println("Removed last element: " + numbers.pollLast());
        System.out.println("After removing last: " + numbers);

        // p. Remove a given element
        numbers.remove(5);
        System.out.println("\nAfter removing 5: " + numbers);
    }
}
