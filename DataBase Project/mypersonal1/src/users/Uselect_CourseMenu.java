package users;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Uselect_CourseMenu extends JFrame{
	
	private JButton jButtonCheck ;
	private JButton jButtonSelect;
	private String employeeNo;
	private JButton jBack;
	
	public Uselect_CourseMenu(String FTitle,String employeeNo){
		
		super(FTitle);
		this.employeeNo = employeeNo;
		this.init();
	}
	public void init(){
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setBounds(100, 100, 200, 250);
		
		jButtonCheck = new JButton("Ա��ѡ�β�ѯ");
		jButtonSelect = new JButton("Ա��ѡ��");
		jBack = new JButton("����");
		
		Container container = this.getContentPane();
		container.add(jButtonCheck);
		container.add(jButtonSelect);
		container.add(jBack);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		jButtonCheck.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new USelect_CourseInforframe("ѡ�β�ѯ",employeeNo);
			}
		});
		
		jButtonSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new UselectCourseFrame("�û�ѡ��", employeeNo);
				dispose();
			}
		});
		jBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new UMenu("Ա���˵�",employeeNo);
			}
		});
	}
}
