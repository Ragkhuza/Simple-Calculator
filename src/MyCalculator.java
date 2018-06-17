import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPopupMenu;

public class MyCalculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;
	private static double ans;
	/**
	 * @wbp.nonvisual location=132,329
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator window = new MyCalculator();
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
	public MyCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setTitle("My Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(40, 36, 210, 37);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(329, 36, 210, 37);
		frame.getContentPane().add(textFieldNum2);
		
		//Addition button
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			int num1, num2, ans;
			public void actionPerformed(ActionEvent arg0) {
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 + num2;
					
					textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		add.setBounds(75, 85, 150, 44);
		frame.getContentPane().add(add);
		
		//Subtract button
		JButton sub = new JButton("SUBTRACT");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 - num2;
					
					textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		sub.setBounds(360, 84, 150, 44);
		frame.getContentPane().add(sub);
		
		//Multiplication button
		JButton mul = new JButton("Multiply");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try{
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 * num2;
					
					textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
			}
		});
		mul.setBounds(75, 155, 150, 44);
		frame.getContentPane().add(mul);

		//Division button
		JButton div = new JButton("Divide");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, remainder;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					remainder = num1 % num2;
					ans = num1 / num2;
					
					textFieldAns.setText(Double.toString(ans));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		div.setBounds(360, 155, 150, 44);
		frame.getContentPane().add(div);
		
		//Binary button
		JButton bin = new JButton("To Binary");
		bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textFieldAns.setText(Integer.toBinaryString(Integer.parseInt(textFieldAns.getText())));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Can't convert to binary");
				}
			}
		});
		bin.setBounds(409, 202, 77, 23);
		frame.getContentPane().add(bin);
		
		//Hexa Button
		JButton hexa = new JButton("To Hexa");
		hexa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textFieldAns.setText(Integer.toHexString(Integer.parseInt(textFieldAns.getText())));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Can't Convert to Hexa");
				}
			}
		});
		hexa.setBounds(409, 224, 77, 23);
		frame.getContentPane().add(hexa);
		
		//Clear button
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldAns.setText(null);
				textFieldNum2.setText(null);
				textFieldNum1.setText(null);
			}
		});
		clear.setBounds(247, 125, 89, 23);
		frame.getContentPane().add(clear);
		
		//Octa button
		JButton octa = new JButton("To Octa");
		octa.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				try {
					textFieldAns.setText(Integer.toOctalString(Integer.parseInt(textFieldAns.getText())));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		octa.setBounds(496, 210, 77, 23);
		frame.getContentPane().add(octa);
		
		textFieldAns = new JTextField();
		textFieldAns.setColumns(10);
		textFieldAns.setBounds(194, 210, 210, 37);
		frame.getContentPane().add(textFieldAns);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(58, 208, 126, 37);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
