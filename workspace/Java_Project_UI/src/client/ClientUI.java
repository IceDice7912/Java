package client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
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
		Panel p2 = new Panel();
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
		
		GridLayout mgr = new GridLayout(3, 3);
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
		f.setSize(1280, 720);
		f.setLocationRelativeTo(null);
		f.setBackground(bgc);
		
		f.add(p2,BorderLayout.EAST);
		p2.setLayout(mgr);
		Button p2b = new Button("버어트은");
		Checkbox p2che = new Checkbox("사용자가 보기에 편리합니까?");
		Choice p2cho = new Choice();
		p2cho.add("A"); p2cho.add("B"); p2cho.add("C");
		p2cho.add("D"); p2cho.add("E"); p2cho.add("F");
		Label p2la = new Label("라벨 공간");
		List p2l = new List();
		p2l.add("ㄱ"); p2l.add("ㄴ"); p2l.add("ㄷ");
		p2l.add("ㄹ"); p2l.add("ㅁ"); p2l.add("ㅂ");
		TextField p2tf = new TextField();
		TextArea p2ta = new TextArea();
		Scrollbar p2sb = new Scrollbar();
		Canvas p2cv = new Canvas();
		p2.add(p2b);
		p2.add(p2che);
		p2.add(p2cho);
		p2.add(p2la);
		p2.add(p2l);
		p2.add(p2tf);
		p2.add(p2ta);
		p2.add(p2sb);
		p2.add(p2cv);
	}

}
	