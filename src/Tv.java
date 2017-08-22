import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tv {
public static void main(String[]args) {
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
URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
