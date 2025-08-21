import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapDemo {
    public static void main(String[] args) {
        
        // 1. Associate the specified value with the specified key in a HashMap
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");
        System.out.println("1. Initial Map: " + map1);

        // 2. Count the number of key-value mappings in a map
        System.out.println("2. Size of map1: " + map1.size());

        // 3. Copy all mappings from map1 to another map
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("3. map2 after copy: " + map2);

        // 4. Remove all mappings from a map
        map2.clear();
        System.out.println("4. map2 after clear: " + map2);

        // 5. Check whether a map contains key-value mappings (empty or not)
        System.out.println("5. Is map2 empty? " + map2.isEmpty());

        // 6. Get a shallow copy of a HashMap instance (safe way)
        HashMap<Integer, String> mapCopy = new HashMap<>(map1);
        System.out.println("6. Shallow copy of map1: " + mapCopy);

        // 7. Test if a map contains a mapping for the specified key
        int keyToCheck = 2;
        System.out.println("7. Contains key " + keyToCheck + "? " + map1.containsKey(keyToCheck));

        // 8. Test if a map contains a mapping for the specified value
        String valueToCheck = "Banana";
        System.out.println("8. Contains value \"" + valueToCheck + "\"? " + map1.containsValue(valueToCheck));

        // 9. Create a set view of the mappings contained in a map
        Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
        System.out.println("9. Set view of map1: " + entrySet);

        // 10. Get the value of a specified key in a map
        int keyToGet = 3;
        String value = map1.get(keyToGet);
        System.out.println("10. Value for key " + keyToGet + ": " + value);
    }
}
