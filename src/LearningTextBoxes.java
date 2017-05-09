import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LearningTextBoxes {
	JButton leftButton=new JButton("Trump is stupid");
	JButton rightButton=new JButton("Trump is awesome");
public static void main(String[]args){
LearningTextBoxes Bayleef=new LearningTextBoxes();
Bayleef.newWindow();
}

	void newWindow() {
		JFrame Frame = new JFrame();
		JPanel Panel = new JPanel();
		Frame.add(Panel);
		Frame.setVisible(true);
		Panel.add(leftButton);
		Panel.add(rightButton);
		leftButton.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "Yes he is.  He is also an idiotic git.");
		});
		rightButton.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "You are an idiot.");
		});
		
		Frame.pack();
	}
}