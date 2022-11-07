package section_03_api_basic.string_array_basic;

/**
 * @Author ：Qihao
 * @Time ：2022/11/07/11:41
 * @Description ：数组的定义和静态初始化
 * 数组的定义格式：
 * 格式1：
 * int[] arr;
 * 定义了一个int类型的数组，数组名是arr;
 * 格式2：
 * int arr[];
 * 定义了一个int类型的变量，变量为arr数组；，推荐格式1
 * Java中的数组，必须先初始化，然后才能使用
 * Java数组的初始化，就是为数组中的每个元素分配内存空间，并为每个元素赋值
 * 数组中的每一个数据，称为数组中的元素
 * 数组的初始化分为静态初始化和动态初始化；
 * 静态初始化就是在创建数组时为每一个元素赋值，由系统决定数组的长度
 * 静态初始化格式：     数据类型[] 数组名 = new 数据类型[]{数据1,数据2, ...};
 * eg. int[] arr = new int[]{1, 2, 3, 4, 5};
 * 简化格式：  数据类型[] 数组名 = {数据1, 数据2, ...}
 * eg. int[] arr = {1, 2, 3, 4, 5};
 *
 * 数组中元素的访问是通过索引实现的，数组名[索引]，相当于变量名
 * 索引从0开始，是连续的，每次增加1
 *
 * 数组的动态初始化：在创建数组的时候，只指定数组中元素的个数，由系统自动为数组分配初始值
 * 格式： 数据类型[] 数组名 = new 数据类型[元素个数];
 *
 * 数组的静态初始化适用于在一开始就知道元素值的场景，动态初始化适用于一开始知道元素个数，但是不知道值的场景，两种初始化方式不可以混用
 */
public class Demo02ArrayDefineStaticInit {
    public static void main(String[] args) {
//        创建一个数组
        int[] scores = {89, 90, 99, 92, 85, 96};

//        输出数组名示例: 输出数组名得到一个地址，因为数组是在堆内存开辟一段内存空间创建的，而数组名的地址就是数组的地址，也是数组中第一个元素的地址
        System.out.println(scores);     //[I@1b6d3586

//        访问数组中的元素是通过 数组名[索引] 实现的，这种方式可以访问和修改数组中元素的值
        System.out.println(scores[2]);

//        使用for循环遍历数组
        System.out.println("-----------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

//        foreach遍历数组,foreach循环不能够改变基本数据类型的值，可以改变引用数据类型指向的对象
        System.out.println("------------------");
        for (int i: scores
             ) {
            System.out.println(i);
        }

//        获取最大值
        int max = scores[0];
        for (int i: scores
             ) {
            if (i > max){
                max = i;
            }
        }
        System.out.println("最大值为：" + max);

//        动态创建数组示例,只给出数组的长度，由系统自动为数组分配初始值
        int[] arr2 = new int[5];
        System.out.println("----------------------------------------");
//        输出数组的每一个元素，可知int类型的元素，初始值为0
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
    }
}
