import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JTextField text1=new JTextField(7);
	JTextField text2=new JTextField(7);
	JLabel label=new JLabel();
public static void main(String[]args) {
	SimpleCalculator SC=new SimpleCalculator();
	SC.start();
}
void start(){
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(text1);
	panel.add(text2);
	panel.add(label);
	button1.setText("ADD");
	button2.setText("SUBTRACT");
	button3.setText("MULTIPLY");
	button4.setText("DIVISION");
	frame.setVisible(true);
	frame.setSize(420, 200);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	
}
int add(int x, int y) {
	int answer=x+y;
	return (answer);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==button1) {
String x=text1.getText();
int x2=Integer.parseInt(x);
String z=text2.getText();
int z2=Integer.parseInt(z);
int answer=add(x2, z2);
String answer2=String.valueOf(answer);
label.setText(answer2);
	}
	else if(buttonPressed==button2) {
		
	}
	else if(buttonPressed==button3) {

	}
	else if (buttonPressed==button4) {
		
	}
}
}
