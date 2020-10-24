package kz.el.calc3;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer a;
	private String b;
	private String c;
	
	ArrayList<Integer> list = new ArrayList<Integer>(2);

	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setSize(360, 360);
		getContentPane().setLayout(null);
		
		list.add(0);
		list.add(0);
		
		JLabel lblFirst = new JLabel("First:");
		lblFirst.setBounds(10, 11, 46, 14);
		getContentPane().add(lblFirst);
		
		JLabel lblSecond = new JLabel("Second:");
		lblSecond.setBounds(10, 36, 46, 14);
		getContentPane().add(lblSecond);
		
		JLabel lblResonse = new JLabel("Resonse:");
		lblResonse.setBounds(198, 11, 58, 39);
		getContentPane().add(lblResonse);
		
		JButton button = new JButton("+");
		button.setBounds(254, 84, 58, 36);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(254, 131, 58, 36);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.setBounds(254, 178, 58, 34);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.setBounds(254, 223, 58, 34);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("1");
		button_4.addActionListener(e -> list.add(1));
		button_4.setBounds(18, 84, 58, 36);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("2");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					list.set(0, 2);
					
				
			}
		});
		button_5.setBounds(86, 84, 58, 36);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.setBounds(153, 84, 58, 36);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.setBounds(18, 131, 58, 36);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.setBounds(86, 131, 58, 36);
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.setBounds(153, 131, 58, 36);
		getContentPane().add(button_9);
		
		JButton button_10 = new JButton("7");
		button_10.setBounds(18, 178, 58, 34);
		getContentPane().add(button_10);
		
		JButton button_11 = new JButton("8");
		button_11.setBounds(86, 178, 58, 34);
		getContentPane().add(button_11);
		
		JButton button_12 = new JButton("9");
		button_12.setBounds(153, 178, 58, 34);
		getContentPane().add(button_12);
		
		JButton button_13 = new JButton("0");
		button_13.setBounds(86, 223, 58, 34);
		getContentPane().add(button_13);
		a = list.get(0);
		System.out.println(a);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(a);
		formattedTextField.setBounds(85, 8, 70, 20);
		getContentPane().add(formattedTextField);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(list.get(0));
			}
		});
		button_14.setBounds(254, 268, 58, 34);
		getContentPane().add(button_14);
		
		JLabel lblElPrograms = new JLabel("El programs");
		lblElPrograms.setBounds(86, 288, 58, 14);
		getContentPane().add(lblElPrograms);
		

		
		setVisible(true);
		
		
		
	}
}
