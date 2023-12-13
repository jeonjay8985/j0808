package j0808;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam07 extends JFrame {
	exam07(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("Menu에 Action 리...");
	    
	    Container c= getContentPane();
	    //c.setLayout(new FlowLayout());         //null로 설정하니까 글자 안보임
	    
	    JLabel lbl = new JLabel("Hello");
	    
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        add(lbl,BorderLayout.CENTER);           //setLayout-FlowLayout 취소

	    JMenuBar menuBar = new JMenuBar();
	    JMenu Menu1 = new JMenu("Text");

	    
	    JMenuItem Item1 = new JMenuItem("Color");
	    JMenuItem Item2 = new JMenuItem("Font");
	    JMenuItem Item3 = new JMenuItem("Top");
	    JMenuItem Item4 = new JMenuItem("Bottom");
	    
	    Item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("Hello");
			    lbl.setForeground(Color.blue);
			}
	    	
	    });
	    
	    
	    Item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("Hello");
				lbl.setForeground(Color.blue);
				lbl.setFont(new Font("MV Boli", Font.BOLD, 30)); 
			}
	    	
	    });
	    
	    Item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("Hello");
				lbl.setForeground(Color.blue);
				lbl.setVerticalAlignment(SwingConstants.TOP);
				lbl.setFont(new Font("MV Boli", Font.BOLD, 30)); //글자체, 효과, 크기
			

			}
	    	
	    });
	    
	    Item4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("Hello");
				lbl.setForeground(Color.blue);
				lbl.setVerticalAlignment(SwingConstants.BOTTOM);
				lbl.setFont(new Font("MV Boli", Font.BOLD, 30)); 
			}
	    	
	    });
	    
	    
	   
	    setJMenuBar(menuBar);
	    menuBar.add(Menu1);     //메뉴바에 메뉴를 부착!

	    Menu1.add(Item1);       //메뉴에 아이템을 부착!
	    Menu1.add(Item2);
	    Menu1.add(Item3);
	    Menu1.add(Item4);
	
	    setSize(300, 300);
	    setVisible(true);
	}

	public static void main(String[] args) {
		// swing실습 05
		new exam07();

	}

}
