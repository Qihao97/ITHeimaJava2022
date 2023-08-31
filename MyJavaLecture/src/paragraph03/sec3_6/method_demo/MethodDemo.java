package paragraph03.sec3_6.method_demo;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:27
 * @Descriptions: P74, 程序3.12
 */
public class MethodDemo {
    float findMax(float arr[])    //形式参数arr[]是数组
    {
        int i;
        float temp;
        temp = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > temp)
                temp = arr[i];
        return temp;
    }
}
