import java.util.ArrayDeque;
import java.util.Queue;

public class queumeow {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();
        
        q.offer("Jyoti"); // 1
        q.offer("Sahithi"); //2

        q.forEach(System.out::println);
    }
}