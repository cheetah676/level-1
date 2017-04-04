import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGui {
	JFrame door;
	JPanel panel;

	void setup() {
		door = new JFrame();
		door.setVisible(true);
		door.setSize(1000, 1000);
		panel = new JPanel();
		door.add(panel);
	}
}
