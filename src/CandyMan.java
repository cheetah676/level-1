import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandyMan implements ActionListener {
	int timesClicked=0;
public static void main(String[]args) {
CandyMan CM=new CandyMan();
CM.run();
}
void run(){
	JPanel panel=new JPanel();
	JFrame frame=new JFrame();
	JButton button=new JButton();
	button.setText("Candyman");
	frame.add(panel);
	panel.add(button);
	button.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	timesClicked+=1;
	if(timesClicked==6) {
	showPictureFromTheInternet("http://pm1.narvii.com/5843/c7d5594b8ed61a1c9405ed6d76bf7c587ff5b89b_hq.jpg");	
	playSound(CREEPY);
	}
	
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
static final int CREEPY = 0;
static final int SCREAM = 1;

public static void playSound(int whichSound) {
File soundFile = null;
	 if (whichSound == CREEPY)
		 soundFile = new File(
				 "/Users/league/Desktop/level-1/src/moo.wav");
	 else if (whichSound == SCREAM)
		 soundFile = new File(
				 "/Users/League/Google Drive/league-sounds/scream.wav");
	 try {
		 AudioInputStream audioInputStream = AudioSystem
				 .getAudioInputStream(soundFile);
		 Clip clip = AudioSystem.getClip();
		 clip.open(audioInputStream);
		 clip.start();
		 Thread.sleep(3400);
	 } catch (Exception ex) {
		 ex.printStackTrace();
	 }
}
}


