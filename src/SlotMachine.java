import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	public static void main(String[] args) {
		SlotMachine SM = new SlotMachine();
		SM.start();
	}

	void start() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		frame.add(panel);
		panel.add(button);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.setVisible(true);
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
	}
}
