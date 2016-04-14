package administrator;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import manage.SQLManage;

public class AinsertCheckFrame2 extends JFrame {
	
	private JTable jTable;
	private JButton jbBack;
	private SQLManage sqlManage;
	public AinsertCheckFrame2(String JFtitle){
		
		super(JFtitle);
		sqlManage = new SQLManage();
		this.init();
	}
	public void init(){
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setBounds(100, 100, 500, 400);
		
		jbBack = new JButton("�ر�");
		jTable = new JTable();
		Object name[] =  {"ְλ���","ְλ����","ְλ����","ְλ�ȼ�","��������"};
		Object query1Set[][] = null;		
		String sql = "select Occupation_no ,Occupation_name, Occupation_totality, Occupation_degree, Department_name from Department ,Occupation where Department.Department_no = Occupation.Department_no";
		int j = name.length;
		SQLManage myQueryManage = new SQLManage();
		query1Set = myQueryManage.query2(sql, j);
		jTable = new JTable(query1Set, name);
		
		Container container = this.getContentPane();
		container.add(new JScrollPane(jTable));
		container.add(jbBack);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		jbBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				new Amenu("����Ա�˵�");
				dispose();
			}
		});
	}
}
