package calculadora;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class main{
	public static void main (String[]args){
		
	
	String btnText [] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "." };	
		
	//INTERFACE
		//FRAME, TEXTBOX AND PANEL FOR BUTTONS
		JFrame frame=new JFrame();
		frame.setBounds(400,70, 530,560);
		frame.setLayout(null);//using no layout managers  
		frame.setVisible(true);//making the frame visible 
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panelForBtns = new JPanel();
		panelForBtns.setLayout(new GridLayout(4, 4, 50, 30));
		//panelForBtns.setBackground(Color.RED);
		panelForBtns.setBounds(0,120, 500,400);
		frame.add(panelForBtns);
		
		JTextField result = new JTextField();
		result.setBounds(0,0, 500,110);
		result.setHorizontalAlignment(JTextField.RIGHT);
		frame.add(result);
		
		//FRAME, TEXTBOX  AND PANEL FOR BUTTONS
		
		//BUTTONS
		int bx=5; int by=5; int bw=50; int bh=30;
		JButton[] numbersBtn = new JButton[16];
		System.out.println(numbersBtn.length);
		for (int i=0; i<numbersBtn.length; i++) {
			switch (i) {
			case 0:
				numbersBtn[i]=new JButton("7");
				break;
			case 1:
				numbersBtn[i]=new JButton("8");
				break;
				
			case 2:
				numbersBtn[i]=new JButton("9");
				break;
				
			case 3:
				numbersBtn[i]=new JButton("C");
				break;
				
			case 4:
				numbersBtn[i]=new JButton("4");
				break;
				
			case 5:
				numbersBtn[i]=new JButton("5");
				break;
				
			case 6:
				numbersBtn[i]=new JButton("6");
				break;
				
			case 7:
				numbersBtn[i]=new JButton("/");
				break;
				
			case 8:
				numbersBtn[i]=new JButton("1");
				break;
			case 9:
				numbersBtn[i]=new JButton("2");
				break;
			case 10:
				numbersBtn[i]=new JButton("3");
				break;
			case 11:
				numbersBtn[i]=new JButton("*");
				break;
				
			case 12:
				numbersBtn[i]=new JButton("0");
				break;
				
			case 13:
				numbersBtn[i]=new JButton("-");
				break;
				
			case 14:
				numbersBtn[i]=new JButton("+");
				break;
			case 15:
				numbersBtn[i]=new JButton("=");
				break;
			}
			/*numbersBtn[i].setBounds(bx,by, bw,bh);
			bx+=bw+5;*/
			panelForBtns.add(numbersBtn[i]);
			numbersBtn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("teclasajdnasj");
				}
			});
		}
		
		
	/*	for (int j=0; j<numbersBtn.length; j++) {
			numbersBtn[j].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					switch (j) {
					case 0:
						result.setText("7");
						break;
					case 1:
						numbersBtn[j]=new JButton("8");
						break;
						
					case 2:
						numbersBtn[j]=new JButton("9");
						break;
						
					case 3:
						numbersBtn[j]=new JButton("4");
						break;
						
					case 4:
						numbersBtn[j]=new JButton("5");
						break;
						
					case 5:
						numbersBtn[j]=new JButton("6");
						break;
						
					case 6:
						numbersBtn[j]=new JButton("1");
						break;
						
					case 7:
						numbersBtn[j]=new JButton("2");
						break;
						
					case 8:
						numbersBtn[j]=new JButton("3");
						break;
					case 9:
						numbersBtn[j]=new JButton("0");
						break;
					}
				}
				
			});
		}*/
		
		//BUTTONS
		
	//INTERFACE
	}

}
