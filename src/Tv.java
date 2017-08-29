import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tv implements ActionListener {
public static void main(String[]args) {
	Tv tv=new Tv();
	tv.start();
}
public void start() {
	JPanel panel=new JPanel();
	JFrame frame=new JFrame();
	frame.setVisible(true);
	frame.add(panel);
	JButton button=new JButton();
	JButton button2= new JButton();
	JButton button3=new JButton();
	panel.add(button3);
	panel.add(button2);
	panel.add(button);
	button.setText("Duck");
	button2.setText("Frog");
	button3.setText("Unicorn");
	button.addActionListener(
			(e)->{showDucks();});
	button2.addActionListener(
			(e)->{showFrog();});
	button3.addActionListener(
			(e)->{showFluffyUnicorns();});
	frame.pack();
}
void showDucks() {
	playVideo("Drirjl5K9Yk");
}

void showFrog() {
	playVideo("aSjCb-FfxhI");
}

void showFluffyUnicorns() {
	playVideo("qRC4Vk6kisY");
}

void playVideo(String videoID) {
	try {
URI uri = new URI("https://www.youtube.com/watch?v=" + videoID);
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
