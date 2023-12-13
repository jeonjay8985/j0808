package j0808;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam01 extends JFrame {
	exam01(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("메뉴 실습");
	    
	    Container c= getContentPane();
	    c.setLayout(new FlowLayout());
	    JLabel lbl = new JLabel("이 글자가 바뀝니다");
	    add(lbl);
	    JMenuBar menuBar = new JMenuBar();
	    
	    JMenu fileMenu = new JMenu("파일");
	    JMenu editMenu = new JMenu("편집");
	    
	    JMenuItem newItem = new JMenuItem("새 문서");
	    JMenuItem openItem = new JMenuItem("열기");
	    JMenuItem closeItem = new JMenuItem("닫기");
	    
	    newItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("[새 문서]를 선택했습니다");
				c.setBackground(Color.YELLOW);
			}
	    	
	    });
	    
	    
	    openItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("[열기]를 선택했습니다");
				c.setBackground(Color.GREEN);
			}
	    	
	    });
	    
	    closeItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);     //닫기
			}
	    	
	    	
	    });
	    
	    
	    setJMenuBar(menuBar);
	    menuBar.add(fileMenu);     //메뉴바에 메뉴를 부착!
	    menuBar.add(editMenu);
	    
	    fileMenu.add(newItem);
	    fileMenu.add(openItem);
	    fileMenu.addSeparator();   //분리선 추가!
	    fileMenu.add(closeItem);
	    
	    setSize(300, 200);
	    setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new exam01();
	}

}
