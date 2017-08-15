import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public static void main(String[]args){
		BinaryConverter BC=new BinaryConverter();	
		BC.start();
	}
	JPanel panel=new JPanel();
	JFrame frame=new JFrame();
	JTextField answer = new JTextField(20);
	JTextField binary=new JTextField(20);
	public void start(){
		frame.add(panel);
		JButton button=new JButton();
		panel.add(binary);
		panel.add(button);
		panel.add(answer);
		frame.setVisible(true);
		button.setText("CONVERT!");
		button.addActionListener(this);
		frame.pack();	
	}
//int convert(String binary) {
//		if(binary.length() != 8){
//			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
//			return 0;
//		}
//		 if(!Pattern.matches("\2", binary)) {
//			 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
//				return 0;
//		 }
//		try {
//			int asciiValue = Integer.parseInt(binary, 2);
//			return asciiValue;
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
//			//question.setText("");
//			return 0;
//		}
//	}
 String convert(String binary) {
   	 int asciiValue = Integer.parseInt(binary, 2);
   	 char theLetter = (char) asciiValue;
   	 return "" + theLetter;
    }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String A;
	A=binary.getText();
	String B=convert(A);
	answer.setText(B);
}
	}


