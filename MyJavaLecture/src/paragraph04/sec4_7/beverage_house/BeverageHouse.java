package paragraph04.sec4_7.beverage_house;

public class BeverageHouse {

    public static void main(String[] args) {
        Beverage b1 = new JuHuaCha("中杯菊花茶");
        b1.setCapacity(Beverage.MEDIUM);
        System.out.println(b1.getDescription() + "价格" + b1.price());

        Beverage b2 = new LemonJuice("小杯柠檬汁");
        b2.setCapacity(Beverage.SMALL);
        b2 = new BingTang(b2);
        System.out.println(b2.getDescription() + "价格" + b2.price());

        Beverage b3 = new NaiCha("大杯奶茶");
        b3.setCapacity(Beverage.LARGE);
        b3 = new YeGuo(b3);
        b3 = new Milk(b3);
        System.out.println(b3.getDescription() + "价格" + b3.price());
    }
}
