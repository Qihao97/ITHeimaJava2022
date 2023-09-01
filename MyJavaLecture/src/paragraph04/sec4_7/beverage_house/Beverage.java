package paragraph04.sec4_7.beverage_house;

public abstract class Beverage {
    public final static int SMALL = 1;
    public final static int MEDIUM = 2;
    public final static int LARGE = 3;

    private int capacity = SMALL;

    protected String description = "饮料";

    public String getDescription() {
        return description;
    }

    public void setCapacity(int s) {
        capacity = s;
    }

    public int getCapacity() {
        return capacity;
    }

    public abstract double price();
}
