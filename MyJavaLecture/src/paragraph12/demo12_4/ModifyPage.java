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
 * @Time: 11/14/2023 7:53 PM
 * @Descriptions: ModifyPage
 */
public class ModifyPage extends JFrame
        implements ActionListener {
    protected JComboBox<String> jcbSearchType;
    protected JTextField jtfSearchValue;
    protected JButton jbSearch;
    protected JTextField jtfNo;
    protected JTextField jtfName;
    protected JComboBox<String> jcbGender;
    protected JComboBox<String> jcbStatus;
    protected JComboBox<String> jcbDepartment;
    protected JComboBox<String> jcbMajor;
    protected JButton jbUpdate;
    protected JButton jbCancel;
    protected Container c;
    JPanel panel1;
    MainWindow parent;
    protected String departmentID=null; //院部ID号
    protected String majorID=null; //专业ID号

    public ModifyPage(MainWindow mainFrm){
        this.parent = mainFrm;

        c = getContentPane(); //初始化一个容器
        c.setLayout(new BorderLayout());
        initFrame(); //调用生成窗体控件方法
        //setVisible(true);
    }

    private void initFrame() {
        // 获取屏幕的尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(400, 400);
        int width = getWidth();
        int height = getHeight();
        //窗口居中
        setLocation((screenWidth - width) / 2, (screenHeight - height) / 2);

        // 上面的选择查找区
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(200, 40));
        JLabel l1 = new JLabel("查找类型");
        // l1.setBounds(30, 20, 50, 20);
        jcbSearchType = new JComboBox<String>();
        jcbSearchType.setPreferredSize(new Dimension(100, 20));// 设置下拉菜单的尺寸
        // jcbSearchType.setBounds(100, 20, 40, 20);
        jtfSearchValue = new JTextField(10);
        // jtfSearchValue.setBounds(160, 20, 20, 20);
        jbSearch = new JButton("查找");
        // jbSearch.setBounds(200, 20, 20, 20);
        jcbSearchType.addItem("学号");
        jcbSearchType.addItem("姓名");
        panel1.add(l1);
        panel1.add(jcbSearchType);
        panel1.add(jtfSearchValue);
        panel1.add(jbSearch);
        c.add(panel1, "North");
        jbSearch.addActionListener(this); //为查找按钮添加监听

        // 中间的显示区
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        JLabel l2 = new JLabel("学号");
        l2.setBounds(50, 20, 70, 20);
        JLabel l3 = new JLabel("姓名");
        l3.setBounds(50, 60, 70, 20);
        JLabel l4 = new JLabel("性别");
        l4.setBounds(50, 100, 70, 20);
        JLabel l5 = new JLabel("政治面貌");
        l5.setBounds(50, 140, 70, 20);
        JLabel l6 = new JLabel("院部");
        l6.setBounds(50, 180, 70, 20);
        JLabel l7 = new JLabel("专业");
        l7.setBounds(50, 220, 70, 20);

        jtfNo = new JTextField();
        jtfNo.setBounds(130, 20, 120, 20);
        jtfName = new JTextField();
        jtfName.setBounds(130, 60, 120, 20);
        jcbGender = new JComboBox<String>();
        jcbGender.setBounds(130, 100, 120, 20);
        jcbStatus = new JComboBox<String>();
        jcbStatus.setBounds(130, 140, 120, 20);
        jcbDepartment = new JComboBox<String>();
        jcbDepartment.setBounds(130, 180, 120, 20);
        jcbMajor = new JComboBox<String>();
        jcbMajor.setBounds(130, 220, 120, 20);
        jcbGender.addItem("男");
        jcbGender.addItem("女");
        jcbStatus.addItem("共青团员");
        jcbStatus.addItem("共产团员");
        jcbStatus.addItem("民主党派");
        jcbStatus.addItem("群众");
        jcbDepartment.addActionListener(this); //为下拉列表添加监听
        jcbMajor.addActionListener(this); //为下拉列表添加监听

        panel2.add(l2);
        panel2.add(l3);
        panel2.add(l4);
        panel2.add(l5);
        panel2.add(l6);
        panel2.add(l7);
        panel2.add(jtfNo);
        panel2.add(jtfName);
        panel2.add(jcbGender);
        panel2.add(jcbStatus);
        panel2.add(jcbDepartment);
        panel2.add(jcbMajor);
        c.add(panel2, "Center");

        // 添加下面的两个按钮
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setPreferredSize(new Dimension(100, 60));
        jbUpdate = new JButton("更新");
        jbCancel = new JButton("取消");
        jbUpdate.addActionListener(this); //为更新按钮添加监听
        jbCancel.addActionListener(this); //为取消按钮添加监听
        panel3.add(jbUpdate);
        panel3.add(jbCancel);
        c.add(panel3, "South");

        //关闭窗口的操作
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                shutDown();
            }
        });

        //给院部列表添加内容
        addDepartment();
    }
    private void addDepartment(){
        String department = null;
        SqlHelper sh = null;
        try {
            sh = new SqlHelper();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        String strSel = "SELECT departmentName FROM tbdepartment";
        System.out.println(strSel);
        ResultSet rs = sh.query(strSel);
        try{
            while(rs.next()){
                department = rs.getString("departmentName");
                jcbDepartment.addItem(department);
            }
            rs.close();
        }
        catch(SQLException e1){
            e1.printStackTrace();
        }
        sh.close();
    }

    private void shutDown(){
        parent.setVisible(true);
        this.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == jbCancel){
            shutDown();
        }
    }

    //获取院部ID和专业ID
    protected void getMajorDepart(){
        String strSel = "SELECT * FROM tbMajor WHERE majorName = '"
                + jcbMajor.getSelectedItem().toString() + "'";

        SqlHelper sh = null;
        try {
            sh = new SqlHelper();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        ResultSet rs = sh.query(strSel);
        try{
            while(rs.next()){
                departmentID = rs.getString("departmentID");
                majorID = rs.getString("majorID");
            }
            rs.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        sh.close();
    }


    protected void updateMajor() {
        // 根据选择的院部，获取该院部的专业
        String department = jcbDepartment.getSelectedItem().toString();
        String major = null;
        String strSel;
        SqlHelper sh = null;
        try {
            sh = new SqlHelper();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        strSel = "SELECT * FROM tbmajor INNER JOIN tbdepartment ON "
                + "tbmajor.departmentID = tbdepartment.departmentID"
                + " WHERE tbdepartment.departmentName = '" + department + "'";

        ResultSet rs = sh.query(strSel);

        jcbMajor.removeAllItems();

        // 找院部ID
        try {
            while (rs.next()) {
                major = rs.getString("majorName");
                jcbMajor.addItem(major);
            }
            rs.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        sh.close();
    }

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Modify(1);
	}

	 */
}
