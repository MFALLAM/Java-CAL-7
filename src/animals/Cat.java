package animals;

public class Cat extends Animals {

    private final int run;

    private final int swim;

    private final double jump;

    private final int feed;

    private boolean isHungry;

    private String name;

    public Cat(int run, int swim, double jump,int feed, String name) {
        super(run, 0, jump);
        this.run = run;
        this.swim = swim;
        this.jump = jump;
        this.feed = feed;
        this.isHungry = false;
        this.name = name;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isHungry() {
        return isHungry;
    }

    @Override
    public boolean run(int length) {
        return (length == this.run || length < this.run) ? true : false;
    }

    @Override
    public boolean swim(int length) {
        return false;
    }

    @Override
    public boolean jump(double height) {
        return (height == this.jump || height < this.jump) ? true : false;
    }

    @Override
    public boolean eat(Plate plate) {
        if (!isHungry()) {
            this.isHungry = plate.decreaseFood(this.feed);
            return this.isHungry;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "run=" + run +
                ", swim=" + swim +
                ", jump=" + jump +
                ", feed=" + feed +
                ", isHungry=" + isHungry +
                '}';
    }
}