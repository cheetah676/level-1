import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel winnings = new JLabel();
	int win = 0;

	public static void main(String[] args) {
		SlotMachine SM = new SlotMachine();
		SM.start();
	}

	void start() {
		frame.add(panel);
		panel.add(button);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(winnings);
		winnings.setText("$" + win);
		frame.setVisible(true);
		button.setText("SPIN");
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int num = ran.nextInt(3);
		if (num == 0) {
			label1.setText("money");
		} else if (num == 1) {
			label1.setText("gold");
		} else if (num == 2) {
			label1.setText("poop");
		}
		frame.pack();
		Random ran1 = new Random();
		int num1 = ran.nextInt(3);
		if (num1 == 0) {
			label2.setText("money");
		} else if (num1 == 1) {
			label2.setText("gold");
		} else if (num1 == 2) {
			label2.setText("poop");
		}
		frame.pack();
		Random ran2 = new Random();
		int num2 = ran.nextInt(3);
		if (num2 == 0) {
			label3.setText("money");
		} else if (num2 == 1) {
			label3.setText("gold");
		} else if (num2 == 2) {
			label3.setText("poop");
		}
		frame.pack();
		if (label1.getText().equals("gold") && label2.getText().equals("gold") && label3.getText().equals("gold")) {
			win += 15000000;
			winnings.setText("$" + win);
			frame.pack();
		} else if (label1.getText().equals("money") && label2.getText().equals("money")
				&& label3.getText().equals("money")) {
			win += 11000000;
			winnings.setText("$" + win);
			frame.pack();
		} else if (label1.getText().equals("poop") && label2.getText().equals("poop")
				&& label3.getText().equals("poop")) {
			win -= 20000000;
			winnings.setText("$" + win);
			frame.pack();
		} else {
			win -= 100;
			winnings.setText("$" + win);
			frame.pack();
		}
	}
}
