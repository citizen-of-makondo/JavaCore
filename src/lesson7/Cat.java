package lesson7;

public class Cat {
    private String name;
    private int appetit;
    private boolean isHungry;

    public Cat(String name, int appetit, boolean isHungry) {
        this.name = name;
        this.appetit = appetit;
        this.isHungry = isHungry;
    }

    public void eat(int appetit, Plate plate) {
        if (plate.substratFood(appetit)) {
            isHungry = false;
        } else {
            isHungry = true;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public int getAppetit() {
        return appetit;
    }
}
