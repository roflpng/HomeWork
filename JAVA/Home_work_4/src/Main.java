import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();System.out.println();System.out.println();
        System.out.println("Вітаю глядачів на змаганнях домашніх тварин!");

        Random rdog = new Random();
        Random rcat = new Random();
        int dogCount = rdog.nextInt(15);
        int catCount = rcat.nextInt(15);
        int qrun = rcat.nextInt(500);
        int qswim = rcat.nextInt(500);


        System.out.println("Сьогодні у нас виступають " + dogCount + " собак.");
        System.out.println("Сьогодні у нас виступають " + catCount + " котів.");

        System.out.println("Всім учасникам були назначені порядкові номери.");
        System.out.println("Першими виступають собаки, готуємось до початку змагань!!!\n");

        dog dogs[] = new dog[dogCount];
        for (int i=0; i<dogCount; i++){
            dogs[i] = new dog("Dog", "Пес номер: "+i);
        }
        for (int i=0; i<dogCount; i++){
            dogs[i].run(qrun);
            dogs[i].swim(qswim);

        }

        System.out.println("Тепер черга котів, готуємось до початку виступу!!!\n");
        cat cats[] = new cat[catCount];
        for (int i=0; i<catCount; i++){
            cats[i] = new cat("Cat", "Кіт номер: "+i);
        }
        for (int i=0; i<catCount; i++){
            cats[i].run(qrun);
            cats[i].swim(qswim);

        }
        System.out.println("Дякуємо учасникам змагань!!!");
        System.out.println("Перемогла дружба)\n\n\n\n");

    }
}