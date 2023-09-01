package paragraph04.sec4_7.beverage_house;

public class BingTang extends TiaoLiao {
    Beverage beverage;

    public BingTang(Beverage b) {
        beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + "加冰糖";
    }

    public double price() {
        if (getCapacity() == Beverage.SMALL)
            return 0.5 + beverage.price();
        else if (getCapacity() == Beverage.MEDIUM)
            return 1 + beverage.price();
        else if (getCapacity() == Beverage.LARGE)
            return 1.5 + beverage.price();
        else
            return 0;
    }
}
