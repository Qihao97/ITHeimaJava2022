package paragraph02.sec2_4;

/**
 * @Author: Qihao
 * @Time: 2/24/2025 2:40 PM
 * @Descriptions: TODO
 */
public class Demo002While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (sum < 5000){
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
        System.out.println("i = " + i);
    }
}
