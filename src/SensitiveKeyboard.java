import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
public static void main(String[]args) {
	SensitiveKeyboard j=new SensitiveKeyboard();
	j.start();
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }
public void start() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
frame.addKeyListener(this);

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	String pain="The FitnessGram Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues.";
	speak(pain);
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
