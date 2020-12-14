package lesson6;

public class Dog extends Animal {

    public Dog(int limitRun, int limitSwim, double limitJump) {
        super(limitRun, limitSwim, limitJump);
    }

    @Override
    public boolean run(int lenghtForRun) {
        return lenghtForRun <= getLimitRun();
    }

    @Override
    public boolean swim(int lengthForSwim) {
        return lengthForSwim <= getLimitSwim();
    }

    @Override
    public boolean jump(double heightForJump) {
        return heightForJump <= getLimitJump();
    }
}
