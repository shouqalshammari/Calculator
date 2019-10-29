package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class calculator {

	private JFrame frame;
	private JTextField textField;
    char oprator;
    double firstnum ;
    double secondnum;
    double result;
    String Answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 238, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculator");
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 216, 49);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 175, 175));
		panel_1.setBounds(0, 49, 216, 295);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		//========== Raw1================
		JButton btn7 = new JButton("7");
		panel_1.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn7.getText();
				 textField.setText(EnterNum);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn8.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn8);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn9.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn9);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnp = new JButton("+");
		btnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
			    oprator='+';
			
			
			}
		});
		panel_1.add(btnp);
		btnp.setAutoscrolls(true);
		btnp.setFont(new Font("Tahoma", Font.BOLD, 16));
		//=========== Raw2 ================
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn4.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn4);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn5.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn5);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn6.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn6);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnS = new JButton("-");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
			    oprator='-';
			}
		});
		panel_1.add(btnS);
		btnS.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnS.setAutoscrolls(true);
		//===================== Raw3 ============================
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn1.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn1);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn2.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn2);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn3.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn3);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnM = new JButton("*");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstnum=Double.parseDouble(textField.getText());
			textField.setText("");
	        oprator='*';
	        
			}
		});
		panel_1.add(btnM);
		btnM.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnM.setAutoscrolls(true);
		//=================== Raw4 ==================================
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btn0.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btn0);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnD = new JButton(".");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNum=textField.getText()+btnD.getText();
				 textField.setText(EnterNum);
			}
		});
		panel_1.add(btnD);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnE = new JButton("=");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum=Double.parseDouble(textField.getText());
				switch(oprator)
		        {
		            case '+':
		                result = firstnum + secondnum;
		                Answer=String.format("%.2f",result);
		                  textField.setText(Answer);
		                break;
		            case '-':
		                result = firstnum - secondnum;
		                Answer=String.format("%.2f",result);
		                  textField.setText(Answer);
		                break;
		            case '*':
		                result = firstnum * secondnum;
		                Answer=String.format("%.2f",result);
		                  textField.setText(Answer);
		                break;
		            case '/':
		                result = firstnum / secondnum;
		                Answer=String.format("%.2f",result);
		                  textField.setText(Answer);
		                break;
		            // operator doesn't match any case constant (+, -, *, /)
		            default:
		                System.out.printf("Error! operator is not correct");
	                return;
                 
		    }}
		
			
		});
		panel_1.add(btnE);
		btnE.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnDv = new JButton("/");
		btnDv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				oprator='/';
			}
		});
		panel_1.add(btnDv);
		btnDv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDv.setAutoscrolls(true);
		
		JLabel label = new JLabel("");
		panel_1.add(label);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.PINK);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		panel_1.add(btnC);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel label_2 = new JLabel("");
		panel_1.add(label_2);
	}
}
