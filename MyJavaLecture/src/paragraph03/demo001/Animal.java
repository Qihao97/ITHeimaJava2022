package paragraph03.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/16:31
 * @Descriptions: 牲口
 */
public class Animal {
    private String name;
    private String color;
    private int legs;

    public Animal(String name, String color, int legs) {
        this.name = name;
        this.color = color;
        this.legs = legs;
    }

    //动物叫声
    public void speak(){
        System.out.println("动物叫");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", legs=" + legs +
                '}';
    }
}
