import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tweet {
	public static void main(String[]args) {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton button=new JButton();
JLabel label=new JLabel();
frame.setVisible(true);
frame.add(panel);
panel.add(label);
panel.add(button);
label.setText("Tap here to type");
button.setText("Check Twitter");
frame.pack();
	}
	
	
}

