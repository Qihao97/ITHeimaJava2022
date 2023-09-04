package paragraph08.sec8_1;

import java.io.File;
import java.util.Calendar;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 11:07
 * @Descriptions: 文件操作测试，P186，程序8.1
 */
public class FileDemo {
    public static void main(String[] args) {
        String path = ".\\text.txt";
        File f = new File(path);

        if (f.exists()){
            System.out.println("文件" + path + "已经存在！");
            long time = f.lastModified();       //获取文件的最后修改时间
            Calendar cal = Calendar.getInstance();      //定义一个日历类，并实例化
            cal.setTimeInMillis(time);      //将long类型的时间转化为分秒
            System.out.println("文件最后修改时间" + cal.getTime().toLocaleString());
        }else {
            System.out.println("文件" + path + "不存在！");
            try{
                f.createNewFile();      //创建新文件
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(f.canRead()?"文件可读":"文件不可读");
        System.out.println(f.canWrite()?"文件可写":"文件不可写");
        System.out.println(f.canExecute()?"文件可执行":"文件不可执行");
        System.out.println(path + (f.isDirectory()?"是":"不是") + "目录");
        System.out.println(path + (f.isFile()?"是":"不是")+"文件");
        System.out.println(f.isHidden()?"是隐藏文件":"不是隐藏文件");
        System.out.println("文件大小： " + f.length() + "字节");
        System.out.println("文件绝对路径：" + f.getAbsolutePath());
//        得到File构造函数的路径
        System.out.println("文件路径：" + f.getPath());
        System.out.println("文件父目录： " + f.getParent());
    }
}
