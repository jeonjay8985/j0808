package j0808;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam03 extends JFrame {
	exam03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("라디오");
		
		Container c=getContentPane();
		   c.setLayout(new FlowLayout());
		
		JLabel lbl1 = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		add(lbl1);
		
		JRadioButton rdo1 = new JRadioButton("Small Size");
	 	JRadioButton rdo2 = new JRadioButton("Medium Size");
	 	JRadioButton rdo3 = new JRadioButton("Large Size");
	 	   
	 	add(rdo1);
	 	add(rdo2);
	 	add(rdo3);

	 	JLabel lbl2 = new JLabel("크기가 선택되지 않았습니다");
		add(lbl2);
		lbl2.setForeground(Color.red);

		
	 	rdo1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		     lbl2.setText("small크기가 선택되었습니다");
	
			}
	 		
	 	});
	 	
	 	rdo2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 lbl2.setText("Medium크기가 선택되었습니다");
			}
	 		
	 	});
	 	
	 	rdo3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl2.setText("Large크기가 선택되었습니다");
			}
	 		
	 	});
	 	
	 	
	 	ButtonGroup grp1 = new ButtonGroup();   //라디오버튼은 그룹을 생성해야함!
	 	grp1.add(rdo1);
	 	grp1.add(rdo2);
	 	grp1.add(rdo3);	 	
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// swing실습 - 01'
		new exam03();
	

	}

}
