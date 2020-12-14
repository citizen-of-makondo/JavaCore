package lesson7;

public class Plate {
    private int filling;
    private int volume;

    public Plate(int filling, int volume) {
        this.filling = filling;
        this.volume = volume;
    }

    public void addFood(int food) {
        if ((filling += food) > volume) {
            System.out.printf("Слишком много корма");
        }
        else filling += food;
        System.out.println("Добавлено " + food + " корма");
    }

    public boolean substratFood (int appetit) {
        if (appetit > filling) {
            System.out.println("Слишком мало корма, нужно еще");
            return false;
        }
        else {
            filling -= appetit;
            return true;
        }
    }
}
