package j0808;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam02 extends JFrame{
	exam02(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("툴바 실습");
		
		Container c= getContentPane();
	    c.setLayout(new FlowLayout());
		
	    JToolBar toolBar = new JToolBar();
	    
	    JButton newItem = new JButton("새 문서");
	    JButton openItem = new JButton("열기");
	    JButton closeItem = new JButton(new ImageIcon("images/exit.png"));
	    
	    add(toolBar, BorderLayout.NORTH);
	    
	    toolBar.add(newItem);
	    toolBar.add(openItem);
	    toolBar.addSeparator(new Dimension(20, 10));    //분리선 추가!
	    toolBar.add(closeItem);
	    
	    JLabel lbl = new JLabel("이 글자가 바뀝니다");
	    add(lbl);
	    newItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("[새 문서]가 선택되었습니다");
			}
	    	
	    });
	    
	    openItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("[열기]가 선택되었습니다");
			}
	    	
	    });
	    
	    
	    closeItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
	    	
	    });
	    
	    
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new exam02();
	}

}
