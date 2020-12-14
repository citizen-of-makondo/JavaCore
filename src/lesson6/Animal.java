package lesson6;

public abstract class Animal {
    private int lengthForRun;
    private int lengthForSwim;
    private double heightForJump;

    private int limitRun;
    private int limitSwim;
    private double limitJump;

    protected Animal(int limitRun, int limitSwim, double limitJump) {
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        this.limitJump = limitJump;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public int getLimitSwim() {
        return limitSwim;
    }

    public double getLimitJump() {
        return limitJump;
    }

    public boolean run(int lenghtForRun) {
        return false;
    }

    public boolean swim(int lengthForSwim) {
        return false;
    }

    public boolean jump(double heightForJump) {
        return false;
    }
}
