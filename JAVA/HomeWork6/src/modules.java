import java.io.IOException;
import java.util.Scanner;

public class modules {
    protected void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    protected void checkSumSign(){
        int a,b;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введіть перше число: ");
             a = in.nextInt();
            System.out.print("Введіть друге число: ");
            b = in.nextInt();
            if (a+b <0) System.out.println("Сума негативна");
            else System.out.println("Сума позитивна");
        }catch (Exception e){
            System.out.println("\nВведене некоректне число або текс! Повторіть спробу\n");
            checkSumSign();
        }
    }
    protected void printColor(){
        int value;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введіть число: ");
            value = in.nextInt();
            if (value<=0){
                System.out.println("Червоний");

            } else if (value<=100) {
                System.out.println("Жовтий");

            }else {
                System.out.println("Зелений");
            }
        }catch (Exception e){
            System.out.println("\nВведене некоректне число або текс! Повторіть спробу\n");
            printColor();
        }
    }
    protected void compareNumbers(){
        int a,b;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введіть перше число: ");
            a = in.nextInt();
            System.out.print("Введіть друге число: ");
            b = in.nextInt();
            if (a>=b){
                System.out.println(a+" >= " + b);
            } else {
                System.out.println(a+" < " + b);            }
        }catch (Exception e){
            System.out.println("\nВведене некоректне число або текс! Повторіть спробу\n");
            compareNumbers();
        }

    }
    protected void ten(){
        int a,b;
        boolean bool;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введіть перше число: ");
            a = in.nextInt();
            System.out.print("Введіть друге число: ");

            b = in.nextInt();
            a=a+b;
            if (a>10&&a<=20){
                bool = true;
                System.out.println(bool);
            } else {
                bool = false;
                System.out.println(bool);
            }
        }catch (Exception e) {
            System.out.println("\nВведене некоректне число або текс! Повторіть спробу\n");
            ten();
        }
    }
    protected  void SE(){
        int a,b;
        boolean bool;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введіть перше число: ");
            a = in.nextInt();
            System.out.print("Введіть друге число: ");

            b = in.nextInt();
            a=a+b;
            if (a>=0){
                bool = false;
                System.out.println("Відповідь на завдання 7 "+bool);

                System.out.println("Число позитивне (завдання 8)");
            } else {
                bool = true;
                System.out.println("Відповідь на завдання 7 "+bool);

                System.out.println("Число негативне (завдання 8) ");
            }
        }catch (Exception e) {
            System.out.println("\nВведене некоректне число або текс! Повторіть спробу\n");
            SE();
        }
    }

    protected void nine(){
        int a;
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть рядок: ");
        s = in.nextLine();
        try {
            System.out.print("Введіть число повторів: ");
            a = in.nextInt();
            if(a<0){
                System.out.println("Ведене від'ємне число. введіть число більше нуля");
                nine();
            }

            for (;a>0;a--){
                System.out.println(s);
            }

        }catch (Exception e) {
            System.out.println("\nВведене некоректне число або текс в перше поле! Повторіть спробу\n");
            nine();
        }
    }
    protected void year(){
        int y;

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введіть будь-який рік: ");
            y = in.nextInt();
            if (y%4 ==0) {
                if(y % 100 != 0 || ( y % 100 == 0 && y % 400 == 0))
                {
                    System.out.println("Рік є високосним. \n" + y);
                }
            }else System.out.println("Рік не є високосним. \n" + y);
        }catch (Exception e) {
            System.out.println("\nВведене некоректне число або текс в перше поле! Повторіть спробу\n");
            year();
        }
    }
}

