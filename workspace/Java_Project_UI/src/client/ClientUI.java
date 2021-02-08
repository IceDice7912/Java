package client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.TextArea;

public class ClientUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("나의 채팅");
		Panel p = new Panel();
		Color bgc = new Color(255, 235, 230);
		Button b1 = new Button("전송1");
		TextField tf = new TextField(20);
		TextArea ta = new TextArea();
		
		WindowListener fhandler = new MyFrameHandler();
		f.addWindowListener(fhandler);
		
		MyButtonHandler b1handler = new MyButtonHandler();
		b1handler.setTextArea(ta);
		b1handler.setTextField(tf);
		b1.addActionListener(b1handler);
		
		tf.addActionListener(b1handler);
		
		
//		ActionListener l = new MyButtonHandler();
//		b1.addActionListener(l);
		
//		Button b2 = new Button("전송2");
//		Button b3 = new Button("전송3");
//		Button b4 = new Button("전송4");
//		Button b5 = new Button("전송5");
		
//		GridLayout mgr = new GridLayout(2, 3); 역시 이건 영 별로 안좋다.
//		FlowLayout mgr = new FlowLayout();
//		f.setLayout(mgr);
		
//		f.add(b1,BorderLayout.CENTER);
//		f.add(b2,BorderLayout.NORTH);
//		f.add(b3,BorderLayout.SOUTH);
//		f.add(b4,BorderLayout.EAST);
//		f.add(b5,BorderLayout.WEST);
		
		
		f.add(ta,BorderLayout.CENTER);	
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
//		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		p.add(b5);
		
		f.setVisible(true);
		f.setSize(250, 200);
		f.setLocationRelativeTo(null);
		f.setBackground(bgc);
		
	}

}
	