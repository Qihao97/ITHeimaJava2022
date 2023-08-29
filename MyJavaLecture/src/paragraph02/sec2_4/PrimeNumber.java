package paragraph02.sec2_4;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 17:10
 * @Descriptions: 循环的综合应用，计算素数，书上42页程序2.6
 */
public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;    //计算前50个素数
        final int NUMBER_OF_PRIMES_PER_LINE = 10;   //每行显示10个
        int count = 0;      //count变量用来计算素数的个数
        int number = 2;     //定义number变量用来测试一个数是否为素数
        System.out.println("The first 50 prime numbers are \n");

        //while循环，找出来前50个才结束
        while (count < NUMBER_OF_PRIMES){
            boolean isPrime = true;
            //测试一个数是否为素数
            for (int divisor = 2; divisor <= number/2; divisor++){
                if ((number % divisor) == 0){       //如果该表达式为真，说明该数除了1和自身，还有能整除的数，2和3不执行
                    isPrime = false;
                    break;
                }
            }
            //if语句的嵌套
            if (isPrime){
                count ++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.println(number);
                }
                else {
                    System.out.print(number + "\t");
                }
            }
            //检查下一个数是否为素数
            number ++;
        }
    }
}
