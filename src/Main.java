import java.util.*;

public class Main {
    public static void main(String[] args) {
        AbstractList<String> ab = new ArrayList<>();
        //1
        AbstractList<String> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a world: ");
        for (int i = 0; i < 5; i++) {
            a.add(in.nextLine());

        }
        System.out.println("Ввели " + a);
        //2
        AbstractList<String> b = new ArrayList<>();
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter a world: ");
        for (int i = 0; i < 5; i++) {
            b.add(in.nextLine());
        }
        System.out.println("Ввели " + b);




        ab.addAll(a);
        ab.add(1,b.get(4));
        ab.add(3,b.get(3));
        ab.add(5,b.get(2));
        ab.add(7,b.get(1));
        ab.add(9,b.get(0));
        System.out.println(ab);

        Collections.sort(ab, Comparator.comparing(String::length));
        System.out.println(ab);
    }
}