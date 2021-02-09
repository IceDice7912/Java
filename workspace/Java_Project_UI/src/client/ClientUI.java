
package client;

import java.awt.*;
import java.awt.event.*;

public class ClientUI {
	TextArea ta;
	TextField tf;	
	
	public void chatMsg() {
		String msg=tf.getText();
		ta.append(msg+"\n");
		tf.setText("");
	}
	
	public void onCreate() {
		Frame f=new Frame("나의 채팅");
		Panel p=new Panel();
		Button b1=new Button("전송1");
		 tf=new TextField(20);
		 ta=new TextArea();			 
		 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
					
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 하고 싶은 일
				chatMsg();
			}
			
		});
		
			
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chatMsg();
				
			}
		});
		

		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		
		p.setBackground(Color.gray);
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		ClientUI ui=new ClientUI();
		ui.onCreate();
	}//end main
	
	
	
	


}//end ClientUi