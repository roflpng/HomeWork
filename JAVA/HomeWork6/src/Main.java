import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        modules m = new modules();
        Scanner in = new Scanner(System.in);
        boolean check = true;
        System.out.println("Завдання 2");
        m.printThreeWords();

        System.out.println("Завдання 3");
        m.checkSumSign();

        System.out.println("Завдання 4");
        m.printColor();

        System.out.println("Завдання 5");
        m.compareNumbers();

        System.out.println("Завдання 6");
        m.ten();

        System.out.println("Завдання 7,8");
        m.SE();

        System.out.println("Завдання 9");
        m.nine();

        System.out.println("Завдання 10");
        m.year();

        System.out.println("Дякую за увагу");
    }
}