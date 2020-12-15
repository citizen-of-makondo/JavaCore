package lesson6;

public class Cat extends Animal {

    public Cat(int limitRun, int limitSwim, double limitJump) {
        super(limitRun, limitSwim, limitJump);
    }

    @Override
    public boolean run(int lenghtForRun) {
        return lenghtForRun <= getLimitRun();
    }

    @Override
    public boolean swim(int lengthForSwim) {
        return false;
    }

    @Override
    public boolean jump(double heightForJump) {
        return heightForJump <= getLimitJump();
    }
}
