import animals.*;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
                new Cat(400, 5, 0.5, 9, "Meshmish"),
                new Cat(250, 0, 1.3, 11, "Pepsi"),
                new Cat(250, 0, 1.3, 19, "Coko"),
        };

        Plate plate = new Plate(40, 29);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println("\r");

        plate.add(40);

        for (Cat cat : cats) {
            cat.setHungry(false);
            cat.eat(plate);
            System.out.println(cat);
        }

    }
}