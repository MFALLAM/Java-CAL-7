package animals;

public class Dog extends Animals {

    private final int run;

    private final int swim;

    private final double jump;

    private boolean isHungry;


    public Dog(int run, int swim, double jump) {
        super(run, swim, jump);
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    @Override
    public boolean run(int length) {
        return length == this.run || length < this.run ? true : false;
    }

    @Override
    public boolean swim(int length) {
        return length == this.swim || length < this.swim ? true : false;
    }

    @Override
    public boolean jump(double height) {
        return height == this.jump || height < this.jump ? true : false;
    }

    @Override
    public boolean eat(Plate plate) {
        return false;
    }
}