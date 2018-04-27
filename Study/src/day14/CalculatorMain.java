package day14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new FrameCal();
	}

}

class FrameCal extends Frame{
	TextField tf_result;
	Button bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8,
			bt_9, bt_0,bt_sum, bt_sub, bt_div, bt_mul, bt_equal,
			bt_c;
	
	int num1, num2, res;
	char op;
	
	public FrameCal() {
		this.setFrame();
		this.setTextField();
		this.setButton();
		
		this.add(tf_result);
		
		this.add(bt_0);
		this.add(bt_1);
		this.add(bt_2);
		this.add(bt_3);
		this.add(bt_4);
		this.add(bt_5);
		this.add(bt_6);
		this.add(bt_7);
		this.add(bt_8);
		this.add(bt_9);
		this.add(bt_sum);
		this.add(bt_sub);
		this.add(bt_mul);
		this.add(bt_div);
		this.add(bt_equal);
		this.add(bt_c);
		
		
		ListenerCal listener = new ListenerCal(this);
		//프레임에서 윈도우와 관련된 이벤트가 발생하면 해당 이벤트를 동작시키기 위해서
		//listener와 연결
		this.addWindowListener(listener);
		this.bt_0.addActionListener(listener);
		this.bt_1.addActionListener(listener);
		this.bt_2.addActionListener(listener);
		this.bt_3.addActionListener(listener);
		this.bt_4.addActionListener(listener);
		this.bt_5.addActionListener(listener);
		this.bt_6.addActionListener(listener);
		this.bt_7.addActionListener(listener);
		this.bt_8.addActionListener(listener);
		this.bt_9.addActionListener(listener);
		this.bt_sum.addActionListener(listener);
		this.bt_sub.addActionListener(listener);
		this.bt_mul.addActionListener(listener);
		this.bt_div.addActionListener(listener);
		this.bt_equal.addActionListener(listener);
		this.bt_c.addActionListener(listener);
	
	}
	
	// 프레임의 기본설정 메소드
	private void setFrame() {
		this.setSize(330, 380);
		this.setLocation(200, 200);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	//텍스트 필드 컴포넌트 설정 메소드
	private void setTextField() {
		this.tf_result = new TextField();
		this.tf_result.setSize(290, 80);
		this.tf_result.setLocation(20, 40);
		this.tf_result.setEnabled(false);
		this.tf_result.setFont(new Font("Times",Font.BOLD,50));
		this.tf_result.setText("0");
	}
	
	//버튼 설정메소드
	private void setButton() {
		int gab = 10;
		int startX = 20;
		int startY = 40+80;
		int width = 50;
		int height = 50;
		
		bt_0 = new Button("0");
		bt_1 = new Button("1");
		bt_2 = new Button("2");
		bt_3 = new Button("3");
		bt_4 = new Button("4");
		bt_5 = new Button("5");
		bt_6 = new Button("6");
		bt_7 = new Button("7");
		bt_8 = new Button("8");
		bt_9 = new Button("9");
		bt_sum = new Button("+");
		bt_sub = new Button("-");
		bt_mul = new Button("*");
		bt_div = new Button("/");
		bt_equal = new Button("=");
		bt_c = new Button("C");
		
		
		bt_0.setSize(width*3+gab*2, height);
		bt_1.setSize(width, height);
		bt_2.setSize(width, height);
		bt_3.setSize(width, height);
		bt_4.setSize(width, height);
		bt_5.setSize(width, height);
		bt_6.setSize(width, height);
		bt_7.setSize(width, height);
		bt_8.setSize(width, height);
		bt_9.setSize(width, height);
	  bt_sum.setSize(width, height);
	  bt_sub.setSize(width, height);
	  bt_mul.setSize(width, height);
	  bt_div.setSize(width, height);
	bt_equal.setSize(width, height*3+gab*2);
	  bt_c.setSize(width, height);
		
		
		bt_7.setLocation(startX+width*0+gab*0, startY+height*0+gab*1);
		bt_8.setLocation(startX+width*1+gab*1, startY+height*0+gab*1);
		bt_9.setLocation(startX+width*2+gab*2, startY+height*0+gab*1);
	  bt_div.setLocation(startX+width*3+gab*3, startY+height*0+gab*1);
	    bt_c.setLocation(startX+width*4+gab*4, startY+height*0+gab*1);
		bt_4.setLocation(startX+width*0+gab*0, startY+height*1+gab*2);
		bt_5.setLocation(startX+width*1+gab*1, startY+height*1+gab*2);
		bt_6.setLocation(startX+width*2+gab*2, startY+height*1+gab*2);
	  bt_mul.setLocation(startX+width*3+gab*3, startY+height*1+gab*2);
	bt_equal.setLocation(startX+width*4+gab*4, startY+height*1+gab*2);
		bt_1.setLocation(startX+width*0+gab*0, startY+height*2+gab*3);
		bt_2.setLocation(startX+width*1+gab*1, startY+height*2+gab*3);
		bt_3.setLocation(startX+width*2+gab*2, startY+height*2+gab*3);
	  bt_sub.setLocation(startX+width*3+gab*3, startY+height*2+gab*3);
		bt_0.setLocation(startX+width*0+gab*0, startY+height*3+gab*4);
	  bt_sum.setLocation(startX+width*3+gab*3, startY+height*3+gab*4);
				
	}
	
}

class ListenerCal implements WindowListener, ActionListener{
	FrameCal frame;
	
