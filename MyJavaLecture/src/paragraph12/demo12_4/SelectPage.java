package paragraph12.demo12_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:48 PM
 * @Descriptions: SelectPage
 */
public class SelectPage extends JFrame implements ActionListener {

    private JComboBox<String> jcbSearchType; //查询方式
    private JTextField jtfSearchValue; //查询的值
    private JTable jtSerachResult; //查询结果
    private JButton jbSearch; //搜索按钮
    private JTable jtResult; //查询结果表
    private Container c;
    MainWindow parent;

    SelectPage(MainWindow mainFrm) {
        this.parent = mainFrm;

        setTitle("查询");
        setSize(800, 400);
        c = getContentPane(); //初始化一个容器
        c.setLayout(new BorderLayout());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initFrame(); //调用生成窗体控件方法
        //setResizable(false);
        //setVisible(true);
    }

    void initFrame() {
        /*JPanel titlePanel = new JPanel(); //定义一个标题面板
        titlePanel.setLayout(new FlowLayout());
        JLabel title = new JLabel("请根据查找方式查找信息");
        title.setFont(new Font("", 1, 20));
        title.setForeground(Color.BLUE);
        titlePanel.add(title);
        c.add(titlePanel,"North"); //使其位于上方*/

        JPanel searchPanel = new JPanel(); //定义一个搜索面板
        searchPanel.setLayout(null);
        JLabel l1 = new JLabel("查找方式:");
        l1.setBounds(250, 20, 60, 20); //设置标签位置和大小
        jcbSearchType = new JComboBox<String>();
        jcbSearchType.setBounds(330, 20, 80, 20);
        jcbSearchType.addItem("学号");
        jcbSearchType.addItem("姓名");
        jcbSearchType.addItem("政治面貌");
        jcbSearchType.addItem("院部");
        jcbSearchType.addItem("专业");
        jtfSearchValue = new JTextField();
        jtfSearchValue.requestFocus();
        jtfSearchValue.setBounds(430, 20, 120, 20);
        jbSearch = new JButton("查找");
        jbSearch.addActionListener(this);
        jbSearch.setBounds(570, 20, 60, 20);
        searchPanel.add(l1);
        searchPanel.add(jcbSearchType);
        searchPanel.add(jtfSearchValue);
        searchPanel.add(jbSearch);
        c.add(searchPanel, "Center"); //使其位于上方

        //关闭窗口的操作
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                shutDown();
            }
        });
    }

    private void shutDown() {
        this.dispose();
        this.parent.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 根据条件查询
        String strSel = "SELECT * FROM viStudent";
        String strCondition = jcbSearchType.getSelectedItem().toString();

        strSel += " WHERE " + strCondition + " = '";
        strSel += jtfSearchValue.getText().trim() + "'";
        //System.out.println(strSel);
        SqlHelper sh = null;
        try {
            sh = new SqlHelper();
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
        ResultSet rs = sh.query(strSel);

        String[] columnName = {"学号", "姓名", "性别", "政治面貌", "院部", "专业"}; //列名
        Object[][] rowData = new Object[10][6];
        int row = 0;
        try {
            while (rs.next()) {
                rowData[row][0] = rs.getString("学号");
                rowData[row][1] = rs.getString("姓名");
                rowData[row][2] = rs.getString("性别");
                rowData[row][3] = rs.getString("政治面貌");
                rowData[row][4] = rs.getString("院部");
                rowData[row][5] = rs.getString("专业");
                row++;
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            rs.close();
        } catch (SQLException e2) {
            e2.printStackTrace();
        }

        sh.close();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        jtResult = new JTable(rowData, columnName);
        panel.setBackground(Color.WHITE);
        panel.add(new JScrollPane(jtResult), BorderLayout.CENTER);
        c.add(panel, "South");
        validate();
    }

    /*
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new SelectPage();
    }
    */
}
