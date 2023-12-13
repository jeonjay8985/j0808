package j0808;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam04 extends JFrame{
	exam04(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("제곱 계산하기");
    	Container c = getContentPane();
    	c.setLayout(new FlowLayout());
    	
    	JLabel lbl1 = new JLabel("숫자입력:");
		add(lbl1);
    	
    	JTextField txt = new JTextField(15);
    	add(txt);
    	JLabel lbl2 = new JLabel("제곱한값:");
		add(lbl2);
    	
    	JTextField result = new JTextField(15); 
        add(result);
    	txt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			 String num=txt.getText();
			 int soo=Integer.parseInt(num);
			 int n=soo*soo;
			 String re=Integer.toString(n);
			 result.setText(re);
			}
    		
    	});
    	
        
   
        JButton btn1=new JButton("OK");
        add(btn1);
        btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
        
    	setSize(300, 150);
    	setVisible(true);
	}

	public static void main(String[] args) {
		// swing실습 02
		new exam04();

	}
}
