package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField txtDisplay;
	
	
	double num1, num2;
	double total;
	
	String operation = "plus";
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 323, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBackground(Color.LIGHT_GRAY);
		txtDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtDisplay.setEditable(false);
		txtDisplay.setBounds(8, 11, 289, 40);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton buttonApagar = new JButton("<");
		buttonApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonApagar.setBackground(Color.WHITE);
		buttonApagar.setFont(new Font("Arial Black", Font.PLAIN, 26));
		buttonApagar.setBounds(8, 62, 65, 54);
		frame.getContentPane().add(buttonApagar);
		
		JButton buttonZerarTudo = new JButton("C");
		buttonZerarTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
				num1 = 0;
				num2 = 0;
			}
		});
		buttonZerarTudo.setFont(new Font("Arial Black", Font.PLAIN, 26));
		buttonZerarTudo.setBackground(Color.WHITE);
		buttonZerarTudo.setBounds(82, 62, 65, 54);
		frame.getContentPane().add(buttonZerarTudo);
		
		JButton buttonPocentagem = new JButton("%");
		buttonPocentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "5";
			}
		});
		buttonPocentagem.setFont(new Font("Arial Black", Font.PLAIN, 26));
		buttonPocentagem.setBackground(Color.WHITE);
		buttonPocentagem.setBounds(157, 62, 65, 54);
		frame.getContentPane().add(buttonPocentagem);
		
		JButton buttonSomar = new JButton("+");
		buttonSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "1";
			}
		});
		buttonSomar.setFont(new Font("Arial Black", Font.PLAIN, 26));
		buttonSomar.setBackground(Color.WHITE);
		buttonSomar.setBounds(232, 62, 65, 54);
		frame.getContentPane().add(buttonSomar);
		
		JButton buttonDividir = new JButton("/");
		buttonDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(txtDisplay.getText());
					txtDisplay.setText("");
					operation = "3";
			}
		});
		buttonDividir.setFont(new Font("Arial Black", Font.PLAIN, 26));
		buttonDividir.setBackground(Color.WHITE);
		buttonDividir.setBounds(232, 131, 65, 54);
		frame.getContentPane().add(buttonDividir);
		
		JButton buttonMultiplicar = new JButton("X");
		buttonMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "4";
			}
		});
		buttonMultiplicar.setFont(new Font("Arial Black", Font.PLAIN, 26));
		buttonMultiplicar.setBackground(Color.WHITE);
		buttonMultiplicar.setBounds(232, 196, 65, 54);
		frame.getContentPane().add(buttonMultiplicar);
		
		JButton buttonDiminuir = new JButton("-");
		buttonDiminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "2";
				
			}
		});
		buttonDiminuir.setFont(new Font("Arial Black", Font.PLAIN, 26));
		buttonDiminuir.setBackground(Color.WHITE);
		buttonDiminuir.setBounds(232, 261, 65, 54);
		frame.getContentPane().add(buttonDiminuir);
		
		JButton buttonTotal = new JButton("=");
		buttonTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(txtDisplay.getText());
				switch(operation)
				{
				case "1":
					double t = num1 + num2;
					txtDisplay.setText(Double.toString(t));
					break;
										
					case "2":
						double a = num1 - num2;
						txtDisplay.setText(Double.toString(a));
						break;
						
					case "3":
						double d = num1 / num2;
						txtDisplay.setText(Double.toString(d));
						break;
						
					case "4":
						double m = num1 * num2;
						txtDisplay.setText(Double.toString(m));
						break;
						
					case "5":
						double p = num1 * num2 / 100;
						txtDisplay.setText(Double.toString(p));
						break;
					}	
						
				}	
				
			
		});
		buttonTotal.setForeground(Color.BLUE);
		buttonTotal.setFont(new Font("Arial Black", Font.PLAIN, 26));
		buttonTotal.setBackground(Color.LIGHT_GRAY);
		buttonTotal.setBounds(232, 326, 65, 54);
		frame.getContentPane().add(buttonTotal);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_9.getText());
			}
		});
		button_9.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(155, 131, 65, 54);
		frame.getContentPane().add(button_9);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_8.getText());
			}
		});
		button_8.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(81, 131, 65, 54);
		frame.getContentPane().add(button_8);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_7.getText());
			}
		});
		button_7.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(8, 131, 65, 54);
		frame.getContentPane().add(button_7);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_6.getText());
			}
		});
		button_6.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(155, 196, 65, 54);
		frame.getContentPane().add(button_6);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_5.getText());
			}
		});
		button_5.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(81, 196, 65, 54);
		frame.getContentPane().add(button_5);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_4.getText());
			}
		});
		button_4.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(8, 196, 65, 54);
		frame.getContentPane().add(button_4);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_3.getText());
			}
		});
		button_3.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(157, 261, 65, 54);
		frame.getContentPane().add(button_3);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_2.getText());
			}
		});
		button_2.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(83, 261, 65, 54);
		frame.getContentPane().add(button_2);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_1.getText());
				
				
			}
		});
		button_1.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(8, 261, 65, 54);
		frame.getContentPane().add(button_1);
		
		JButton button_Virgula = new JButton(",");
		button_Virgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		button_Virgula.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_Virgula.setBackground(Color.WHITE);
		button_Virgula.setBounds(157, 326, 65, 54);
		frame.getContentPane().add(button_Virgula);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_0.getText());
			}
		});
		button_0.setFont(new Font("Arial Black", Font.PLAIN, 26));
		button_0.setBackground(Color.WHITE);
		button_0.setBounds(83, 326, 65, 54);
		frame.getContentPane().add(button_0);
		
		JButton plusminusBtn = new JButton("+/-");
		plusminusBtn.setFont(new Font("Candara", Font.PLAIN, 22));
		plusminusBtn.setBackground(Color.WHITE);
		plusminusBtn.setBounds(8, 326, 65, 54);
		frame.getContentPane().add(plusminusBtn);
		
		
	}
}
