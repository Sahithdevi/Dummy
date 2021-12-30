import java.util.HashMap;
import java.util.Map;

public class mapsmeow {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // map - interface
        // hashmap - class

        map.put("name", "Sahithi");
        map.put("name2", "Madhuri");

        map.forEach((a, b) -> System.out.println(a + " : " + b));
    }
}
