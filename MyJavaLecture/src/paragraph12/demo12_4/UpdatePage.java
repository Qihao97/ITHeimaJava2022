package paragraph12.demo12_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:57 PM
 * @Descriptions: UpdatePage
 */
public class UpdatePage extends ModifyPage implements ActionListener {

    protected String oldNo = null; //获取学生的学号，为后面的修改做准备
    public UpdatePage(MainWindow mainFrm){
        super(mainFrm);
        setTitle("修改记录窗口");
        //修改按钮的名称
        jbUpdate.setText("修改");
    }
    protected void search() throws UnsupportedEncodingException {
        //查找类型
        String searchType = jcbSearchType.getSelectedItem().toString();
        //查找值
        String searchValue = jtfSearchValue.getText().trim();
        //查找字符串
        String strSel = "SELECT * FROM viStudent WHERE "
                + searchType + "= '" + searchValue + "'";
        System.out.println(strSel);

        SqlHelper sh = new SqlHelper();
        ResultSet rs = sh.query(strSel);

        // 找院部ID
        try {
            while (rs.next()) {
                this.oldNo = rs.getString("学号"); //学生的学号
                jtfNo.setText(rs.getString("学号"));
                jtfName.setText(rs.getString("姓名"));
                jcbGender.setSelectedItem(rs.getString("性别"));
                jcbDepartment.setSelectedItem(rs.getString("院部"));
                updateMajor(); //根据院部更新专业
                jcbMajor.setSelectedItem(rs.getString("专业"));
            }
            rs.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == jcbDepartment){//系部选择变化
            updateMajor();
        }else if(e.getSource() == jbCancel){
            parent.setVisible(true);
            this.dispose();
        }
        else if(e.getSource() == jbSearch){//查找按钮
            try {
                search(); //调用查找方法
            } catch (UnsupportedEncodingException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(e.getSource() == jbUpdate){//更新按钮
            //获取院部ID和专业ID
            getMajorDepart();
            String newNo = jtfNo.getText().trim();
            String name = jtfName.getText().trim();
            String gender = jcbGender.getSelectedItem().toString();
            String status = jcbStatus.getSelectedItem().toString();

            // 提示学号为空
            if(newNo.equals("")){
                JOptionPane.showMessageDialog(null,
                        "学号不能为空", "提示",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String strUpdate = "UPDATE tbStudent SET no = '"
                    + newNo + "', name = '" + name
                    + "', gender = '" + gender
                    + "', status ='" + status
                    + "', departmentID = '" + departmentID
                    + "', majorID = '" + majorID + "'"
                    + " WHERE no = '" + oldNo + "'";

            SqlHelper sh = null;
            try {
                sh = new SqlHelper();
            } catch (UnsupportedEncodingException ex) {
                throw new RuntimeException(ex);
            }
            if(sh.update(strUpdate))
                JOptionPane.showMessageDialog(null,
                        "记录已更新", "提示",
                        JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,
                        "记录更新失败", "提示",
                        JOptionPane.INFORMATION_MESSAGE);
            sh.close();
        }
    }

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UpdatePage("修改记录窗口");
	}
	*/

}
