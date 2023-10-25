package paragraph09.sec9_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/8:01
 * @Descriptions:
 */
public class ClickCount extends JFrame {//自定义窗口类继承自JFrame
    JLabel jl1;
    JButton jb1;
    int count=0;//统计点击按钮次数
    AListener al=new AListener();//新建监听器对象al
    public ClickCount(){//构造方法
        super("统计按钮单击次数");
        jl1=new JLabel("0");
        jb1=new JButton("Click Me");
        jb1.addActionListener(al);//为按钮jb1注册监听器到对象al
        Container contentPane=getContentPane();
        contentPane.setLayout(null);
        jb1.setBounds(20,50,80,25);
        jl1.setBounds(130,50,50,25);
        contentPane.add(jb1);
        contentPane.add(jl1) ;
        setSize(250,150);
        setVisible(true);
    }
    public static void main(String[] args){
        ClickCount test=new ClickCount();//创建窗口的对象
    }
    class AListener implements ActionListener {//实现监听器接口的类
        @Override
        public void actionPerformed(ActionEvent e){//实现接口中处理事件的方法
            count++;
            jl1.setText(String.valueOf(count));//设置标签的文字为按钮的点击次数
        }
    }
}
