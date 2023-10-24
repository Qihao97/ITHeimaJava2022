package paragraph03.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/16:33
 * @Descriptions: 派生类
 */
public class Dog extends Animal {
    public Dog(String name, String color, int legs){
        super(name, color, legs);
    }

    @Override
    public void speak(){
        System.out.println("汪汪汪~");
    }

    public void run() {
        System.out.println("走两步，走个一日千里，走个虎虎生风！");
    }
}
