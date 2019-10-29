import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;
import javax.swing.Box;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Panel;

public class calculate extends JFrame {

	private Panel contentPane;
	
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate frame = new calculate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculate() {
		getContentPane().setLayout(null);
		
		JTextField textField = new JTextField();
		getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		setBounds(100, 100, 298, 515);
		contentPane = new Panel();
		contentPane.setForeground(Color.PINK);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton button = new JButton("7");
		panel.add(button);
		button.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			String EnterNumber= textField.getText() + button.getText();
	         textField.setText(EnterNumber);
			}
		});
		button.setBackground(Color.PINK);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_1 = new JButton("8");
		panel.add(button_1);
		button_1.setBackground(Color.PINK);
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_2 = new JButton("9");
		panel.add(button_2);
		button_2.setBackground(Color.PINK);
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_3 = new JButton("+");
		panel.add(button_3);
		button_3.setBackground(Color.PINK);
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_7 = new JButton("4");
		panel.add(button_7);
		button_7.setBackground(Color.PINK);
		button_7.setForeground(Color.BLACK);
		button_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_6 = new JButton("5");
		panel.add(button_6);
		button_6.setBackground(Color.PINK);
		button_6.setForeground(Color.BLACK);
		button_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_5 = new JButton("6");
		panel.add(button_5);
		button_5.setBackground(Color.PINK);
		button_5.setForeground(Color.BLACK);
		button_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_4 = new JButton("-");
		panel.add(button_4);
		button_4.setBackground(Color.PINK);
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_11 = new JButton("1");
		panel.add(button_11);
		button_11.setBackground(Color.PINK);
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_10 = new JButton("2");
		panel.add(button_10);
		button_10.setBackground(Color.PINK);
		button_10.setForeground(Color.BLACK);
		button_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_9 = new JButton("3");
		panel.add(button_9);
		button_9.setBackground(Color.PINK);
		button_9.setForeground(Color.BLACK);
		button_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_8 = new JButton("*");
		panel.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setBackground(Color.PINK);
		button_8.setForeground(Color.BLACK);
		button_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_15 = new JButton(".");
		panel.add(button_15);
		button_15.setBackground(Color.PINK);
		button_15.setForeground(Color.BLACK);
		button_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_14 = new JButton("0");
		panel.add(button_14);
		button_14.setBackground(Color.PINK);
		button_14.setForeground(Color.BLACK);
		button_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_13 = new JButton("=");
		panel.add(button_13);
		button_13.setBackground(Color.PINK);
		button_13.setForeground(Color.BLACK);
		button_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton button_12 = new JButton("/");
		panel.add(button_12);
		button_12.setBackground(Color.PINK);
		button_12.setForeground(Color.BLACK);
		button_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(1, 6, 0, 0));
		
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		setBounds(100, 100, 298, 515);

		
		JButton button_16 = new JButton("C");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setVerticalAlignment(SwingConstants.TOP);
		button_16.setForeground(Color.BLACK);
		button_16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		button_16.setBackground(Color.PINK);
		panel_1.add(button_16);
		
		
	}
}
