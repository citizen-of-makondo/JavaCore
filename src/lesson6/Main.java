package lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(30, 20, 0.5);
        boolean isRun = dog1.run(100);
        System.out.println("Can dog run? " + isRun);

        Cat cat1 = new Cat(50,0,1);
        boolean isCatSwim = cat1.swim(10);
        System.out.println("Can cat swim? " + isCatSwim);
    }

}
