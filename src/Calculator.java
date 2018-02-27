import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JTextField text1 = new JTextField(7);
	JTextField text2 = new JTextField(7);
	JLabel label = new JLabel();

	public static void main(String[] args) {
		Calculator C = new Calculator();
		C.start();
	}

	void start() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(text1);
		panel.add(text2);
		panel.add(label);
		button1.setText("ADD");
		button2.setText("SUBTRACT");
		button3.setText("MULTIPLY");
		button4.setText("DIVISION");
		button5.setText("Square Root");
		button6.setText("Exponential");
		frame.setVisible(true);
		frame.setSize(400, 200);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);

	}

	int add(int x, int y) {
		int answer = x + y;
		return (answer);
	}

	int subtract(int x, int y) {
		int answer = x - y;
		return (answer);
	}

	int multiply(int x, int y) {
		int answer = x * y;
		return (answer);
	}

	int divide(int x, int y) {
		int answer = x / y;
		return (answer);
	}

	double squareRoot(int x) {
		double answer = Math.sqrt(x);
		return (answer);
	}

	double Exponential(int x, int y) {
		double answer = Math.pow(x, y);
		return (answer);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			String x = text1.getText();
			int x2 = Integer.parseInt(x);
			String z = text2.getText();
			int z2 = Integer.parseInt(z);
			int answer = add(x2, z2);
			String answer2 = String.valueOf(answer);
			label.setText(answer2);
		} else if (buttonPressed == button2) {
			String x = text1.getText();
			int x2 = Integer.parseInt(x);
			String z = text2.getText();
			int z2 = Integer.parseInt(z);
			int answer = subtract(x2, z2);
			String answer2 = String.valueOf(answer);
			label.setText(answer2);
		} else if (buttonPressed == button3) {
			String x = text1.getText();
			int x2 = Integer.parseInt(x);
			String z = text2.getText();
			int z2 = Integer.parseInt(z);
			int answer = multiply(x2, z2);
			String answer2 = String.valueOf(answer);
			label.setText(answer2);
		} else if (buttonPressed == button4) {
			String x = text1.getText();
			int x2 = Integer.parseInt(x);
			String z = text2.getText();
			int z2 = Integer.parseInt(z);
			int answer = divide(x2, z2);
			String answer2 = String.valueOf(answer);
			label.setText(answer2);
		} else if (buttonPressed == button5) {
			String x = text1.getText();
			int x2 = Integer.parseInt(x);
			double answer = squareRoot(x2);
			String answer2 = String.valueOf(answer);
			label.setText(answer2);
		} else if (buttonPressed == button6) {
			String x = text1.getText();
			int x2 = Integer.parseInt(x);
			String z = text2.getText();
			int z2 = Integer.parseInt(z);
			double answer = Exponential(x2, z2);
			String answer2 = String.valueOf(answer);
			label.setText(answer2);
		}
	}
}
