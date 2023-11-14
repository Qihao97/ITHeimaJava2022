package paragraph12.demo12_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.UnsupportedEncodingException;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:59 PM
 * @Descriptions: DeletePage
 */
public class DeletePage extends UpdatePage{

    public DeletePage(MainWindow mainFrm){
        super(mainFrm);
        setTitle("删除记录窗口");
        //设置控件为只读
        jtfNo.setEnabled(false);
        jtfName.setEnabled(false);
        jcbGender.setEnabled(false);
        jcbStatus.setEnabled(false);
        jcbDepartment.setEnabled(false);
        jcbMajor.setEnabled(false);

        jbUpdate.setText("删除");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbCancel){
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
        else if(e.getSource() == jbUpdate){
            String strDelete = "DELETE FROM tbStudent WHERE no = '"
                    + oldNo + "'";
            System.out.println(strDelete);

            SqlHelper sh = null;
            try {
                sh = new SqlHelper();
            } catch (UnsupportedEncodingException ex) {
                throw new RuntimeException(ex);
            }
            if(sh.update(strDelete))
            {
                JOptionPane.showMessageDialog(null,
                        "记录已删除", "提示",
                        JOptionPane.INFORMATION_MESSAGE);
                //清空内容
                jtfSearchValue.setText("");
                jtfNo.setText("");
                jtfName.setText("");
            }
            else
                JOptionPane.showMessageDialog(null,
                        "记录删除失败", "提示",
                        JOptionPane.INFORMATION_MESSAGE);
            sh.close();
        }
    }
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeletePage("删除记录窗口");
	}
	*/

}

