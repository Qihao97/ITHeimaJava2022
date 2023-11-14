package paragraph12.demo12_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.UnsupportedEncodingException;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:52 PM
 * @Descriptions: InsertPage
 */
public class InsertPage extends ModifyPage {

    public InsertPage(MainWindow mainFrm){
        super(mainFrm);
        setTitle("新增记录窗口");
        panel1.setVisible(false);
        jbUpdate.setText("插入");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == jcbDepartment){
            updateMajor();
        }
        else if(e.getSource() == jbCancel){
            parent.setVisible(true);
            this.dispose();
        }
        else if(e.getSource() == jbUpdate){
            getMajorDepart(); //获取专业和院部ID
            String no = jtfNo.getText().trim();
            String name = jtfName.getText().trim();
            String gender = jcbGender.getSelectedItem().toString();
            String status = jcbStatus.getSelectedItem().toString();

            // 提示学号为空
            if(no.equals("")){
                JOptionPane.showMessageDialog(null,
                        "学号不能为空", "提示",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String strIns = "INSERT INTO tbStudent(no, name, "
                    + "gender, status, departmentID, majorID)"
                    + "VALUES('" + no + "', '" + name + "', '"
                    + gender + "', '"  + status + "', '"
                    + departmentID + "', '" + majorID + "')";
            System.out.println(strIns);
            SqlHelper sh = null;
            try {
                sh = new SqlHelper();
            } catch (UnsupportedEncodingException ex) {
                throw new RuntimeException(ex);
            }
            if(sh.update(strIns))
                JOptionPane.showMessageDialog(null,
                        "记录已插入", "提示",
                        JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,
                        "记录插入失败", "提示",
                        JOptionPane.INFORMATION_MESSAGE);
            sh.close();
        }
    }

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertPage("新增记录窗口");
	}
	*/

}
