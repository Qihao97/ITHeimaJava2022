package paragraph10.sec10_3.demo10_7;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:18 PM
 * @Descriptions: 10.7
 */
public class ThreadInterrupt {
    public static void main(String args[]) {
        Learning t = new Learning();
        Thread student = new Thread(t, "学生");
        Thread teacher = new Thread(t, "教师");
        t.setSleepThread(student); //设置student为要中断的进程
        student.start();
        teacher.start();
    }
}
