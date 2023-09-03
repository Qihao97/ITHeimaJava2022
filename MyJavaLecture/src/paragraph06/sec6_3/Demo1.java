package paragraph06.sec6_3;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 11:58
 * @Descriptions: 本类有主方法，用于测试
 */
public class Demo1 {
    private Student student1,student2,student3,student4;
    public static void main(String[] args) {
        Add add = new Add();
        String[] id = {"1","2","3","4","5"};
        String[] name = {"迪丽热巴","玛尔扎哈","沙扬娜拉","希林娜依","伊丽莎白"};
        int[] score1 = {50,89,56,88,56};
        int[] score2 = {89,79,90,98,67};
        int[] score3 = {70,66,76,45,66};
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student(id[i],name[i],score1[i],score2[i],score3[i]);
            add.add(students[i]);
        }

        add.showAll();

        System.out.println("删除学员伊丽莎白：");
        add.remove("伊丽莎白");

        add.showAll();
    }
}