	public ListenerCal(FrameCal frame) {
		this.frame = frame;
	}
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}

	// 프레임 닫기
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
			this.ButtonListener((Button)e.getSource());
		}
	}
	private void ButtonListener(Button bt) {
		//System.out.println(frame.tf_result.getText());
		Integer inputNum;
		
		try {
			inputNum = Integer.parseInt(bt.getLabel());
			//0~9까지의 숫자 버튼을 눌렀을 때
			if(this.frame.tf_result.getText().equals("0")) {
					this.frame.tf_result.setText(inputNum.toString());
			}
			else
			{	//숫자 이어 붙이기
				if(!(this.isOperation(frame.op))) {
					if(this.frame.tf_result.getText().length() < 9) {
						this.frame.tf_result.setText(
								this.frame.tf_result.getText()+
								inputNum.toString());
					}
				}
				else
				{
					if(frame.num2 == 0) {
						this.frame.tf_result.setText(inputNum.toString());
						frame.num2 = inputNum;
					}
					else 
					{
						this.frame.tf_result.setText(
								this.frame.tf_result.getText()+
								inputNum.toString());
					}
				}
			}
			
		}catch(Exception e) {
			//연산자일 경우
			//if((bt.getLabel().equals("C"))) {
				
			//}else 
			if(isOperation(bt.getLabel().charAt(0))) {
				if(isOperation(frame.op)) {
					frame.num2 = Integer.parseInt(frame.tf_result.getText());
					frame.tf_result.setText(this.Cal());
					
				}
				else {
					frame.num1 = Integer.parseInt(frame.tf_result.getText());
				}
				frame.op = bt.getLabel().charAt(0); //연산자 덮어쓰기
				
			}
			// = 이 입력되면
			else{
				frame.num1 = Integer.parseInt(frame.tf_result.getText());	
			}
			System.out.println(frame.num1);
			System.out.println(bt.getLabel().charAt(0));
		}
		
	}
	
	private boolean isOperation(char ch) {
		switch(ch) {
		case '+': case '-':	case '*': case '/':
			return true;
		default:
			return false;
		}
	}
	
	private String Cal() {
		switch(frame.op) {
		case '+':
			frame.res = frame.num1 + frame.num2;
			break;
		case '-':
			frame.res = frame.num1 - frame.num2;
			break;
		case '*':
			frame.res = frame.num1 * frame.num2;
			break;
		case '/':
			frame.res = frame.num1 / frame.num2;
			break;
		}
		frame.num1 = frame.res;
		frame.num2 = 0;
		Integer ires = frame.res;
		return ires.toString();
	}
	
	
	
}