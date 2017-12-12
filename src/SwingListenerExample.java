import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingListenerExample implements ActionListener {
	// 3 add the components
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("1");
	JButton buttonTwo = new JButton("2");

	public static void main(String[] args) {
		// 2 start run method from main
		SwingListenerExample example = new SwingListenerExample();
		example.run();
	}

	// 1 make a run method (this will have most of our code making GUI)
	public void run() {
		// 4 add them together, set visible, and pack
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		frame.pack();
		frame.setVisible(true);
		// 5 add action listeners
		buttonOne.addActionListener(this); // 6 hover red underline, choose implement option
		buttonTwo.addActionListener(this);
		// this method runs wheneveran event is detected
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 8 figure out which component triggered thee event
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == buttonOne) {
			System.out.println("button 1 pressed");
		} else if (buttonPressed == buttonTwo) {
			System.out.println("button 2 pressed");
		}
	}
}
