import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listex {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String Name = sc.nextLine();
        list.add(Name);
        String Name2 = sc.nextLine();
        list.add(Name2);

        list.forEach(System.out::println);
    }
}