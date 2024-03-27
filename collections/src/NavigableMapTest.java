import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> letter = new TreeMap<>();

        letter.put("A", "Letter A");
        letter.put("C", "Letter C");
        letter.put("B", "Letter B");
        letter.put("D", "Letter D");
        letter.put("H", "Letter H");

        System.out.println("============ Letters table ==============");
        System.out.print("[");
        for (String key : letter.keySet()) {
            if (letter.lastKey().equals(key)) {
                System.out.println(key + " -> " + letter.get(key) + "]");
            } else {
                System.out.print(key + " -> " + letter.get(key) + ", ");
            }
        }

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("-------------------------------");
        System.out.println("Using lowerKey " + letter.lowerKey("C"));
        System.out.println("Using floorKey " + letter.floorKey("C"));
        System.out.println("Using higherKey " + letter.higherKey("C"));
        System.out.println("Using ceilingKey " + letter.ceilingKey("C"));
        System.out.println("Using headMap " + letter.headMap("C", true));
    }
}
