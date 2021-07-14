package animals;

public abstract class Animals {

    protected int run;

    protected int swim;

    protected double jump;

    public Animals(int run, int swim, double jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public abstract boolean run(int length);

    public abstract boolean swim(int length);

    public abstract boolean jump(double height);

    public abstract boolean eat(Plate plate);
}