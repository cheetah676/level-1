import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyGui {
	JFrame door;
	JFrame window;
	JPanel panel;
	JButton clicker;
	JButton button;
	void setup() {
		door = new JFrame();
		door.setVisible(true);
		door.setSize(1000, 1000);
		panel = new JPanel();
		door.add(panel);
		clicker=new JButton("Trump is an idiot!");
		panel.add(clicker);
		clicker.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "You are amazing!");
		});
		window = new JFrame();
		window.setVisible(true);
		window.setSize(1000, 1000);
		panel = new JPanel();
		window.add(panel);
		button=new JButton("Trump is an smart!");
		panel.add(clicker);
		button.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "You suck!");
		});
			
	}
}
