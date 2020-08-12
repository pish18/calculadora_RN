package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class calculator_interface extends JFrame {

	private JPanel contentPane;
	private JTextField result;
	float resultOne = 0, resultTwo, finalResult;
	char operator;
	private JTextField lastNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_interface frame = new calculator_interface();
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
	public calculator_interface() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setForeground(new Color(0, 0, 51));
		backgroundPanel.setBackground(new Color(0, 0, 51));
		backgroundPanel.setBounds(0, 0, 436, 371);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		

		result = new JTextField();
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 24));
		result.setBounds(10, 37, 414, 57);
		backgroundPanel.add(result);
		result.setColumns(10);
		

		lastNumber = new JTextField();
		lastNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lastNumber.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 20));
		lastNumber.setColumns(10);
		lastNumber.setBounds(10, 11, 414, 25);
		backgroundPanel.add(lastNumber);
		
		JButton zeroBtn = new JButton("0");
		zeroBtn.setBackground(new Color(153, 204, 204));
		zeroBtn.setForeground(new Color(0, 0, 0));
		zeroBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		zeroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"0");
				System.out.println("sdajsd");
			}
		});
		
		JButton oneBtn = new JButton("1");
		oneBtn.setBackground(new Color(153, 204, 204));
		oneBtn.setForeground(new Color(0, 0, 0));
		oneBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		oneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"1");
			}
		});
		oneBtn.setBounds(38, 264, 89, 42);
		backgroundPanel.add(oneBtn);
		
		JButton twoBtn = new JButton("2");
		twoBtn.setBackground(new Color(153, 204, 204));
		twoBtn.setForeground(new Color(0, 0, 0));
		twoBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		twoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"2");
			}
		});
		twoBtn.setBounds(137, 264, 89, 42);
		backgroundPanel.add(twoBtn);
		

		JButton threeBtn = new JButton("3");
		threeBtn.setBackground(new Color(153, 204, 204));
		threeBtn.setForeground(new Color(0, 0, 0));
		threeBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		threeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"3");
			}
		});
		threeBtn.setBounds(236, 264, 89, 42);
		backgroundPanel.add(threeBtn);
		
		
		JButton fourBtn = new JButton("4");
		fourBtn.setBackground(new Color(153, 204, 204));
		fourBtn.setForeground(new Color(0, 0, 0));
		fourBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		fourBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"4");
			}
		});
		fourBtn.setBounds(38, 211, 89, 42);
		backgroundPanel.add(fourBtn);
		
		JButton fiveBtn = new JButton("5");
		fiveBtn.setBackground(new Color(153, 204, 204));
		fiveBtn.setForeground(new Color(0, 0, 0));
		fiveBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		fiveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"5");
			}
		});
		fiveBtn.setBounds(137, 211, 89, 42);
		backgroundPanel.add(fiveBtn);
		
		JButton sixBtn = new JButton("6");
		sixBtn.setBackground(new Color(153, 204, 204));
		sixBtn.setForeground(new Color(0, 0, 0));
		sixBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		sixBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"6");
			}
		});
		sixBtn.setBounds(236, 211, 89, 42);
		backgroundPanel.add(sixBtn);
		

		JButton sevenBtn = new JButton("7");
		sevenBtn.setBackground(new Color(153, 204, 204));
		sevenBtn.setForeground(new Color(0, 0, 0));
		sevenBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		sevenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText(result.getText()+"7");
			}
		});
		sevenBtn.setBounds(38, 158, 89, 42);
		backgroundPanel.add(sevenBtn);
		
		
		JButton eightBtn = new JButton("8");
		eightBtn.setBackground(new Color(153, 204, 204));
		eightBtn.setForeground(new Color(0, 0, 0));
		eightBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		eightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"8");
			}
		});
		eightBtn.setBounds(137, 158, 89, 42);
		backgroundPanel.add(eightBtn);
		

		JButton nineBtn = new JButton("9");
		nineBtn.setBackground(new Color(153, 204, 204));
		nineBtn.setForeground(new Color(0, 0, 0));
		nineBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		nineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"9");
			}
		});
		nineBtn.setBounds(236, 158, 89, 42);
		backgroundPanel.add(nineBtn);
		
		JButton pointBtn = new JButton(".");
		pointBtn.setBackground(new Color(153, 204, 204));
		pointBtn.setForeground(new Color(0, 0, 0));
		pointBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		pointBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+".");
			}
		});
		pointBtn.setBounds(236, 317, 89, 42);
		backgroundPanel.add(pointBtn);
		
		
		zeroBtn.setBounds(137, 317, 89, 42);
		backgroundPanel.add(zeroBtn);
		
		JButton multiBtn = new JButton("x");
		multiBtn.setBackground(new Color(153, 204, 204));
		multiBtn.setForeground(new Color(0, 0, 0));
		multiBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		multiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultOne= Float.parseFloat(result.getText());
				System.out.println(operator);
				result.setText("");
				operator='x';
				lastNumber.setText(Float.toString(resultOne) + operator);
			}
		});
		multiBtn.setBounds(335, 158, 89, 42);
		backgroundPanel.add(multiBtn);
		
		JButton subtBtn = new JButton("-");
		subtBtn.setBackground(new Color(153, 204, 204));
		subtBtn.setForeground(new Color(0, 0, 0));
		subtBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		subtBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultOne= Float.parseFloat(result.getText());
				System.out.println(operator);
				result.setText("");
				operator='-';
				lastNumber.setText(Float.toString(resultOne) + operator);
			}
		});
		subtBtn.setBounds(335, 211, 89, 42);
		backgroundPanel.add(subtBtn);
		
		JButton sumBtn = new JButton("+");
		sumBtn.setBackground(new Color(153, 204, 204));
		sumBtn.setForeground(new Color(0, 0, 0));
		sumBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		sumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultOne= Float.parseFloat(result.getText());
				System.out.println(operator);
				result.setText("");
				operator='+';
				lastNumber.setText(Float.toString(resultOne) + operator);
			}
		});
		sumBtn.setBounds(335, 264, 89, 42);
		backgroundPanel.add(sumBtn);
		
		JButton divBtn = new JButton("/");
		divBtn.setBackground(new Color(153, 204, 204));
		divBtn.setForeground(new Color(0, 0, 0));
		divBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		divBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultOne= Float.parseFloat(result.getText());
				System.out.println(operator);
				result.setText("");
				operator='/';
				lastNumber.setText(Float.toString(resultOne) + operator);
			}
		});
		divBtn.setBounds(335, 105, 89, 42);
		backgroundPanel.add(divBtn);
		
		JButton equalBtn = new JButton("=");
		equalBtn.setBackground(new Color(153, 204, 204));
		equalBtn.setForeground(new Color(0, 0, 0));
		equalBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		equalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultTwo= Float.parseFloat(result.getText());
				operation();
				lastNumber.setText(Float.toString(resultOne) + operator + Float.toString(resultTwo));
			}
		});
		equalBtn.setBounds(335, 317, 89, 42);
		backgroundPanel.add(equalBtn);
		
		JButton eraseBtn = new JButton("C");
		eraseBtn.setBackground(new Color(153, 204, 204));
		eraseBtn.setForeground(new Color(0, 0, 0));
		eraseBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		eraseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String deleteStr=result.getText();
				if (deleteStr != null && deleteStr.length() > 0) {
					deleteStr = deleteStr.substring(0, deleteStr.length() - 1);
			    }
				System.out.println(deleteStr);
				
			}
		});
		eraseBtn.setBounds(236, 105, 89, 42);
		backgroundPanel.add(eraseBtn);
		
		JButton eraseAllBtn = new JButton("CE");
		eraseAllBtn.setBackground(new Color(153, 204, 204));
		eraseAllBtn.setForeground(new Color(0, 0, 0));
		eraseAllBtn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		eraseAllBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				lastNumber.setText("");
			}
		});
		eraseAllBtn.setBounds(137, 105, 89, 42);
		backgroundPanel.add(eraseAllBtn);
		
		
	}
	
	public void operation() {
		switch(operator) {
		case '+':
			finalResult=resultOne+resultTwo;
			result.setText(Float.toString(finalResult));
			break;
		case '-':
			finalResult=resultOne-resultTwo;
			result.setText(Float.toString(finalResult));
			break;
		case 'x':
			finalResult=resultOne*resultTwo;
			result.setText(Float.toString(finalResult));
			break;
		case '/':
			finalResult=resultOne/resultTwo;
			result.setText(Float.toString(finalResult));
			break;
		case '=':
			result.setText(Float.toString(finalResult));
			break;
		}
	}
}
