package day14;

import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class GUI_AWT_Main {

	public static void main(String[] args) {


		new FrameEx1();
	}

}

class FrameEx1 extends Frame{
	Button button_ok, button_cancel;
	Panel p;
	
	public FrameEx1() {
		this.setFrame();
		p = new Panel();
		this.setButton();
		
		ListenerEx1 listener = new ListenerEx1(this);
		this.addWindowListener(listener);
		this.button_ok.addActionListener(listener);
		this.button_cancel.addActionListener(listener);
	}
	
	
	public void setFrame() {
		this.setSize(500, 400);
		this.setLayout(new GridLayout());
		this.setVisible(true);
		this.setLocation(100, 100);
		
	}
	
	public void setButton() {
		button_ok = new Button("확인");
		button_cancel = new Button("취소");
		
		this.p.add(button_ok);
		this.p.add(button_cancel);
		this.add(p);

	}
}

class ListenerEx1 implements WindowListener, ActionListener{
	FrameEx1 frame;
	public ListenerEx1(FrameEx1 frame) {
		this.frame = frame;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("종료합니다.");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		if(e.getSource() instanceof Button) {
			Button button = (Button) e.getSource();
			this.buttonListener(button);
		}
	}
	
	public void buttonListener(Button button) {
		if(button.getLabel().equals("확인"))
			System.out.println("확인버튼 클릭");
		else if(button.getLabel().equals("취소"))
			System.out.println("취소버튼 클릭");
	}
}