import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
static final String FAKE_USERNAME = "bayleef999@gmail.com";
static final String FAKE_PASSWORD = "whyisthe";
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField text = new JTextField("Email Adress");
JButton button1 = new JButton();
JButton button2 = new JButton();

	public static void main(String[] args) {
	Spamalot spam=new Spamalot();
	spam.start();
	}
	void start() {
		panel.add(text);
		button1.setText("BAD");
		button2.setText("GOOD");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String email;
		email=text.getText();
		String good="Hi this is a spam";
		String bad="You are a bad president";
		JButton buttonPressed=(JButton)e.getSource();
		if(buttonPressed==button1) {
			sendSpam(email, "Bad", bad );
		}
		else {
			sendSpam(email, "Good", good);
		}
	}

}
