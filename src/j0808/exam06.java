package j0808;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam06 extends JFrame{
	exam06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("단추 시험");
		
		Container c= getContentPane();
	    c.setLayout(new FlowLayout());
	    c.setBackground(Color.cyan);
		
	    JButton btn1 = new JButton("확인");
	    add(btn1);
	    JButton btn2 = new JButton("취소");
	    add(btn2);
	    
	    JLabel lbl = new JLabel(" ");
	    add(lbl);
	    
	    btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("확인 단추가 눌러졌습니다");
				
			}
	    	
	    });
	    
	    btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("취소 단추가 눌러졌습니다");
			}
	    	
	    });
	    
		setSize(280, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		// swing실습 04
		new exam06();

	}

}
