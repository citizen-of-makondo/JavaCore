package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Урсула", 5,true);
        Cat cat2 = new Cat("Аурелиано", 7, true);
        Cat cat3 = new Cat("Хосе Аркадио", 6, true);
        Plate plate = new Plate(10,15);

        Cat[] cats = new Cat[] {cat1, cat2, cat3};

        fidding(cats, plate);

    }

    private static void fidding(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(cat.getAppetit(), plate);
            System.out.println("Кот " + cat.getName() + " голоден? " + cat.isHungry());
        }
    }
}
