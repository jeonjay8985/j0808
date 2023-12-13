package j0808;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam05 extends JFrame{
	exam05(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 예제");
    	Container c = getContentPane();
    	c.setLayout(new FlowLayout());
    	
        JButton btn1=new JButton("노란색");
        add(btn1);
        
        btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				c.setBackground(Color.YELLOW);
			}
        	
        	
        });
 
       
        
        JButton btn2=new JButton("핑크색");
        add(btn2);
        
        btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				c.setBackground(Color.PINK);
			}
        	
        	
        });
 
        
    	setSize(300, 150);
    	setVisible(true);
	}

	public static void main(String[] args) {
		// swing실습 03
		
		new exam05();

	}

}
