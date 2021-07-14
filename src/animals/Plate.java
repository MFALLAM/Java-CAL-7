package animals;

public class Plate {
    private int amount;
    private int food;

    public Plate(int amount, int food) {
        this.amount = amount;
        this.food = food;
    }

    public boolean decreaseFood(int foodGiven) {
        if (this.food < foodGiven) {
            return false;
        }
        this.food -= foodGiven;
        return true;
    }

    public void add(int food) {
        if (this.food + food <= this.amount) {
            this.food += food;
        }
    }

}