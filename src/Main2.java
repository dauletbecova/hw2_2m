import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();

        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        System.out.println("\nСписок A:");
        System.out.println(listA);

        ArrayList<String> listB = new ArrayList<>();

        System.out.println("\nВведите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        System.out.println("\nСписок B:");
        System.out.println(listB);

        ArrayList<String> listC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("\nОбъединенный список C:");
        System.out.println(listC);

        Collections.sort(listC, (a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println("\nОтсортированный список C по длине строк:");
        System.out.println(listC);
    }
}
